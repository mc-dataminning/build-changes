import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dph extends drf {
   public static final ebx c = ebw.A;
   private static final fgm a = dne.b(16.0, 0.0, 2.0);

   protected dph(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dph> a();

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$2.a($$0, $$1, jc.b, dvp.c);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!this.b((dkc)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((djz)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fho.b);
            }
         }
      }
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$0.a((dkc)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dye $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jc $$7 : jc.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(djz $$0, iw $$1, ebg $$2) {
      if (!this.b((dkc)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fho $$5 = fho.c;
            if (this.b((djd)$$0, $$1, $$2)) {
               $$5 = fho.a;
            } else if ($$3) {
               $$5 = fho.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dkc $$0, iw $$1, ebg $$2) {
      return false;
   }

   protected boolean a(djz $$0, iw $$1, ebg $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(djz $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(e);
      iw $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         ebg $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dng.cH) ? $$6.c(dtn.f) : 0);
      }
   }

   protected int a(dkr $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(e);
      jc $$4 = $$3.h();
      jc $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(djz $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(e);
      iw $$4 = $$1.a($$3.g());
      eyy $$5 = eyu.a($$0, $$3.g(), jc.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(djd $$0, iw $$1, ebg $$2) {
      return 15;
   }

   public static boolean n(ebg $$0) {
      return $$0.b() instanceof dph;
   }

   public boolean b(djd $$0, iw $$1, ebg $$2) {
      jc $$3 = $$2.c(e).g();
      ebg $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(ebg var1);
}
