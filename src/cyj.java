import java.util.List;
import javax.annotation.Nullable;

public class cyj extends czw {
   private final bxe<? extends cuk> a;

   public cyj(bxe<? extends cuk> $$0, czw.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      ffq $$4 = a($$0, $$1, djg.b.c);
      if ($$4.d() == ffq.a.a) {
         return but.e;
      } else {
         ffs $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwv> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bxc.h);
         if (!$$7.isEmpty()) {
            ffs $$8 = $$1.bD();

            for (bwv $$9 : $$7) {
               ffn $$10 = $$9.cR().g((double)$$9.bR());
               if ($$10.d($$8)) {
                  return but.e;
               }
            }
         }

         if ($$4.d() == ffq.a.b) {
            cuk $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return but.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return but.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, egg.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axb.c.b(this));
                  return but.a;
               }
            }
         } else {
            return but.e;
         }
      }
   }

   @Nullable
   private cuk a(djz $$0, ffq $$1, daa $$2, crz $$3) {
      cuk $$4 = this.a.a($$0, bxd.m);
      if ($$4 != null) {
         ffs $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof aru $$6) {
            bxe.<cuk>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
