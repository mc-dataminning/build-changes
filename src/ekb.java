import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ekb(List<ejq> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akq c = akq.b("jigsaw");
   private static final Map<akq, akq> d = ImmutableMap.builder()
      .put(akq.b("nvi"), c)
      .put(akq.b("pcp"), c)
      .put(akq.b("bastionremnant"), c)
      .put(akq.b("runtime"), c)
      .build();

   public ekb(final List<ejq> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(jd $$0) {
      for (ejq $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public ux a(ekc $$0) {
      ug $$1 = new ug();

      for (ejq $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ekb a(ug $$0, ekc $$1) {
      List<ejq> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ua $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akq $$6 = akq.a($$5);
         akq $$7 = d.getOrDefault($$6, $$6);
         ekd $$8 = lt.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ejq $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ekb($$2);
   }

   public eje b() {
      return ejq.a(this.a.stream());
   }

   public List<ejq> c() {
      return this.a;
   }
}
