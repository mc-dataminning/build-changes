import com.mojang.serialization.MapCodec;

public class dcy extends cwy {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final dkg b = ddb.d;

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(djo.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.d() instanceof cla && new cpp($$4, $$5, $$0, $$6).b() ? bke.e : bke.a;
   }

   private static void d(djp $$0, ctx $$1, hx $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(djp $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && crt.a(crv.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(ctx $$0, hx $$1) {
      double $$2 = 0.5625;
      auw $$3 = $$0.z;

      for (ic $$4 : ic.values()) {
         hx $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            ic.a $$6 = $$4.o();
            double $$7 = $$6 == ic.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == ic.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == ic.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(jr.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
