import com.mojang.serialization.MapCodec;

public abstract class drh extends drf implements dnr {
   public static final ecq e = ecg.aA;
   public static final int f = 25;
   private final double c;

   protected drh(ebp.d $$0, jc $$1, fgw $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends drh> a();

   @Override
   public ebq b(bai $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iw $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected ebq a(ebq $$0, bai $$1) {
      return $$0.a(e);
   }

   public ebq p(ebq $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(ebq $$0) {
      return $$0.c(e) == 25;
   }

   protected ebq a(ebq $$0, ebq $$1) {
      return $$1;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            ebq $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, eyb.c, eyb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      iw $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(bai var1);

   protected abstract boolean h(ebq var1);

   @Override
   protected drh c() {
      return this;
   }
}
