import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drz extends djl {
   public static final MapCodec<drz> a = b(drz::new);
   public static final dxn b = dxm.I;

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(dwv.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, ji $$1, dfz $$2) {
      clc $$3 = new clc($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dgh $$0, ji $$1) {
      a($$0, $$1, null);
   }

   private static void a(dgh $$0, ji $$1, @Nullable bvg $$2) {
      if (!$$0.C) {
         clc $$3 = new clc($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awa.Am, awb.e, 1.0F, 1.0F);
         $$0.a($$2, ebs.I, $$1);
      }
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if (!$$0.a(cws.oX) && !$$0.a(cws.uV)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, djn.a.m(), 11);
         cwk $$7 = $$0.h();
         if ($$0.a(cws.oX)) {
            $$0.a(1, $$4, bvg.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awk.c.b($$7));
         return bsj.a;
      }
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      if ($$0 instanceof ard $$4) {
         ji $$5 = $$2.b();
         buk $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvg ? (bvg)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dfz $$0) {
      return false;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }
}
