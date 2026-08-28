import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drf extends dpi {
   public static final MapCodec<drf> a = b(drf::new);
   public static final ebf b = ebe.A;
   private final Function<eao, ffr> d;

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   protected drf(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, eaz.b));
      this.d = this.b();
   }

   private Function<eao, ffr> b() {
      Map<eaz, Map<jb, ffr>> $$0 = ffo.e(dmm.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ebr[]{b});
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$1.C) {
         eao $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bug.a;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, dja $$3, BiConsumer<czk, iv> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(eao $$0, djh $$1, iv $$2, @Nullable crj $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? efo.a : efo.e, $$2);
   }

   protected static void a(@Nullable crj $$0, dji $$1, iv $$2, eao $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awn.oG, awo.e, 0.3F, $$4);
   }

   private static void a(eao $$0, dji $$1, iv $$2, float $$3) {
      jb $$4 = $$0.c(e).g();
      jb $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lt(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   private void d(eao $$0, djh $$1, iv $$2) {
      jb $$3 = n($$0).g();
      eyd $$4 = exz.a($$1, $$3, $$3.o().d() ? jb.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, e, b);
   }
}
