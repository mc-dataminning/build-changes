import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dfu {
   final String a;

   public dfu(String $$0) {
      this.a = $$0;
   }

   public static agt a(ags<dfu> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ie<dfu> a(String $$0) {
      return kb.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ie<dfu>, ckv>> a = Lists.newArrayList();

      public dfu.a a(ags<dfu> $$0, ckv $$1) {
         return this.a(kb.am.f($$0), $$1);
      }

      public dfu.a a(ie<dfu> $$0, ckv $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dfu.a a(Pair<ie<dfu>, ckv> $$0) {
         this.a.add($$0);
         return this;
      }

      public sp a() {
         sp $$0 = new sp();

         for (Pair<ie<dfu>, ckv> $$1 : this.a) {
            sj $$2 = new sj();
            $$2.a("Pattern", ((dfu)((ie)$$1.getFirst()).a()).a);
            $$2.a("Color", ((ckv)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
