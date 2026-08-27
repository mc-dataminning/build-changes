import com.mojang.serialization.MapCodec;

public class dkb extends dea {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dru b = dke.d;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(drc.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, cly $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, brw $$3) {
      if (!$$3.bW()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return $$0.g() instanceof cro && new cxb($$4, $$5, $$0, $$6).b() ? bpy.e : bpy.a;
   }

   private static void d(drd $$0, daz $$1, io $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, ctq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && czc.a(cze.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(daz $$0, io $$1) {
      double $$2 = 0.5625;
      aym $$3 = $$0.z;

      for (it $$4 : it.values()) {
         io $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            it.a $$6 = $$4.o();
            double $$7 = $$6 == it.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == it.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == it.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ks.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }
}
