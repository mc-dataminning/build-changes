import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duk extends dmr {
   public static final MapCodec<duk> a = b(duk::new);
   public static final int b = 8;
   public static final ebt c = ebj.aI;
   private static final ffw[] e = dmr.a(8, $$0 -> dmr.b(16.0, 0.0, (double)($$0 * 2)));
   public static final int d = 5;

   @Override
   public MapCodec<duk> a() {
      return a;
   }

   protected duk(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return $$1 == exp.a ? $$0.c(c) < 5 : false;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e[$$0.c(c) - 1];
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return e[$$0.c(c)];
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected boolean g_(eat $$0) {
      return true;
   }

   @Override
   protected float c(eat $$0, diq $$1, iv $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      if ($$3.a(axc.cv)) {
         return false;
      } else {
         return $$3.a(axc.cw) ? true : dmr.a($$3.g($$1, $$2.e()), jb.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.a(djv.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(eat $$0, ddg $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.h()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jb.b : true;
      }
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }
}
