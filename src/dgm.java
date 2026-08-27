import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgm {
   final String a;

   public dgm(String $$0) {
      this.a = $$0;
   }

   public static ahg a(ahf<dgm> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ih<dgm> a(String $$0) {
      return kd.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ih<dgm>, clm>> a = Lists.newArrayList();

      public dgm.a a(ahf<dgm> $$0, clm $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public dgm.a a(ih<dgm> $$0, clm $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dgm.a a(Pair<ih<dgm>, clm> $$0) {
         this.a.add($$0);
         return this;
      }

      public st a() {
         st $$0 = new st();

         for (Pair<ih<dgm>, clm> $$1 : this.a) {
            sn $$2 = new sn();
            $$2.a("Pattern", ((dgm)((ih)$$1.getFirst()).a()).a);
            $$2.a("Color", ((clm)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
