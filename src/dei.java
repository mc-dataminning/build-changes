import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dei {
   final String a;

   public dei(String $$0) {
      this.a = $$0;
   }

   public static agg a(agf<dei> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ib<dei> a(String $$0) {
      return jy.an.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ib<dei>, cjp>> a = Lists.newArrayList();

      public dei.a a(agf<dei> $$0, cjp $$1) {
         return this.a(jy.an.f($$0), $$1);
      }

      public dei.a a(ib<dei> $$0, cjp $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dei.a a(Pair<ib<dei>, cjp> $$0) {
         this.a.add($$0);
         return this;
      }

      public sf a() {
         sf $$0 = new sf();

         for (Pair<ib<dei>, cjp> $$1 : this.a) {
            rz $$2 = new rz();
            $$2.a("Pattern", ((dei)((ib)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cjp)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
