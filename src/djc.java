import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class djc {
   final String a;

   public djc(String $$0) {
      this.a = $$0;
   }

   public static ajc a(ajb<djc> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static il<djc> a(String $$0) {
      return kh.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<il<djc>, cog>> a = Lists.newArrayList();

      public djc.a a(ajb<djc> $$0, cog $$1) {
         return this.a(kh.am.f($$0), $$1);
      }

      public djc.a a(il<djc> $$0, cog $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public djc.a a(Pair<il<djc>, cog> $$0) {
         this.a.add($$0);
         return this;
      }

      public te a() {
         te $$0 = new te();

         for (Pair<il<djc>, cog> $$1 : this.a) {
            sy $$2 = new sy();
            $$2.a("Pattern", ((djc)((il)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cog)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
