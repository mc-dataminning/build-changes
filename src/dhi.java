import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhi extends dia implements diq {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final dua<dtv> b = dts.bd;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(d, Boolean.valueOf(false)).a(b, dtv.a));
   }

   @Override
   protected int g(dtc $$0) {
      return 2;
   }

   @Override
   public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.b($$3, $$5, $$2) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dcc $$0, jd $$1, dtc $$2) {
      dqh $$3 = $$0.c_($$1);
      return $$3 instanceof dqs ? ((dqs)$$3).b() : 0;
   }

   private int e(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((ddm)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dtv.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((ddm)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dtv.a;
      }
   }

   @Override
   protected int b(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ji $$4 = $$2.c(aE);
      jd $$5 = $$1.a($$4);
      dtc $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cja $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.I(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cja a(dcw $$0, ji $$1, jd $$2) {
      List<cja> $$3 = $$0.a(
         cja.class,
         new ewv((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cI() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if (!$$3.ga().e) {
         return bqr.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dtv.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avp.fr, avq.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqr.a($$1.B);
      }
   }

   @Override
   protected void c(dcw $$0, jd $$1, dtc $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dqh $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dqs ? ((dqs)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eyv $$6 = this.b($$0, $$1, $$2) ? eyv.c : eyv.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dqh $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dqs $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dtv.a) {
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
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dtc $$0, dcw $$1, jd $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqh $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqs($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, b, d);
   }
}
