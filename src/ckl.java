import java.util.function.Consumer;

public class ckl extends cmt {
   public ckl(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ic $$1 = $$0.k();
      if ($$1 == ic.a) {
         return bkb.e;
      } else {
         ctp $$2 = $$0.q();
         cph $$3 = new cph($$0);
         hx $$4 = $$3.a();
         cmy $$5 = $$0.n();
         elt $$6 = elt.c($$4);
         elo $$7 = blz.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof and $$8) {
               Consumer<cbk> $$9 = blz.a($$8, $$5, $$0.o());
               cbk $$10 = blz.d.b($$8, $$5.v(), $$9, $$4, bmp.m, true, true);
               if ($$10 == null) {
                  return bkb.e;
               }

               float $$11 = (float)auo.d((auo.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), ars.ao, art.e, 0.75F, 0.8F);
               $$10.a(dnr.t, $$0.o());
            }

            $$5.h(1);
            return bkb.a($$2.B);
         } else {
            return bkb.e;
         }
      }
   }
}
