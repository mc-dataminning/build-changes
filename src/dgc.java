import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends dbq {
   public static final MapCodec<dgc> c = b(dgc::new);

   @Override
   public MapCodec<dgc> a() {
      return c;
   }

   protected dgc(dpx.d $$0) {
      super($$0);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$0, $$2, dnf.a);
   }

   @Override
   protected void a(czu $$0, im $$1, ckl $$2) {
      dnd $$3 = $$0.c_($$1);
      if ($$3 instanceof dnz) {
         $$2.a((bou)$$3);
         $$2.a(avj.am);
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, auz.jT, ava.e, 1.0F, 1.0F, false);
         }

         ir $$7 = $$0.c(a);
         ir.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ir.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ir.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kw.ab, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(kw.E, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
