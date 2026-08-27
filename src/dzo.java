import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record dzo(List<dzd> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final ahd c = new ahd("jigsaw");
   private static final Map<ahd, ahd> d = ImmutableMap.builder()
      .put(new ahd("nvi"), c)
      .put(new ahd("pcp"), c)
      .put(new ahd("bastionremnant"), c)
      .put(new ahd("runtime"), c)
      .build();

   public dzo(List<dzd> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(hx $$0) {
      for (dzd $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ti a(dzp $$0) {
      sr $$1 = new sr();

      for (dzd $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static dzo a(sr $$0, dzp $$1) {
      List<dzd> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         sl $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         ahd $$6 = new ahd($$5);
         ahd $$7 = d.getOrDefault($$6, $$6);
         dzq $$8 = kd.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               dzd $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new dzo($$2);
   }

   public dyr b() {
      return dzd.a(this.a.stream());
   }

   public List<dzd> c() {
      return this.a;
   }
}
