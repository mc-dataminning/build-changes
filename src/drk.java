import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drk extends dpn {
   public static final MapCodec<drk> a = b(drk::new);
   public static final ebk b = ebj.A;
   private final Function<eat, ffw> d;

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   protected drk(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebe.b));
      this.d = this.b();
   }

   private Function<eat, ffw> b() {
      Map<ebe, Map<jb, ffw>> $$0 = fft.e(dmr.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ebw[]{b});
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.C) {
         eat $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bug.a;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, djf $$3, BiConsumer<czn, iv> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(eat $$0, djm $$1, iv $$2, @Nullable crm $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? eft.a : eft.e, $$2);
   }

   protected static void a(@Nullable crm $$0, djn $$1, iv $$2, eat $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awn.oG, awo.e, 0.3F, $$4);
   }

   private static void a(eat $$0, djn $$1, iv $$2, float $$3) {
      jb $$4 = $$0.c(e).g();
      jb $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lt(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   private void d(eat $$0, djm $$1, iv $$2) {
      jb $$3 = n($$0).g();
      eyi $$4 = eye.a($$1, $$3, $$3.o().d() ? jb.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, e, b);
   }
}
