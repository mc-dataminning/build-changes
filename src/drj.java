import com.mojang.serialization.MapCodec;

public class drj extends dno implements dnr {
   public static final MapCodec<drj> a = b(drj::new);
   private static final fgw c = dno.b(14.0, 0.0, 16.0);
   private static final fgw d = dno.b(14.0, 2.0, 16.0);
   public static final ech b = ecg.F;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$3.a(500) == 0) {
         ebq $$4 = $$1.a_($$2.d());
         if ($$4.a(axn.w) || $$4.a(dnq.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awy.tg, awz.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(djn $$0, iw $$1) {
      iw $$2 = $$1.a(jc.b);
      ebq $$3 = $$0.a_($$2);
      return dsu.a($$0, jc.b, $$2, $$3) || $$3.a(dnq.ug);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(ebq $$0) {
      return $$0.l();
   }

   public iw a(djn $$0, iw $$1) {
      iw.a $$2 = $$1.k();

      ebq $$3;
      do {
         $$2.c(jc.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jc.b).j();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      iw $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}
