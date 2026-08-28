import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmm extends dhp implements dfk, dmi {
   public static final MapCodec<dmm> c = b(dmm::new);
   private static final dtb g = dta.C;
   public static final dte d = dta.R;
   protected static final float e = 6.0F;
   protected static final ewy f = dfh.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   public dmm(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtg.b).a(g, Boolean.valueOf(false)).a(d, jf.c));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return f;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(avw.bx) || $$1.b_($$2.c()).a(eoi.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      if (!$$0.x_()) {
         ja $$5 = $$1.c();
         dsk $$6 = dhp.c($$0, $$5, this.o().a(b, dtg.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(g) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      if ($$0.c(b) == dtg.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ja $$3 = $$2.d();
         dsk $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      if ($$3.c(dhp.b) == dtg.b) {
         ja $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dfe.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ja $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
