import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwp extends cst<der> implements daz {
   public static final MapCodec<cwp> b = b(cwp::new);
   public static final dgv c = cxu.aE;
   public static final dgs d = dgr.C;
   protected static final eiy e = cua.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ui f = ui.c("container.enderchest");

   @Override
   public MapCodec<cwp> a() {
      return b;
   }

   protected cwp(dga.d $$0) {
      super($$0, () -> ddz.d);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cwf.c<? extends dee> a(dgb $$0, cqz $$1, ht $$2, boolean $$3) {
      return cwf.b::b;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.b;
   }

   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ebf.c));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      cgy $$6 = $$3.gf();
      ddx $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof der) {
         ht $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bib.a($$1.B);
         } else if ($$1.B) {
            return bib.a;
         } else {
            der $$9 = (der)$$7;
            $$6.a($$9);
            $$3.a(new bij(($$1x, $$2x, $$3x) -> cfw.a($$1x, $$2x, $$6), f));
            $$3.a(aqn.aj);
            cbo.a($$3, true);
            return bib.b;
         }
      } else {
         return bib.a($$1.B);
      }
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new der($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return $$0.B ? a($$2, ddz.d, der::a) : null;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(js.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      ddx $$4 = $$1.c_($$2);
      if ($$4 instanceof der) {
         ((der)$$4).c();
      }
   }
}
