import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dge extends dhm {
   public static final int a = 3;
   public static final dvj b = dvi.r;

   @Override
   protected abstract MapCodec<? extends dge> a();

   protected dge(dur.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eyw> b(dus var1);

   public static boolean c(dus $$0) {
      return $$0.b(b) && ($$0.a(awv.af) || $$0.a(awv.bl)) && $$0.c(b);
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      if (!$$0.B && $$3.bV() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dus $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dej $$0, eyw $$1, azn $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lo.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awg.dK, awh.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lo.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cnx $$0, dus $$1, dek $$2, jf $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dge) {
         ((dge)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lo.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awg.dM, awh.e, 1.0F, 1.0F);
      $$2.a($$0, dzp.c, $$3);
   }

   private static void a(dek $$0, dus $$1, jf $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
