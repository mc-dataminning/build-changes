import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcd {
   final String a;

   public dcd(String $$0) {
      this.a = $$0;
   }

   public static aer a(aeq<dcd> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static he<dcd> a(String $$0) {
      return jb.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<he<dcd>, chm>> a = Lists.newArrayList();

      public dcd.a a(aeq<dcd> $$0, chm $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public dcd.a a(he<dcd> $$0, chm $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcd.a a(Pair<he<dcd>, chm> $$0) {
         this.a.add($$0);
         return this;
      }

      public qx a() {
         qx $$0 = new qx();

         for (Pair<he<dcd>, chm> $$1 : this.a) {
            qr $$2 = new qr();
            $$2.a("Pattern", ((dcd)((he)$$1.getFirst()).a()).a);
            $$2.a("Color", ((chm)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
