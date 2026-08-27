import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dik {
   final String a;

   public dik(String $$0) {
      this.a = $$0;
   }

   public static aiy a(aix<dik> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ij<dik> a(String $$0) {
      return kf.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ij<dik>, cnn>> a = Lists.newArrayList();

      public dik.a a(aix<dik> $$0, cnn $$1) {
         return this.a(kf.am.f($$0), $$1);
      }

      public dik.a a(ij<dik> $$0, cnn $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dik.a a(Pair<ij<dik>, cnn> $$0) {
         this.a.add($$0);
         return this;
      }

      public tc a() {
         tc $$0 = new tc();

         for (Pair<ij<dik>, cnn> $$1 : this.a) {
            sw $$2 = new sw();
            $$2.a("Pattern", ((dik)((ij)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cnn)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
