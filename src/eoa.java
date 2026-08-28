import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eoa(List<enp> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akv c = akv.b("jigsaw");
   private static final Map<akv, akv> d = ImmutableMap.builder()
      .put(akv.b("nvi"), c)
      .put(akv.b("pcp"), c)
      .put(akv.b("bastionremnant"), c)
      .put(akv.b("runtime"), c)
      .build();

   public eoa(final List<enp> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ji $$0) {
      for (enp $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public un a(eob $$0) {
      tw $$1 = new tw();

      for (enp $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eoa a(tw $$0, eob $$1) {
      List<enp> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akv $$6 = akv.a($$5);
         akv $$7 = d.getOrDefault($$6, $$6);
         eoc $$8 = mb.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               enp $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eoa($$2);
   }

   public end b() {
      return enp.a(this.a.stream());
   }

   public List<enp> c() {
      return this.a;
   }
}
