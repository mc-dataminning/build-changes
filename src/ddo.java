import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class ddo {
   final String a;

   public ddo(String $$0) {
      this.a = $$0;
   }

   public static afw a(afv<ddo> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ib<ddo> a(String $$0) {
      return jy.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ib<ddo>, cix>> a = Lists.newArrayList();

      public ddo.a a(afv<ddo> $$0, cix $$1) {
         return this.a(jy.am.f($$0), $$1);
      }

      public ddo.a a(ib<ddo> $$0, cix $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public ddo.a a(Pair<ib<ddo>, cix> $$0) {
         this.a.add($$0);
         return this;
      }

      public rz a() {
         rz $$0 = new rz();

         for (Pair<ib<ddo>, cix> $$1 : this.a) {
            rt $$2 = new rt();
            $$2.a("Pattern", ((ddo)((ib)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cix)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
