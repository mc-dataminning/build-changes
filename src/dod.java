import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dod extends dqa {
   public static final eaq c = eap.A;
   private static final ffc a = dma.b(16.0, 0.0, 2.0);

   protected dod(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dod> a();

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$2.a($$0, $$1, ja.b, duj.c);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.b((diy)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((div)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fge.b);
            }
         }
      }
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$0.a((diy)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dwx $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ja $$7 : ja.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(div $$0, iu $$1, dzz $$2) {
      if (!this.b((diy)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fge $$5 = fge.c;
            if (this.b((dib)$$0, $$1, $$2)) {
               $$5 = fge.a;
            } else if ($$3) {
               $$5 = fge.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(diy $$0, iu $$1, dzz $$2) {
      return false;
   }

   protected boolean a(div $$0, iu $$1, dzz $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(div $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(e);
      iu $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dzz $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dmc.cF) ? $$6.c(dsi.f) : 0);
      }
   }

   protected int a(djn $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(e);
      ja $$4 = $$3.h();
      ja $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bxc $$3, cyy $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(div $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(e);
      iu $$4 = $$1.a($$3.g());
      exo $$5 = exk.a($$0, $$3.g(), ja.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dib $$0, iu $$1, dzz $$2) {
      return 15;
   }

   public static boolean n(dzz $$0) {
      return $$0.b() instanceof dod;
   }

   public boolean b(dib $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(e).g();
      dzz $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(dzz var1);
}
