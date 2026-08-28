import com.mojang.serialization.MapCodec;

public class dpu extends dma implements dmd {
   public static final MapCodec<dpu> a = b(dpu::new);
   private static final ffc c = dma.b(14.0, 0.0, 16.0);
   private static final ffc d = dma.b(14.0, 2.0, 16.0);
   public static final eaq b = eap.F;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$3.a(500) == 0) {
         dzz $$4 = $$1.a_($$2.d());
         if ($$4.a(axc.w) || $$4.a(dmc.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.td, awo.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dib $$0, iu $$1) {
      iu $$2 = $$1.a(ja.b);
      dzz $$3 = $$0.a_($$2);
      return drf.a($$0, ja.b, $$2, $$3) || $$3.a(dmc.ud);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dzz $$0) {
      return $$0.l();
   }

   public iu a(dib $$0, iu $$1) {
      iu.a $$2 = $$1.k();

      dzz $$3;
      do {
         $$2.c(ja.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(ja.b).j();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      iu $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
