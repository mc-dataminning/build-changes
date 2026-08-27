import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dco {
   final String a;

   public dco(String $$0) {
      this.a = $$0;
   }

   public static aey a(aex<dco> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static hg<dco> a(String $$0) {
      return jd.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<hg<dco>, chv>> a = Lists.newArrayList();

      public dco.a a(aex<dco> $$0, chv $$1) {
         return this.a(jd.al.f($$0), $$1);
      }

      public dco.a a(hg<dco> $$0, chv $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dco.a a(Pair<hg<dco>, chv> $$0) {
         this.a.add($$0);
         return this;
      }

      public re a() {
         re $$0 = new re();

         for (Pair<hg<dco>, chv> $$1 : this.a) {
            qy $$2 = new qy();
            $$2.a("Pattern", ((dco)((hg)$$1.getFirst()).a()).a);
            $$2.a("Color", ((chv)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
