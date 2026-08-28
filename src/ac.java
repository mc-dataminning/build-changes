import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.VirtualMemory;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;

public class ac {
   public static final long a = 1048576L;
   private static final long b = 1000000000L;
   private static final Logger c = LogUtils.getLogger();
   private static final String d = System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version");
   private static final String e = System.getProperty("java.version") + ", " + System.getProperty("java.vendor");
   private static final String f = System.getProperty("java.vm.name")
      + " ("
      + System.getProperty("java.vm.info")
      + "), "
      + System.getProperty("java.vm.vendor");
   private final Map<String, String> g = Maps.newLinkedHashMap();

   public ac() {
      this.a("Minecraft Version", ab.b().c());
      this.a("Minecraft Version ID", ab.b().b());
      this.a("Operating System", d);
      this.a("Java Version", e);
      this.a("Java VM Version", f);
      this.a("Memory", () -> {
         Runtime $$0 = Runtime.getRuntime();
         long $$1 = $$0.maxMemory();
         long $$2 = $$0.totalMemory();
         long $$3 = $$0.freeMemory();
         long $$4 = $$1 / 1048576L;
         long $$5 = $$2 / 1048576L;
         long $$6 = $$3 / 1048576L;
         return $$3 + " bytes (" + $$6 + " MiB) / " + $$2 + " bytes (" + $$5 + " MiB) up to " + $$1 + " bytes (" + $$4 + " MiB)";
      });
      this.a("CPUs", () -> String.valueOf(Runtime.getRuntime().availableProcessors()));
      this.a("hardware", () -> this.a(new SystemInfo()));
      this.a("JVM Flags", () -> {
         List<String> $$0 = ad.l().collect(Collectors.toList());
         return String.format(Locale.ROOT, "%d total; %s", $$0.size(), String.join(" ", $$0));
      });
   }

   public void a(String $$0, String $$1) {
      this.g.put($$0, $$1);
   }

   public void a(String $$0, Supplier<String> $$1) {
      try {
         this.a($$0, $$1.get());
      } catch (Exception var4) {
         c.warn("Failed to get system info for {}", $$0, var4);
         this.a($$0, "ERR");
      }
   }

   private void a(SystemInfo $$0) {
      HardwareAbstractionLayer $$1 = $$0.getHardware();
      this.a("processor", () -> this.a($$1.getProcessor()));
      this.a("graphics", () -> this.b($$1.getGraphicsCards()));
      this.a("memory", () -> this.a($$1.getMemory()));
      this.a("storage", this::b);
   }

   private void a(String $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var4) {
         c.warn("Failed retrieving info for group {}", $$0, var4);
      }
   }

   public static float a(long $$0) {
      return (float)$$0 / 1048576.0F;
   }

   private void a(List<PhysicalMemory> $$0) {
      int $$1 = 0;

      for (PhysicalMemory $$2 : $$0) {
         String $$3 = String.format(Locale.ROOT, "Memory slot #%d ", $$1++);
         this.a($$3 + "capacity (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$2.getCapacity())));
         this.a($$3 + "clockSpeed (GHz)", () -> String.format(Locale.ROOT, "%.2f", (float)$$2.getClockSpeed() / 1.0E9F));
         this.a($$3 + "type", $$2::getMemoryType);
      }
   }

   private void a(VirtualMemory $$0) {
      this.a("Virtual memory max (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$0.getVirtualMax())));
      this.a("Virtual memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$0.getVirtualInUse())));
      this.a("Swap memory total (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$0.getSwapTotal())));
      this.a("Swap memory used (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$0.getSwapUsed())));
   }

   private void a(GlobalMemory $$0) {
      this.a("physical memory", () -> this.a($$0.getPhysicalMemory()));
      this.a("virtual memory", () -> this.a($$0.getVirtualMemory()));
   }

   private void b(List<GraphicsCard> $$0) {
      int $$1 = 0;

      for (GraphicsCard $$2 : $$0) {
         String $$3 = String.format(Locale.ROOT, "Graphics card #%d ", $$1++);
         this.a($$3 + "name", $$2::getName);
         this.a($$3 + "vendor", $$2::getVendor);
         this.a($$3 + "VRAM (MiB)", () -> String.format(Locale.ROOT, "%.2f", a($$2.getVRam())));
         this.a($$3 + "deviceId", $$2::getDeviceId);
         this.a($$3 + "versionInfo", $$2::getVersionInfo);
      }
   }

   private void a(CentralProcessor $$0) {
      ProcessorIdentifier $$1 = $$0.getProcessorIdentifier();
      this.a("Processor Vendor", $$1::getVendor);
      this.a("Processor Name", $$1::getName);
      this.a("Identifier", $$1::getIdentifier);
      this.a("Microarchitecture", $$1::getMicroarchitecture);
      this.a("Frequency (GHz)", () -> String.format(Locale.ROOT, "%.2f", (float)$$1.getVendorFreq() / 1.0E9F));
      this.a("Number of physical packages", () -> String.valueOf($$0.getPhysicalPackageCount()));
      this.a("Number of physical CPUs", () -> String.valueOf($$0.getPhysicalProcessorCount()));
      this.a("Number of logical CPUs", () -> String.valueOf($$0.getLogicalProcessorCount()));
   }

   private void b() {
      this.a("jna.tmpdir");
      this.a("org.lwjgl.system.SharedLibraryExtractPath");
      this.a("io.netty.native.workdir");
      this.a("java.io.tmpdir");
      this.b("workdir", () -> "");
   }

   private void a(String $$0) {
      this.b($$0, () -> System.getProperty($$0));
   }

   private void b(String $$0, Supplier<String> $$1) {
      String $$2 = "Space in storage for " + $$0 + " (MiB)";

      try {
         String $$3 = $$1.get();
         if ($$3 == null) {
            this.a($$2, "<path not set>");
            return;
         }

         FileStore $$4 = Files.getFileStore(Path.of($$3));
         this.a($$2, String.format(Locale.ROOT, "available: %.2f, total: %.2f", a($$4.getUsableSpace()), a($$4.getTotalSpace())));
      } catch (InvalidPathException var6) {
         c.warn("{} is not a path", $$0, var6);
         this.a($$2, "<invalid path>");
      } catch (Exception var7) {
         c.warn("Failed retrieving storage space for {}", $$0, var7);
         this.a($$2, "ERR");
      }
   }

   public void a(StringBuilder $$0) {
      $$0.append("-- ").append("System Details").append(" --\n");
      $$0.append("Details:");
      this.g.forEach(($$1, $$2) -> {
         $$0.append("\n\t");
         $$0.append($$1);
         $$0.append(": ");
         $$0.append($$2);
      });
   }

   public String a() {
      return this.g.entrySet().stream().map($$0 -> $$0.getKey() + ": " + $$0.getValue()).collect(Collectors.joining(System.lineSeparator()));
   }
}
