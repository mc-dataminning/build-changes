import com.mojang.serialization.MapCodec;

public class dcp extends cwp {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final djx b = dcs.d;

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(djf.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      if (!$$3.bT()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cmx $$6 = $$3.b($$4);
      return $$6.d() instanceof ckq && new cpg($$3, $$4, $$6, $$5).b() ? bka.d : bka.a;
   }

   private static void d(djg $$0, cto $$1, hx $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(djg $$0) {
      return $$0.c(b);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && crk.a(crm.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(cto $$0, hx $$1) {
      double $$2 = 0.5625;
      auu $$3 = $$0.z;

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
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
