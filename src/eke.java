import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eke(List<ejt> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akr c = akr.b("jigsaw");
   private static final Map<akr, akr> d = ImmutableMap.builder()
      .put(akr.b("nvi"), c)
      .put(akr.b("pcp"), c)
      .put(akr.b("bastionremnant"), c)
      .put(akr.b("runtime"), c)
      .build();

   public eke(final List<ejt> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jd $$0) {
      for (ejt $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uy a(ekf $$0) {
      uh $$1 = new uh();

      for (ejt $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eke a(uh $$0, ekf $$1) {
      List<ejt> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ub $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akr $$6 = akr.a($$5);
         akr $$7 = d.getOrDefault($$6, $$6);
         ekg $$8 = lt.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ejt $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eke($$2);
   }

   public ejh b() {
      return ejt.a(this.a.stream());
   }

   public List<ejt> c() {
      return this.a;
   }
}
