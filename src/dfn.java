import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class dfn extends dgv {
   public static final int a = 3;
   public static final dur b = duq.r;

   @Override
   protected abstract MapCodec<? extends dfn> a();

   protected dfn(dtz.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eye> b(dua var1);

   public static boolean c(dua $$0) {
      return $$0.b(b) && ($$0.a(aws.af) || $$0.a(aws.bl)) && $$0.c(b);
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      if (!$$0.B && $$3.bV() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dua $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(dds $$0, eye $$1, azk $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(ln.ae, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.d + 0.5, $$1.e + 0.5, $$1.f + 0.5, awd.dK, awe.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(ln.aJ, $$1.d, $$1.e, $$1.f, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cnp $$0, dua $$1, ddt $$2, je $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof dfn) {
         ((dfn)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(ln.ae, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, awd.dM, awe.e, 1.0F, 1.0F);
      $$2.a($$0, dyx.c, $$3);
   }

   private static void a(ddt $$0, dua $$1, je $$2, boolean $$3) {
      $$0.a($$2, $$1.b(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
