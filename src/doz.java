import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class doz extends dpr implements dqi {
   public static final MapCodec<doz> a = b(doz::new);
   public static final eco<ecj> b = ecg.bg;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, Boolean.valueOf(false)).b(b, ecj.a));
   }

   @Override
   protected int h(ebq $$0) {
      return 2;
   }

   @Override
   public ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !this.a($$1, $$5, $$6) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(djn $$0, iw $$1, ebq $$2) {
      dyo $$3 = $$0.c_($$1);
      return $$3 instanceof dza ? ((dza)$$3).a() : 0;
   }

   private int e(dkj $$0, iw $$1, ebq $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dlb)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == ecj.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dkj $$0, iw $$1, ebq $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dlb)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == ecj.a;
      }
   }

   @Override
   protected int b(dkj $$0, iw $$1, ebq $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jc $$4 = $$2.c(e);
      iw $$5 = $$1.a($$4);
      ebq $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cog $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cog a(dkj $$0, jc $$1, iw $$2) {
      List<cog> $$3 = $$0.a(
         cog.class,
         new ffx((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cO() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$3.gk().e) {
         return bvc.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == ecj.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, awy.fv, awz.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bvc.a;
      }
   }

   @Override
   protected void c(dkj $$0, iw $$1, ebq $$2) {
      if (!$$0.U().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dyo $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dza ? ((dza)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fhy $$6 = this.b($$0, $$1, $$2) ? fhy.c : fhy.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dkj $$0, iw $$1, ebq $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dyo $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dza $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == ecj.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(c, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(ebq $$0, dkj $$1, iw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dyo $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dza($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, b, c);
   }
}
