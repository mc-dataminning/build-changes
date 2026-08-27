import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcq {
   final String a;

   public dcq(String $$0) {
      this.a = $$0;
   }

   public static aez a(aey<dcq> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static he<dcq> a(String $$0) {
      return jb.am.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<he<dcq>, chz>> a = Lists.newArrayList();

      public dcq.a a(aey<dcq> $$0, chz $$1) {
         return this.a(jb.am.f($$0), $$1);
      }

      public dcq.a a(he<dcq> $$0, chz $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcq.a a(Pair<he<dcq>, chz> $$0) {
         this.a.add($$0);
         return this;
      }

      public rc a() {
         rc $$0 = new rc();

         for (Pair<he<dcq>, chz> $$1 : this.a) {
            qw $$2 = new qw();
            $$2.a("Pattern", ((dcq)((he)$$1.getFirst()).a()).a);
            $$2.a("Color", ((chz)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
