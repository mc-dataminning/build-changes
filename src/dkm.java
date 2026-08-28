import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dkm extends dlu {
   public static final int a = 3;
   public static final eaf b = eae.u;

   @Override
   protected abstract MapCodec<? extends dkm> a();

   protected dkm(dzn.d $$0) {
      super($$0);
   }

   protected abstract Iterable<fdw> b(dzo var1);

   public static boolean c(dzo $$0) {
      return $$0.b(b) && ($$0.a(axa.ag) || $$0.a(axa.bm)) && $$0.c(b);
   }

   @Override
   protected void a(dip $$0, dzo $$1, fds $$2, crm $$3) {
      if (!$$0.C && $$3.bY() && this.d($$1)) {
         a($$0, $$1, $$2.b(), true);
      }
   }

   protected boolean d(dzo $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dip $$0, fdw $$1, azt $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lx.ah, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awl.dL, awm.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lx.aM, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cqs $$0, dzo $$1, diq $$2, iu $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dkm) {
         ((dkm)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lx.ah, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awl.dN, awm.e, 1.0F, 1.0F);
      $$2.a($$0, eeo.c, $$3);
   }

   private static void a(diq $$0, dzo $$1, iu $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$3.g() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
