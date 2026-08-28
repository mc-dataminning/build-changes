import com.mojang.serialization.MapCodec;

public class doc extends dgh implements dgb {
   public static final MapCodec<doc> a = b(doc::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final duc c = dts.as;
   private static final exv e = dfy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final exv f = dfy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(cut.wu);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dtc $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dxz.c, $$2, dxz.a.a($$5));
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3 instanceof btn && $$3.am() != bsx.Q && $$3.am() != bsx.h) {
         $$3.a($$0, new exc(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.dt() || $$3.af != $$3.dz())) {
            double $$4 = Math.abs($$3.dt() - $$3.ad);
            double $$5 = Math.abs($$3.dz() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().t(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cut.ry) ? bqt.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cuq(cut.wu, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avp.zs, avq.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dtc $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dxz.c, $$2, dxz.a.a($$3, $$8));
         return bqr.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
