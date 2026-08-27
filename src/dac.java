import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dac extends dau implements dbk {
   public static final MapCodec<dac> a = b(dac::new);
   public static final dmh<dmc> b = dlz.bd;

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   public dac(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ie.c).a(d, Boolean.valueOf(false)).a(b, dmc.a));
   }

   @Override
   protected int g(dlj $$0) {
      return 2;
   }

   @Override
   public dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.b($$3, $$5, $$2) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cux $$0, hz $$1, dlj $$2) {
      dix $$3 = $$0.c_($$1);
      return $$3 instanceof dji ? ((dji)$$3).c() : 0;
   }

   private int e(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cwh)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dmc.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cwh)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dmc.a;
      }
   }

   @Override
   protected int b(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ie $$4 = $$2.c(aE);
      hz $$5 = $$1.a($$4);
      dlj $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cdp $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cdp a(cvr $$0, ie $$1, hz $$2) {
      List<cdp> $$3 = $$0.a(
         cdp.class,
         new enu((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if (!$$3.fU().e) {
         return blw.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dmc.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, atl.fe, atm.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return blw.a($$1.B);
      }
   }

   @Override
   protected void c(cvr $$0, hz $$1, dlj $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dix $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dji ? ((dji)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            epu $$6 = this.b($$0, $$1, $$2) ? epu.c : epu.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dix $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dji $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dmc.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dlj $$0, cvr $$1, hz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dix $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dji($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE, b, d);
   }
}
