import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpr extends drp {
   public static final ech c = ecg.A;
   private static final fgw a = dno.b(16.0, 0.0, 2.0);

   protected dpr(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpr> a();

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$2.a($$0, $$1, jc.b, dvz.c);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!this.b((dkm)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((dkj)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fhy.b);
            }
         }
      }
   }

   @Override
   protected int b(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if ($$0.a((dkm)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dyo $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jc $$7 : jc.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dkj $$0, iw $$1, ebq $$2) {
      if (!this.b((dkm)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fhy $$5 = fhy.c;
            if (this.b((djn)$$0, $$1, $$2)) {
               $$5 = fhy.a;
            } else if ($$3) {
               $$5 = fhy.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dkm $$0, iw $$1, ebq $$2) {
      return false;
   }

   protected boolean a(dkj $$0, iw $$1, ebq $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dkj $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(e);
      iw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         ebq $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dnq.cH) ? $$6.c(dtx.f) : 0);
      }
   }

   protected int a(dlb $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(e);
      jc $$4 = $$3.h();
      jc $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dkj $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(e);
      iw $$4 = $$1.a($$3.g());
      ezi $$5 = eze.a($$0, $$3.g(), jc.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(djn $$0, iw $$1, ebq $$2) {
      return 15;
   }

   public static boolean n(ebq $$0) {
      return $$0.b() instanceof dpr;
   }

   public boolean b(djn $$0, iw $$1, ebq $$2) {
      jc $$3 = $$2.c(e).g();
      ebq $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(ebq var1);
}
