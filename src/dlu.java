import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dlu extends dnc {
   public static final int a = 3;
   public static final ebv b = ebu.u;

   @Override
   protected abstract MapCodec<? extends dlu> a();

   protected dlu(ebd.d $$0) {
      super($$0);
   }

   protected abstract Iterable<ffq> b(ebe var1);

   public static boolean c(ebe $$0) {
      return $$0.b(b) && ($$0.a(axe.ag) || $$0.a(axe.bn)) && $$0.c(b);
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      if (!$$0.C && $$3.bX() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(ebe $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(djx $$0, ffq $$1, azx $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ly.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awp.dN, awq.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ly.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable crx $$0, ebe $$1, djy $$2, iv $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dlu) {
         ((dlu)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ly.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awp.dP, awq.e, 1.0F, 1.0F);
      $$2.a($$0, ege.c, $$3);
   }

   private static void a(djy $$0, ebe $$1, iv $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, djq $$3, BiConsumer<czy, iv> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
