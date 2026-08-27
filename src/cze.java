import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cze {
   final String a;

   public cze(String $$0) {
      this.a = $$0;
   }

   public static acq a(acp<cze> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static he<cze> a(String $$0) {
      return jb.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<he<cze>, cen>> a = Lists.newArrayList();

      public cze.a a(acp<cze> $$0, cen $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public cze.a a(he<cze> $$0, cen $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public cze.a a(Pair<he<cze>, cen> $$0) {
         this.a.add($$0);
         return this;
      }

      public qx a() {
         qx $$0 = new qx();

         for (Pair<he<cze>, cen> $$1 : this.a) {
            qr $$2 = new qr();
            $$2.a("Pattern", ((cze)((he)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cen)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
