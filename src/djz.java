import com.mojang.serialization.MapCodec;

public class djz extends djm {
   public static final MapCodec<djz> a = b(djz::new);
   public static final int b = 6;
   public static final dxw c = dxn.aB;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fbu[] g = new fbu[]{
      djm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djm.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   protected djz(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      cwl $$7 = $$0.h();
      if ($$0.a(awy.aN) && $$1.c(c) == 0 && djm.a($$7) instanceof dkc $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awa.dt, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dkd.a($$8));
         $$2.a($$4, ebt.c, $$3);
         $$4.b(awk.c.b($$7));
         return bsj.a;
      } else {
         return bsj.f;
      }
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsj.a;
         }

         if ($$3.b(bsi.a).f()) {
            return bsj.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsj a(dgj $$0, ji $$1, dwx $$2, cox $$3) {
      if (!$$3.u(false)) {
         return bsj.e;
      } else {
         $$3.a(awk.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ebt.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ebt.f, $$1);
         }

         return bsj.a;
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
