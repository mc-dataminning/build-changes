import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bxi {
   void a(bxf var1, daa var2);

   daa a(bxf var1);

   void a(bxf var1, float var2);

   default void a(bxh $$0, fam $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(alj<fao> $$0, fam $$1, Map<bxf, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(alj<fao> $$0, fam $$1, long $$2, Map<bxf, Float> $$3) {
      fao $$4 = $$1.a().p().bc().b($$0);
      if ($$4 != fao.f) {
         List<daa> $$5 = $$4.a($$1, $$2);
         List<bxf> $$6 = new ArrayList<>();

         for (daa $$7 : $$5) {
            bxf $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               daa $$9 = $$8.a($$7);
               this.a($$8, $$9);
               Float $$10 = $$3.get($$8);
               if ($$10 != null) {
                  this.a($$8, $$10);
               }

               $$6.add($$8);
            }
         }
      }
   }

   @Nullable
   default bxf a(daa $$0, List<bxf> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dij $$2 = $$0.a(kl.D);
         if ($$2 != null) {
            bxf $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bxf.a)) {
            return bxf.a;
         }

         return null;
      }
   }
}
