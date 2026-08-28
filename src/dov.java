import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dov extends dmz {
   public static final MapCodec<dov> a = b(dov::new);
   public static final dyh b = dyg.A;
   private final Function<dxq, fcr> d;

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jn.c).b(b, Boolean.valueOf(false)).b(c, dyb.b));
      this.d = this.b();
   }

   private Function<dxq, fcr> b() {
      Map<dyb, Map<jn, fcr>> $$0 = fco.e(dke.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new dyt[]{b});
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.C) {
         dxq $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bsy.a;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, dgs $$3, BiConsumer<cxh, ji> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dxq $$0, dgz $$1, ji $$2, @Nullable cpr $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ecp.a : ecp.e, $$2);
   }

   protected static void a(@Nullable cpr $$0, dha $$1, ji $$2, dxq $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awa.oC, awb.e, 0.3F, $$4);
   }

   private static void a(dxq $$0, dha $$1, ji $$2, float $$3) {
      jn $$4 = $$0.c(e).g();
      jn $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lo(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   private void e(dxq $$0, dgz $$1, ji $$2) {
      jn $$3 = n($$0).g();
      eve $$4 = eva.a($$1, $$3, $$3.o().d() ? jn.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, e, b);
   }
}
