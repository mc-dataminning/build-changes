import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cxk extends cys {
   public static final int a = 3;
   public static final dma b = dlz.r;

   @Override
   protected abstract MapCodec<? extends cxk> a();

   protected cxk(dli.d $$0) {
      super($$0);
   }

   protected abstract Iterable<enz> b(dlj var1);

   public static boolean c(dlj $$0) {
      return $$0.b(b) && ($$0.a(aua.ae) || $$0.a(aua.bj)) && $$0.c(b);
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dlj $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cvr $$0, enz $$1, awp $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(jz.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, atl.dB, atm.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(jz.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable chl $$0, dlj $$1, cvs $$2, hz $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cxk) {
         ((cxk)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(jz.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, atl.dD, atm.e, 1.0F, 1.0F);
      $$2.a($$0, dpw.c, $$3);
   }

   private static void a(cvs $$0, dlj $$1, hz $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if ($$3.j() == cvj.a.d && !$$1.y_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
