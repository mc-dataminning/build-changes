import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcm {
   final String a;

   public dcm(String $$0) {
      this.a = $$0;
   }

   public static aew a(aev<dcm> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static he<dcm> a(String $$0) {
      return jb.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<he<dcm>, cht>> a = Lists.newArrayList();

      public dcm.a a(aev<dcm> $$0, cht $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public dcm.a a(he<dcm> $$0, cht $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcm.a a(Pair<he<dcm>, cht> $$0) {
         this.a.add($$0);
         return this;
      }

      public rc a() {
         rc $$0 = new rc();

         for (Pair<he<dcm>, cht> $$1 : this.a) {
            qw $$2 = new qw();
            $$2.a("Pattern", ((dcm)((he)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cht)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
