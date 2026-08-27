import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dch {
   final String a;

   public dch(String $$0) {
      this.a = $$0;
   }

   public static aeu a(aet<dch> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static hg<dch> a(String $$0) {
      return jd.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<hg<dch>, cho>> a = Lists.newArrayList();

      public dch.a a(aet<dch> $$0, cho $$1) {
         return this.a(jd.al.f($$0), $$1);
      }

      public dch.a a(hg<dch> $$0, cho $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dch.a a(Pair<hg<dch>, cho> $$0) {
         this.a.add($$0);
         return this;
      }

      public ra a() {
         ra $$0 = new ra();

         for (Pair<hg<dch>, cho> $$1 : this.a) {
            qu $$2 = new qu();
            $$2.a("Pattern", ((dch)((hg)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cho)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
