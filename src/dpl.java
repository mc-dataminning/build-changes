import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpl extends dnp {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final dzd b = dzc.A;
   private final Function<dym, fdo> d;

   @Override
   public MapCodec<dpl> a() {
      return a;
   }

   protected dpl(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jo.c).b(b, Boolean.valueOf(false)).b(c, dyx.b));
      this.d = this.b();
   }

   private Function<dym, fdo> b() {
      Map<dyx, Map<jo, fdo>> $$0 = fdl.e(dku.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new dzp[]{b});
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.C) {
         dym $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return btq.a;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, dhi $$3, BiConsumer<cxy, jj> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dym $$0, dhp $$1, jj $$2, @Nullable cqi $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? edm.a : edm.e, $$2);
   }

   protected static void a(@Nullable cqi $$0, dhq $$1, jj $$2, dym $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awk.oC, awl.e, 0.3F, $$4);
   }

   private static void a(dym $$0, dhq $$1, jj $$2, float $$3) {
      jo $$4 = $$0.c(e).g();
      jo $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lq(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   private void e(dym $$0, dhp $$1, jj $$2) {
      jo $$3 = n($$0).g();
      ewb $$4 = evx.a($$1, $$3, $$3.o().d() ? jo.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, e, b);
   }
}
