import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmg extends dob {
   protected static final fcl c = dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dyf d = dye.B;

   protected dmg(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmg> a();

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$2.a($$0, $$1, jm.b, dsj.c);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!this.c((dhc)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dgz)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fdn.b);
            }
         }
      }
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$0.a((dhc)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         duq $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jm $$7 : jm.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgz $$0, jh $$1, dxo $$2) {
      if (!this.c((dhc)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fdn $$5 = fdn.c;
            if (this.b((dge)$$0, $$1, $$2)) {
               $$5 = fdn.a;
            } else if ($$3) {
               $$5 = fdn.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dhc $$0, jh $$1, dxo $$2) {
      return false;
   }

   protected boolean a(dgz $$0, jh $$1, dxo $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgz $$0, jh $$1, dxo $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dxo $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dkf.cE) ? $$6.c(dqk.f) : 0);
      }
   }

   protected int a(dhr $$0, jh $$1, dxo $$2) {
      jm $$3 = $$2.c(aF);
      jm $$4 = $$3.h();
      jm $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgz $$0, jh $$1, dxo $$2) {
      jm $$3 = $$2.c(aF);
      jh $$4 = $$1.a($$3.g());
      euy $$5 = euu.a($$0, $$3.g(), jm.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dge $$0, jh $$1, dxo $$2) {
      return 15;
   }

   public static boolean n(dxo $$0) {
      return $$0.b() instanceof dmg;
   }

   public boolean b(dge $$0, jh $$1, dxo $$2) {
      jm $$3 = $$2.c(aF).g();
      dxo $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dxo var1);
}
