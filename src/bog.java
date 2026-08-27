import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class bog {
   public static final Path a = Paths.get("debug/profiling");
   public static final String b = "metrics";
   public static final String c = "deviations";
   public static final String d = "profiling.txt";
   private static final Logger e = LogUtils.getLogger();
   private final String f;

   public bog(String $$0) {
      this.f = $$0;
   }

   public Path a(Set<bnv> $$0, Map<bnv, List<boh>> $$1, bmn $$2) {
      try {
         Files.createDirectories(a);
      } catch (IOException var8) {
         throw new UncheckedIOException(var8);
      }

      try {
         Path $$4 = Files.createTempDirectory("minecraft-profiling");
         $$4.toFile().deleteOnExit();
         Files.createDirectories(a);
         Path $$5 = $$4.resolve(this.f);
         Path $$6 = $$5.resolve("metrics");
         this.a($$0, $$6);
         if (!$$1.isEmpty()) {
            this.a($$1, $$5.resolve("deviations"));
         }

         this.a($$2, $$5);
         return $$4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private void a(Set<bnv> $$0, Path $$1) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Expected at least one sampler to persist");
      } else {
         Map<bnu, List<bnv>> $$2 = $$0.stream().collect(Collectors.groupingBy(bnv::e));
         $$2.forEach(($$1x, $$2x) -> this.a($$1x, $$2x, $$1));
      }
   }

   private void a(bnu $$0, List<bnv> $$1, Path $$2) {
      Path $$3 = $$2.resolve(ad.a($$0.a(), akt::b) + ".csv");
      Writer $$4 = null;

      try {
         Files.createDirectories($$3.getParent());
         $$4 = Files.newBufferedWriter($$3, StandardCharsets.UTF_8);
         axm.a $$5 = axm.a();
         $$5.a("@tick");

         for (bnv $$6 : $$1) {
            $$5.a($$6.d());
         }

         axm $$7 = $$5.a($$4);
         List<bnv.b> $$8 = $$1.stream().map(bnv::f).collect(Collectors.toList());
         int $$9 = $$8.stream().mapToInt(bnv.b::a).summaryStatistics().getMin();
         int $$10 = $$8.stream().mapToInt(bnv.b::b).summaryStatistics().getMax();

         for (int $$11 = $$9; $$11 <= $$10; $$11++) {
            int $$12 = $$11;
            Stream<String> $$13 = $$8.stream().map($$1x -> String.valueOf($$1x.a($$12)));
            Object[] $$14 = Stream.concat(Stream.of(String.valueOf($$11)), $$13).toArray(String[]::new);
            $$7.a($$14);
         }

         e.info("Flushed metrics to {}", $$3);
      } catch (Exception var18) {
         e.error("Could not save profiler results to {}", $$3, var18);
      } finally {
         IOUtils.closeQuietly($$4);
      }
   }

   private void a(Map<bnv, List<boh>> $$0, Path $$1) {
      DateTimeFormatter $$2 = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss.SSS", Locale.UK).withZone(ZoneId.systemDefault());
      $$0.forEach(($$2x, $$3) -> $$3.forEach($$3x -> {
            String $$4 = $$2.format($$3x.a);
            Path $$5 = $$1.resolve(ad.a($$2x.d(), akt::b)).resolve(String.format(Locale.ROOT, "%d@%s.txt", $$3x.b, $$4));
            $$3x.c.a($$5);
         }));
   }

   private void a(bmn $$0, Path $$1) {
      $$0.a($$1.resolve("profiling.txt"));
   }
}
