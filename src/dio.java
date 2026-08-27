import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dio {
   final String a;

   public dio(String $$0) {
      this.a = $$0;
   }

   public static aiy a(aix<dio> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ij<dio> a(String $$0) {
      return kf.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ij<dio>, cnr>> a = Lists.newArrayList();

      public dio.a a(aix<dio> $$0, cnr $$1) {
         return this.a(kf.am.f($$0), $$1);
      }

      public dio.a a(ij<dio> $$0, cnr $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dio.a a(Pair<ij<dio>, cnr> $$0) {
         this.a.add($$0);
         return this;
      }

      public tc a() {
         tc $$0 = new tc();

         for (Pair<ij<dio>, cnr> $$1 : this.a) {
            sw $$2 = new sw();
            $$2.a("Pattern", ((dio)((ij)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cnr)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
