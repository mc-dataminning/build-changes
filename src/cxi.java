import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxi extends cvj {
   public static final MapCodec<cxi> a = b(cxi::new);
   public static final dig<die> b = dhy.ae;

   @Override
   public MapCodec<? extends cxi> a() {
      return a;
   }

   public cxi(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, die.b));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      die $$6 = $$0.c(b);
      if ($$1.o() != hx.a.b || $$6 == die.b != ($$1 == hx.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == die.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cvc.a.o();
      }
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ht $$1 = $$0.a();
      csa $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      ht $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, die.a)), 3);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      if ($$0.c(b) != die.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dhi $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == die.b;
      }
   }

   public static void a(csb $$0, dhi $$1, ht $$2, int $$3) {
      ht $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, die.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, die.a)), $$3);
   }

   public static dhi c(csd $$0, ht $$1, dhi $$2) {
      return $$2.b(dhy.C) ? $$2.a(dhy.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csa $$0, cdu $$1, ht $$2, dhi $$3, @Nullable dfd $$4, clj $$5) {
      super.a($$0, $$1, $$2, cvc.a.o(), $$4, $$5);
   }

   protected static void b(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      die $$4 = $$2.c(b);
      if ($$4 == die.a) {
         ht $$5 = $$1.d();
         dhi $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == die.b) {
            dhi $$7 = $$6.u().b(ect.c) ? cvc.G.o() : cvc.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cva.i($$6));
         }
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dhi $$0, ht $$1) {
      return atm.b($$1.u(), $$1.c($$0.c(b) == die.b ? 0 : 1).v(), $$1.w());
   }
}
