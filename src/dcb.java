import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcb {
   final String a;

   public dcb(String $$0) {
      this.a = $$0;
   }

   public static aep a(aeo<dcb> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static hf<dcb> a(String $$0) {
      return jc.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<hf<dcb>, chk>> a = Lists.newArrayList();

      public dcb.a a(aeo<dcb> $$0, chk $$1) {
         return this.a(jc.al.f($$0), $$1);
      }

      public dcb.a a(hf<dcb> $$0, chk $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcb.a a(Pair<hf<dcb>, chk> $$0) {
         this.a.add($$0);
         return this;
      }

      public qy a() {
         qy $$0 = new qy();

         for (Pair<hf<dcb>, chk> $$1 : this.a) {
            qs $$2 = new qs();
            $$2.a("Pattern", ((dcb)((hf)$$1.getFirst()).a()).a);
            $$2.a("Color", ((chk)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
