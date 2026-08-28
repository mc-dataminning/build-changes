import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnc extends dlj {
   public static final MapCodec<dnc> a = b(dnc::new);
   public static final dwm b = dwl.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final fas f = diq.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final fas g = diq.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final fas h = diq.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final fas i = diq.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final fas j = diq.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final fas k = diq.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final fas l = diq.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final fas m = diq.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dwg.b));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((dwg)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jm)$$0.c(aF)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aF).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1.C) {
         dvv $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bsk.a;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dvv $$0, dfm $$1, jh $$2, @Nullable cou $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? ear.a : ear.e, $$2);
   }

   protected static void a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awn.nT, awo.e, 0.3F, $$4);
   }

   private static void a(dvv $$0, dfn $$1, jh $$2, float $$3) {
      jm $$4 = $$0.c(aF).g();
      jm $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ln(ln.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   private void e(dvv $$0, dfm $$1, jh $$2) {
      jm $$3 = n($$0).g();
      etd $$4 = esz.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(L, aF, b);
   }
}
