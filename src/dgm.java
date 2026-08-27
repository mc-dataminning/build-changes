import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgm extends dhf implements dhw {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final dua<dtv> b = dts.bd;

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, iw.c).a(d, Boolean.valueOf(false)).a(b, dtv.a));
   }

   @Override
   protected int g(dtc $$0) {
      return 2;
   }

   @Override
   public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !this.b($$3, $$5, $$2) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dbg $$0, ir $$1, dtc $$2) {
      dqc $$3 = $$0.c_($$1);
      return $$3 instanceof dqn ? ((dqn)$$3).b() : 0;
   }

   private int e(dca $$0, ir $$1, dtc $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dcq)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dtv.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dca $$0, ir $$1, dtc $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dcq)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dtv.a;
      }
   }

   @Override
   protected int b(dca $$0, ir $$1, dtc $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      iw $$4 = $$2.c(aE);
      ir $$5 = $$1.a($$4);
      dtc $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         chz $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.J(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private chz a(dca $$0, iw $$1, ir $$2) {
      List<chz> $$3 = $$0.a(
         chz.class,
         new ewp((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cM() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!$$3.gm().e) {
         return bqa.d;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dtv.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avo.fr, avq.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqa.a($$1.C);
      }
   }

   @Override
   protected void c(dca $$0, ir $$1, dtc $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dqc $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dqn ? ((dqn)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eyp $$6 = this.b($$0, $$1, $$2) ? eyp.c : eyp.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dca $$0, ir $$1, dtc $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dqc $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dqn $$6) {
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
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dtc $$0, dca $$1, ir $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqc $$5 = $$1.c_($$2);
      return $$5 != null && $$5.b_($$3, $$4);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqn($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(aE, b, d);
   }
}
