import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czy extends daq implements dbg {
   public static final MapCodec<czy> a = b(czy::new);
   public static final dmd<dly> b = dlv.bd;

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   public czy(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ie.c).a(d, Boolean.valueOf(false)).a(b, dly.a));
   }

   @Override
   protected int g(dlf $$0) {
      return 2;
   }

   @Override
   public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.b($$3, $$5, $$2) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(cut $$0, hz $$1, dlf $$2) {
      dit $$3 = $$0.c_($$1);
      return $$3 instanceof dje ? ((dje)$$3).c() : 0;
   }

   private int e(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((cwd)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dly.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((cwd)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dly.a;
      }
   }

   @Override
   protected int b(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ie $$4 = $$2.c(aE);
      hz $$5 = $$1.a($$4);
      dlf $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cdl $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.K(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cdl a(cvn $$0, ie $$1, hz $$2) {
      List<cdl> $$3 = $$0.a(
         cdl.class,
         new enn((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cE() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!$$3.fU().e) {
         return blu.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dly.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, atk.fd, atl.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return blu.a($$1.B);
      }
   }

   @Override
   protected void c(cvn $$0, hz $$1, dlf $$2) {
      if (!$$0.N().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dit $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dje ? ((dje)$$4).c() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            epn $$6 = this.b($$0, $$1, $$2) ? epn.c : epn.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(cvn $$0, hz $$1, dlf $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dit $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dje $$6) {
         $$5 = $$6.c();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dly.a) {
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
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dlf $$0, cvn $$1, hz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dit $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dje($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, b, d);
   }
}
