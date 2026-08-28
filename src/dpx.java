import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dly<dzc> implements dup {
   public static final MapCodec<dpx> b = b(dpx::new);
   public static final ece<jc> c = drf.e;
   public static final ebx d = ebw.I;
   private static final fgm e = dne.b(14.0, 0.0, 14.0);
   private static final xc f = xc.c("container.enderchest");

   @Override
   public MapCodec<dpx> a() {
      return b;
   }

   protected dpx(ebf.d $$0) {
      super($$0, () -> dyg.d);
      this.l(this.C.b().b(c, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dpm.c<? extends dym> a(ebg $$0, djz $$1, iw $$2, boolean $$3) {
      return dpm.b::b;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e;
   }

   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == exr.c));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      cxg $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dzc $$7) {
         iw $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return but.a;
         } else {
            if ($$1 instanceof aru $$10) {
               $$5.a($$7);
               $$3.a(new bvb(($$1x, $$2x, $$3x) -> cwb.a($$1x, $$2x, $$5), f));
               $$3.a(axb.aj);
               cqp.a($$10, $$3, true);
            }

            return but.a;
         }
      } else {
         return but.a;
      }
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? a($$2, dyg.d, dzc::a) : null;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lz.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(d) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dye $$4 = $$1.c_($$2);
      if ($$4 instanceof dzc) {
         ((dzc)$$4).a();
      }
   }
}
