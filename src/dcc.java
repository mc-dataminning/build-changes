import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcc {
   final String a;

   public dcc(String $$0) {
      this.a = $$0;
   }

   public static aer a(aeq<dcc> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static he<dcc> a(String $$0) {
      return jb.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<he<dcc>, chl>> a = Lists.newArrayList();

      public dcc.a a(aeq<dcc> $$0, chl $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public dcc.a a(he<dcc> $$0, chl $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcc.a a(Pair<he<dcc>, chl> $$0) {
         this.a.add($$0);
         return this;
      }

      public qx a() {
         qx $$0 = new qx();

         for (Pair<he<dcc>, chl> $$1 : this.a) {
            qr $$2 = new qr();
            $$2.a("Pattern", ((dcc)((he)$$1.getFirst()).a()).a);
            $$2.a("Color", ((chl)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
