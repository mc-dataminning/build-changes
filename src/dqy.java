import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqy extends dpb {
   public static final MapCodec<dqy> a = b(dqy::new);
   public static final eay b = eax.A;
   private final Function<eah, ffk> d;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, ja.c).b(b, Boolean.valueOf(false)).b(c, eas.b));
      this.d = this.b();
   }

   private Function<eah, ffk> b() {
      Map<eas, Map<ja, ffk>> $$0 = ffh.e(dmf.b(6.0, 8.0, 10.0, 16.0));
      return this.a($$1 -> $$0.get($$1.c(c)).get($$1.c(e)), new ebk[]{b});
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.C) {
         eah $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bud.a;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, dit $$3, BiConsumer<czd, iu> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(eah $$0, dja $$1, iu $$2, @Nullable crc $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? efh.a : efh.e, $$2);
   }

   protected static void a(@Nullable crc $$0, djb $$1, iu $$2, eah $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awn.oG, awo.e, 0.3F, $$4);
   }

   private static void a(eah $$0, djb $$1, iu $$2, float $$3) {
      ja $$4 = $$0.c(e).g();
      ja $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ls(16711680, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3 && $$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   private void d(eah $$0, dja $$1, iu $$2) {
      ja $$3 = n($$0).g();
      exw $$4 = exs.a($$1, $$3, $$3.o().d() ? ja.b : $$0.c(e));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, e, b);
   }
}
