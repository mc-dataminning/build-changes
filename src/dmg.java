import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dmg extends dno {
   public static final int a = 3;
   public static final ech b = ecg.u;

   @Override
   protected abstract MapCodec<? extends dmg> a();

   protected dmg(ebp.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fgc> b(ebq var1);

   public static boolean c(ebq $$0) {
      return $$0.b(b) && ($$0.a(axn.ag) || $$0.a(axn.bn)) && $$0.c(b);
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      if (!$$0.C && $$3.bX() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(ebq $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dkj $$0, fgc $$1, bai $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lz.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awy.dN, awz.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lz.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable csi $$0, ebq $$1, dkk $$2, iw $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dmg) {
         ((dmg)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lz.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awy.dP, awz.e, 1.0F, 1.0F);
      $$2.a($$0, egq.c, $$3);
   }

   private static void a(dkk $$0, ebq $$1, iw $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dkc $$3, BiConsumer<dak, iw> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
