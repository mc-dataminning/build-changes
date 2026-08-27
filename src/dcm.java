import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class dcm {
   final String a;

   public dcm(String $$0) {
      this.a = $$0;
   }

   public static aex a(aew<dcm> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static hg<dcm> a(String $$0) {
      return jd.al.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<hg<dcm>, cht>> a = Lists.newArrayList();

      public dcm.a a(aew<dcm> $$0, cht $$1) {
         return this.a(jd.al.f($$0), $$1);
      }

      public dcm.a a(hg<dcm> $$0, cht $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public dcm.a a(Pair<hg<dcm>, cht> $$0) {
         this.a.add($$0);
         return this;
      }

      public rd a() {
         rd $$0 = new rd();

         for (Pair<hg<dcm>, cht> $$1 : this.a) {
            qx $$2 = new qx();
            $$2.a("Pattern", ((dcm)((hg)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cht)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
