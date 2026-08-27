import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public final class bib implements DynamicMBean {
   private static final Logger a = LogUtils.getLogger();
   private final MinecraftServer b;
   private final MBeanInfo c;
   private final Map<String, bib.a> d = Stream.of(
         new bib.a("tickTimes", this::b, "Historical tick times (ms)", long[].class),
         new bib.a("averageTickTime", this::a, "Current average tick time (ms)", long.class)
      )
      .collect(Collectors.toMap($$0x -> $$0x.a, Function.identity()));

   private bib(MinecraftServer $$0) {
      this.b = $$0;
      MBeanAttributeInfo[] $$1 = this.d.values().stream().map(bib.a::a).toArray(MBeanAttributeInfo[]::new);
      this.c = new MBeanInfo(bib.class.getSimpleName(), "metrics for dedicated server", $$1, null, null, new MBeanNotificationInfo[0]);
   }

   public static void a(MinecraftServer $$0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new bib($$0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException var2) {
         a.warn("Failed to initialise server as JMX bean", var2);
      }
   }

   private float a() {
      return this.b.aN();
   }

   private long[] b() {
      return this.b.aQ();
   }

   @Nullable
   @Override
   public Object getAttribute(String $$0) {
      bib.a $$1 = this.d.get($$0);
      return $$1 == null ? null : $$1.b.get();
   }

   @Override
   public void setAttribute(Attribute $$0) {
   }

   @Override
   public AttributeList getAttributes(String[] $$0) {
      List<Attribute> $$1 = Arrays.stream($$0)
         .map(this.d::get)
         .filter(Objects::nonNull)
         .map($$0x -> new Attribute($$0x.a, $$0x.b.get()))
         .collect(Collectors.toList());
      return new AttributeList($$1);
   }

   @Override
   public AttributeList setAttributes(AttributeList $$0) {
      return new AttributeList();
   }

   @Nullable
   @Override
   public Object invoke(String $$0, Object[] $$1, String[] $$2) {
      return null;
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.c;
   }

   static final class a {
      final String a;
      final Supplier<Object> b;
      private final String c;
      private final Class<?> d;

      a(String $$0, Supplier<Object> $$1, String $$2, Class<?> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private MBeanAttributeInfo a() {
         return new MBeanAttributeInfo(this.a, this.d.getSimpleName(), this.c, true, false, false);
      }
   }
}
