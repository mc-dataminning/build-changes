import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drv extends dpy {
   public static final MapCodec<drv> a = b(drv::new);
   public static final ebv b = ebu.A;
   private final Function<ebe, fgk> d;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(b, Boolean.valueOf(false)).b(c, ebp.b));
      this.d = this.b();
   }

   private Function<ebe, fgk> b() {
      Map<ebp, Map<jb, fgk>> $$0 = fgh.e(dnc.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ech[]{b});
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1.C) {
         ebe $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bur.a;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(ebe $$0, djx $$1, iv $$2, @Nullable crx $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ege.a : ege.e, $$2);
   }

   protected static void a(@Nullable crx $$0, djy $$1, iv $$2, ebe $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awp.oG, awq.e, 0.3F, $$4);
   }

   private static void a(ebe $$0, djy $$1, iv $$2, float $$3) {
      jb $$4 = $$0.c(e).g();
      jb $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lt(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   private void d(ebe $$0, djx $$1, iv $$2) {
      jb $$3 = n($$0).g();
      eyw $$4 = eys.a($$1, $$3, $$3.o().d() ? jb.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, e, b);
   }
}
