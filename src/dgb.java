import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dgb extends dhj {
   public static final int a = 3;
   public static final dvf b = dve.r;

   @Override
   protected abstract MapCodec<? extends dgb> a();

   protected dgb(dun.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eys> b(duo var1);

   public static boolean c(duo $$0) {
      return $$0.b(b) && ($$0.a(awt.af) || $$0.a(awt.bl)) && $$0.c(b);
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      if (!$$0.B && $$3.bV() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(duo $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(deg $$0, eys $$1, azl $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ln.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awe.dK, awf.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ln.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cnu $$0, duo $$1, deh $$2, je $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dgb) {
         ((dgb)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ln.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awe.dM, awf.e, 1.0F, 1.0F);
      $$2.a($$0, dzl.c, $$3);
   }

   private static void a(deh $$0, duo $$1, je $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
