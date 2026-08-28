import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfl extends dhv {
   public static final MapCodec<dfl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dst.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfl::new)
   );
   public static final dsv b = dsu.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewm e = dfb.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewm f = dfb.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewm g = dfb.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewm h = dfb.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewm i = dfb.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewm j = dfb.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewm k = dfb.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewm l = dfb.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewm m = dfb.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewm n = dfb.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewm o = dfb.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewm F = dfb.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewm G = dfb.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewm H = dfb.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewm I = dfb.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewm J = dfb.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dst N;
   private final int O;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dst $$0, int $$1, dsd.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsp.b));
      this.O = $$1;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      je $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsp)$$0.c(K)) {
         case a:
            if ($$4.o() == je.a.a) {
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
            if ($$4.o() == je.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$0.c(b)) {
         return bqw.c;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dwx.a, $$2);
         return bqw.a($$1.B);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dse $$0, dca $$1, iz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cmz $$0, dcb $$1, iz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awb.e);
   }

   protected avz a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dse $$0, dca $$1, iz $$2) {
      cnf $$3 = this.N.e() ? $$1.a(cnf.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dwx.a : dwx.e, $$2);
      }

      if ($$4) {
         $$1.a(new iz($$2), this, this.O);
      }
   }

   private void f(dse $$0, dca $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE, b, K);
   }
}
