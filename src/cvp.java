import java.util.List;
import javax.annotation.Nullable;

public class cvp extends cxd {
   private final bvi<? extends cro> a;

   public cvp(bvi<? extends cro> $$0, cxd.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      fbv $$4 = a($$0, $$1, dgi.b.c);
      if ($$4.d() == fbv.a.a) {
         return bsy.e;
      } else {
         fbx $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bva> $$7 = $$0.a($$1, $$1.cQ().b($$5.c(5.0)).g(1.0), bvg.h);
         if (!$$7.isEmpty()) {
            fbx $$8 = $$1.bD();

            for (bva $$9 : $$7) {
               fbs $$10 = $$9.cQ().g((double)$$9.bR());
               if ($$10.d($$8)) {
                  return bsy.e;
               }
            }
         }

         if ($$4.d() == fbv.a.b) {
            cro $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bsy.d;
            } else {
               $$11.w($$1.dK());
               if (!$$0.a($$11, $$11.cQ())) {
                  return bsy.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ecp.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awk.c.b(this));
                  return bsy.a;
               }
            }
         } else {
            return bsy.e;
         }
      }
   }

   @Nullable
   private cro a(dgz $$0, fbv $$1, cxh $$2, cpr $$3) {
      cro $$4 = this.a.a($$0, bvh.m);
      if ($$4 != null) {
         fbx $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ard $$6) {
            bvi.<cro>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
