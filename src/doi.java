import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class doi extends dqg {
   public static final eay c = eax.A;
   private static final ffk a = dmf.b(16.0, 0.0, 2.0);

   protected doi(eag.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends doi> a();

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(djd $$0, iu $$1, eah $$2) {
      return $$2.a($$0, $$1, ja.b, duq.c);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.b((djd)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((dja)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fgm.b);
            }
         }
      }
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$0.a((djd)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dxf $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ja $$7 : ja.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dja $$0, iu $$1, eah $$2) {
      if (!this.b((djd)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fgm $$5 = fgm.c;
            if (this.b((dig)$$0, $$1, $$2)) {
               $$5 = fgm.a;
            } else if ($$3) {
               $$5 = fgm.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(djd $$0, iu $$1, eah $$2) {
      return false;
   }

   protected boolean a(dja $$0, iu $$1, eah $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dja $$0, iu $$1, eah $$2) {
      ja $$3 = $$2.c(e);
      iu $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         eah $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dmh.cH) ? $$6.c(dso.f) : 0);
      }
   }

   protected int a(djs $$0, iu $$1, eah $$2) {
      ja $$3 = $$2.c(e);
      ja $$4 = $$3.h();
      ja $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dja $$0, iu $$1, eah $$2) {
      ja $$3 = $$2.c(e);
      iu $$4 = $$1.a($$3.g());
      exw $$5 = exs.a($$0, $$3.g(), ja.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dig $$0, iu $$1, eah $$2) {
      return 15;
   }

   public static boolean n(eah $$0) {
      return $$0.b() instanceof doi;
   }

   public boolean b(dig $$0, iu $$1, eah $$2) {
      ja $$3 = $$2.c(e).g();
      eah $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(eah var1);
}
