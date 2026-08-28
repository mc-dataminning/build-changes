import com.mojang.serialization.MapCodec;

public class dmn extends dma {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final int b = 6;
   public static final eaz c = eap.aB;
   public static final int d = b(0);
   private static final ffc[] e = dma.a(6, $$0 -> dma.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      cyu $$7 = $$0.h();
      if ($$0.a(axk.aN) && $$1.c(c) == 0 && dma.a($$7) instanceof dmq $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awn.dt, awo.e, 1.0F, 1.0F);
         $$2.b($$3, dmr.a($$8));
         $$2.a($$4, eez.c, $$3);
         $$4.b(awx.c.b($$7));
         return bub.a;
      } else {
         return bub.f;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bub.a;
         }

         if ($$3.b(bua.a).f()) {
            return bub.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bub a(diw $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$3.t(false)) {
         return bub.e;
      } else {
         $$3.a(awx.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eez.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eez.f, $$1);
         }

         return bub.a;
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
