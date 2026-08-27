import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dez {
   final String a;

   public dez(String $$0) {
      this.a = $$0;
   }

   public static agm a(agl<dez> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ig<dez> a(String $$0) {
      return kc.an.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ig<dez>, ckc>> a = Lists.newArrayList();

      public dez.a a(agl<dez> $$0, ckc $$1) {
         return this.a(kc.an.f($$0), $$1);
      }

      public dez.a a(ig<dez> $$0, ckc $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dez.a a(Pair<ig<dez>, ckc> $$0) {
         this.a.add($$0);
         return this;
      }

      public sj a() {
         sj $$0 = new sj();

         for (Pair<ig<dez>, ckc> $$1 : this.a) {
            sd $$2 = new sd();
            $$2.a("Pattern", ((dez)((ig)$$1.getFirst()).a()).a);
            $$2.a("Color", ((ckc)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
