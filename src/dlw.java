import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlw extends dmp implements dnf {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final dyr<dyn> b = dyk.be;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(d, Boolean.valueOf(false)).b(b, dyn.a));
   }

   @Override
   protected int h(dxu $$0) {
      return 2;
   }

   @Override
   public dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.a && !this.b($$1, $$5, $$6) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dgm $$0, jh $$1, dxu $$2) {
      duw $$3 = $$0.c_($$1);
      return $$3 instanceof dvh ? ((dvh)$$3).b() : 0;
   }

   private int e(dhh $$0, jh $$1, dxu $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dhz)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dyn.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dhh $$0, jh $$1, dxu $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dhz)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dyn.a;
      }
   }

   @Override
   protected int b(dhh $$0, jh $$1, dxu $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jm $$4 = $$2.c(aF);
      jh $$5 = $$1.a($$4);
      dxu $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         clt $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.D(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private clt a(dhh $$0, jm $$1, jh $$2) {
      List<clt> $$3 = $$0.a(
         clt.class,
         new fbs((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$3.gj().e) {
         return bti.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dyn.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, axf.ft, axg.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bti.a;
      }
   }

   @Override
   protected void c(dhh $$0, jh $$1, dxu $$2) {
      if (!$$0.T().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         duw $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dvh ? ((dvh)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            fdt $$6 = this.b($$0, $$1, $$2) ? fdt.c : fdt.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dhh $$0, jh $$1, dxu $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      duw $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dvh $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dyn.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dxu $$0, dhh $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      duw $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvh($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF, b, d);
   }
}
