import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvh extends dno {
   public static final MapCodec<dvh> a = b(dvh::new);
   public static final int b = 8;
   public static final ecq c = ecg.aI;
   private static final fgw[] e = dno.a(8, $$0 -> dno.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<dvh> a() {
      return a;
   }

   protected dvh(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return $$1 == eyp.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      if ($$3.a(axn.cv)) {
         return false;
      } else {
         return $$3.a(axn.cw) ? true : dno.a($$3.g($$1, $$2.e()), jc.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.a(dks.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jc.b : true;
      }
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }
}
