import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class czp extends dbz {
   public static final MapCodec<czp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dmt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, czp::new)
   );
   public static final dmv b = dmu.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final epo e = czf.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final epo f = czf.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final epo g = czf.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final epo h = czf.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final epo i = czf.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final epo j = czf.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final epo k = czf.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final epo l = czf.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final epo m = czf.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final epo n = czf.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final epo o = czf.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final epo F = czf.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final epo G = czf.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final epo H = czf.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final epo I = czf.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final epo J = czf.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dmt N;
   private final int O;

   @Override
   public MapCodec<czp> a() {
      return a;
   }

   protected czp(dmt $$0, int $$1, dmd.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dmp.b));
      this.O = $$1;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      ih $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dmp)$$0.c(K)) {
         case a:
            if ($$4.o() == ih.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? F : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? J : l;
               case e -> $$5 ? I : k;
               case d -> $$5 ? H : j;
               case c, b, a -> $$5 ? G : i;
            };
         case c:
         default:
            if ($$4.o() == ih.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$0.c(b)) {
         return bml.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dqr.a, $$2);
         return bml.a($$1.B);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dme $$0, cwe $$1, ib $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cia $$0, cwf $$1, ib $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), atq.e);
   }

   protected ato a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dme $$0, cwe $$1, ib $$2) {
      cig $$3 = this.N.e() ? $$1.a(cig.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dqr.a : dqr.e, $$2);
      }

      if ($$4) {
         $$1.a(new ib($$2), this, this.O);
      }
   }

   private void f(dme $$0, cwe $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, b, K);
   }
}
