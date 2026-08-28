import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class deq extends dfy {
   public static final int a = 3;
   public static final dtt b = dts.r;

   @Override
   protected abstract MapCodec<? extends deq> a();

   protected deq(dtb.d $$0) {
      super($$0);
   }

   protected abstract Iterable<exa> b(dtc var1);

   public static boolean c(dtc $$0) {
      return $$0.b(b) && ($$0.a(awe.ae) || $$0.a(awe.bk)) && $$0.c(b);
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      if (!$$0.B && $$3.bR() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dtc $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dcw $$0, exa $$1, ayw $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(lm.ae, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, avp.dJ, avq.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(lm.aJ, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cmx $$0, dtc $$1, dcx $$2, jd $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof deq) {
         ((deq)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(lm.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, avp.dL, avq.e, 1.0F, 1.0F);
      $$2.a($$0, dxz.c, $$3);
   }

   private static void a(dcx $$0, dtc $$1, jd $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dco $$3, BiConsumer<cuq, jd> $$4) {
      if ($$3.n() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
