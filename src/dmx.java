import com.mojang.serialization.MapCodec;

public class dmx extends dgv {
   public static final MapCodec<dmx> a = b(dmx::new);
   public static final dur b = dna.d;

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dua $$0, dds $$1, je $$2, cnp $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
      if (!$$3.cb()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.B) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (brk)($$0.h() instanceof ctl && new cyw($$4, $$5, $$0, $$6).b() ? brk.e : brk.a);
   }

   private static void d(dua $$0, dds $$1, je $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqv.a(1, 5));
      }
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dds $$0, je $$1) {
      double $$2 = 0.5625;
      azk $$3 = $$0.z;

      for (jj $$4 : jj.values()) {
         je $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jj.a $$6 = $$4.o();
            double $$7 = $$6 == jj.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jj.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jj.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(li.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
