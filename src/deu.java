import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class deu {
   final String a;

   public deu(String $$0) {
      this.a = $$0;
   }

   public static agi a(agh<deu> $$0, boolean $$1) {
      String $$2 = $$1 ? "banner" : "shield";
      return $$0.a().d("entity/" + $$2 + "/");
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public static ib<deu> a(String $$0) {
      return jy.an.h().filter($$1 -> $$1.a().a.equals($$0)).findAny().orElse(null);
   }

   public static class a {
      private final List<Pair<ib<deu>, cjx>> a = Lists.newArrayList();

      public deu.a a(agh<deu> $$0, cjx $$1) {
         return this.a(jy.an.f($$0), $$1);
      }

      public deu.a a(ib<deu> $$0, cjx $$1) {
         return this.a(Pair.of($$0, $$1));
      }

      public deu.a a(Pair<ib<deu>, cjx> $$0) {
         this.a.add($$0);
         return this;
      }

      public sf a() {
         sf $$0 = new sf();

         for (Pair<ib<deu>, cjx> $$1 : this.a) {
            rz $$2 = new rz();
            $$2.a("Pattern", ((deu)((ib)$$1.getFirst()).a()).a);
            $$2.a("Color", ((cjx)$$1.getSecond()).a());
            $$0.add($$2);
         }

         return $$0;
      }
   }
}
