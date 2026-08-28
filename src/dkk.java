import com.mojang.serialization.MapCodec;

public abstract class dkk extends dki implements dgy {
   public static final dva e = duq.ax;
   public static final int f = 25;
   private final double c;

   protected dkk(dtz.d $$0, jj $$1, eyx $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.E.b().b(e, Integer.valueOf(0)));
   }

   @Override
   protected abstract MapCodec<? extends dkk> a();

   @Override
   public dua a(ddt $$0) {
      return this.o().b(e, Integer.valueOf($$0.C_().a(25)));
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         je $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.b($$4, this.a($$0, $$1.z));
         }
      }
   }

   protected dua a(dua $$0, azk $$1) {
      return $$0.a(e);
   }

   public dua p(dua $$0) {
      return $$0.b(e, Integer.valueOf(25));
   }

   public boolean q(dua $$0) {
      return $$0.c(e) == 25;
   }

   protected dua a(dua $$0, dua $$1) {
      return $$1;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == this.a.g() && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 != this.a || !$$2.a(this) && !$$2.a(this.b())) {
         if (this.b) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return this.a($$0, this.b().o());
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      je $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.b($$4, $$3.b(e, Integer.valueOf($$5)));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(azk var1);

   protected abstract boolean h(dua var1);

   @Override
   protected dkk c() {
      return this;
   }
}
