import com.mojang.serialization.MapCodec;

public abstract class dqx extends dqv implements dnh {
   public static final ecg e = ebw.aA;
   public static final int f = 25;
   private final double c;

   protected dqx(ebf.d $$0, jc $$1, fgm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dqx> a();

   @Override
   public ebg b(azz $$0) {
      return this.m().b(e, Integer.valueOf($$0.a(25)));
   }

   @Override
   protected boolean f(ebg $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         iw $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected ebg a(ebg $$0, azz $$1) {
      return $$0.a(e);
   }

   public ebg p(ebg $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(ebg $$0) {
      return $$0.c(e) == 25;
   }

   protected ebg a(ebg $$0, ebg $$1) {
      return $$1;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            ebg $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      iw $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azz var1);

   protected abstract boolean h(ebg var1);

   @Override
   protected dqx c() {
      return this;
   }
}
