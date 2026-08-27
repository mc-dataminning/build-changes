import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class cum extends cvc implements cvs {
   public static final MapCodec<cum> a = b(cum::new);
   public static final dgb<dfw> b = dft.bd;

   @Override
   public MapCodec<cum> a() {
      return a;
   }

   public cum(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ha.c).a(d, Boolean.valueOf(false)).a(b, dfw.a));
   }

   @Override
   protected int g(dfd $$0) {
      return 2;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !this.b($$3, $$5, $$2) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cph $$0, gw $$1, dfd $$2) {
      dcz $$3 = $$0.c_($$1);
      return $$3 instanceof ddk ? ((ddk)$$3).c() : 0;
   }

   private int e(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cqr)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dfw.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cqr)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dfw.a;
      }
   }

   @Override
   protected int b(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ha $$4 = $$2.c(aE);
      gw $$5 = $$1.a($$4);
      dfd $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         bym $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private bym a(cqb $$0, ha $$1, gw $$2) {
      List<bym> $$3 = $$0.a(
         bym.class,
         new ehc((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cD() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!$$3.fT().e) {
         return bhe.d;
      } else {
         $$0 = $$0.a(b);
         float $$6 = $$0.c(b) == dfw.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, apg.eF, aph.e, 0.3F, $$6);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bhe.a($$1.B);
      }
   }

   @Override
   protected void c(cqb $$0, gw $$1, dfd $$2) {
      if (!$$0.L().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dcz $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ddk ? ((ddk)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eix $$6 = this.b($$0, $$1, $$2) ? eix.c : eix.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dcz $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ddk $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dfw.a) {
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
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   public boolean a(dfd $$0, cqb $$1, gw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcz $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddk($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, b, d);
   }
}
