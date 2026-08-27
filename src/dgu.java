import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgu {
   final String a;

   public dgu(String $$0) {
      this.a = $$0;
   }

   public static ahh a(ahg<dgu> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ih<dgu> a(String $$0) {
      return kd.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ih<dgu>, clv>> a = Lists.newArrayList();

      public dgu.a a(ahg<dgu> $$0, clv $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public dgu.a a(ih<dgu> $$0, clv $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dgu.a a(Pair<ih<dgu>, clv> $$0) {
         this.a.add($$0);
         return this;
      }

      public su a() {
         su $$0 = new su();

         for (Pair<ih<dgu>, clv> $$1 : this.a) {
            so $$2 = new so();
            $$2.a("Pattern", ((dgu)((ih)$$1.getFirst()).a()).a);
            $$2.a("Color", ((clv)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
