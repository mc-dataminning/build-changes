import com.mojang.serialization.MapCodec;

public class dam extends daa {
   public static final MapCodec<dam> a = b(dam::new);
   public static final int b = 6;
   public static final dnz c = dnp.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final eqk[] g = new eqk[]{
      daa.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      daa.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   protected dam(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      cqf $$7 = $$0.d();
      if ($$0.a(auv.ai) && $$1.c(c) == 0 && daa.a($$7) instanceof dap $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, aty.dm, atz.e, 1.0F, 1.0F);
         $$2.b($$3, daq.a($$8));
         $$2.a($$4, drn.c, $$3);
         $$4.b(aui.c.b($$7));
         return bne.a;
      } else {
         return bne.d;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bnc.a;
         }

         if ($$3.b(bnb.a).b()) {
            return bnc.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bnc a(cxa $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$3.s(false)) {
         return bnc.d;
      } else {
         $$3.a(aui.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, drn.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, drn.f, $$1);
         }

         return bnc.a;
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
