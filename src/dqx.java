import com.mojang.serialization.MapCodec;

public class dqx extends dnc implements dnf {
   public static final MapCodec<dqx> a = b(dqx::new);
   private static final fgk c = dnc.b(14.0, 0.0, 16.0);
   private static final fgk d = dnc.b(14.0, 2.0, 16.0);
   public static final ebv b = ebu.F;

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(500) == 0) {
         ebe $$4 = $$1.a_($$2.d());
         if ($$4.a(axe.w) || $$4.a(dne.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awp.tg, awq.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(ebe $$0) {
      return true;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(djb $$0, iv $$1) {
      iv $$2 = $$1.a(jb.b);
      ebe $$3 = $$0.a_($$2);
      return dsi.a($$0, jb.b, $$2, $$3) || $$3.a(dne.ug);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(ebe $$0) {
      return $$0.l();
   }

   public iv a(djb $$0, iv $$1) {
      iv.a $$2 = $$1.k();

      ebe $$3;
      do {
         $$2.c(jb.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jb.b).j();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      iv $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
