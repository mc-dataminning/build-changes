import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dif extends djn {
   public static final int a = 3;
   public static final dxp b = dxo.v;

   @Override
   protected abstract MapCodec<? extends dif> a();

   protected dif(dwx.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fbb> b(dwy var1);

   public static boolean c(dwy $$0) {
      return $$0.b(b) && ($$0.a(awp.ag) || $$0.a(awp.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dwy $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dgj $$0, fbb $$1, azh $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lt.ag, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awa.dL, awb.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lt.aL, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable coy $$0, dwy $$1, dgk $$2, ji $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dif) {
         ((dif)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lt.ag, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awa.dN, awb.e, 1.0F, 1.0F);
      $$2.a($$0, ebu.c, $$3);
   }

   private static void a(dgk $$0, dwy $$1, ji $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
