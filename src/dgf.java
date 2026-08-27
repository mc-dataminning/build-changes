import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dgf {
   final String a;

   public dgf(String $$0) {
      this.a = $$0;
   }

   public static ahd a(ahc<dgf> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ih<dgf> a(String $$0) {
      return kd.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ih<dgf>, clf>> a = Lists.newArrayList();

      public dgf.a a(ahc<dgf> $$0, clf $$1) {
         return this.a(kd.am.f($$0), $$1);
      }

      public dgf.a a(ih<dgf> $$0, clf $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dgf.a a(Pair<ih<dgf>, clf> $$0) {
         this.a.add($$0);
         return this;
      }

      public sr a() {
         sr $$0 = new sr();

         for (Pair<ih<dgf>, clf> $$1 : this.a) {
            sl $$2 = new sl();
            $$2.a("Pattern", ((dgf)((ih)$$1.getFirst()).a()).a);
            $$2.a("Color", ((clf)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
