import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpf extends drd {
   public static final ebv c = ebu.A;
   private static final fgk a = dnc.b(16.0, 0.0, 2.0);

   protected dpf(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpf> a();

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$2.a($$0, $$1, jb.b, dvn.c);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!this.b((dka)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((djx)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fhm.b);
            }
         }
      }
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$0.a((dka)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dyc $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jb $$7 : jb.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(djx $$0, iv $$1, ebe $$2) {
      if (!this.b((dka)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fhm $$5 = fhm.c;
            if (this.b((djb)$$0, $$1, $$2)) {
               $$5 = fhm.a;
            } else if ($$3) {
               $$5 = fhm.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dka $$0, iv $$1, ebe $$2) {
      return false;
   }

   protected boolean a(djx $$0, iv $$1, ebe $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(djx $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(e);
      iv $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         ebe $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dne.cH) ? $$6.c(dtl.f) : 0);
      }
   }

   protected int a(dkp $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(e);
      jb $$4 = $$3.h();
      jb $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(djx $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(e);
      iv $$4 = $$1.a($$3.g());
      eyw $$5 = eys.a($$0, $$3.g(), jb.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(djb $$0, iv $$1, ebe $$2) {
      return 15;
   }

   public static boolean n(ebe $$0) {
      return $$0.b() instanceof dpf;
   }

   public boolean b(djb $$0, iv $$1, ebe $$2) {
      jb $$3 = $$2.c(e).g();
      ebe $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(ebe var1);
}
