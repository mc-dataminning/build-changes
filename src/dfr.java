import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfr extends dib {
   public static final MapCodec<dfr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsz.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfr::new)
   );
   public static final dtb b = dta.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewy e = dfh.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewy f = dfh.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewy g = dfh.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewy h = dfh.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewy i = dfh.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewy j = dfh.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewy k = dfh.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewy l = dfh.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewy m = dfh.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewy n = dfh.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewy o = dfh.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewy F = dfh.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewy G = dfh.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewy H = dfh.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewy I = dfh.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewy J = dfh.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsz N;
   private final int O;

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(dsz $$0, int $$1, dsj.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(K, dsv.b));
      this.O = $$1;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      jf $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsv)$$0.c(K)) {
         case a:
            if ($$4.o() == jf.a.a) {
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
            if ($$4.o() == jf.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$0.c(b)) {
         return bqg.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bqg.a($$1.B);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dsk $$0, dcf $$1, ja $$2, @Nullable cmk $$3) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, false);
      $$1.a($$3, dxg.a, $$2);
   }

   protected void a(@Nullable cmk $$0, dcg $$1, ja $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avi.e);
   }

   protected avg a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsk $$0, dcf $$1, ja $$2) {
      cmq $$3 = this.N.e() ? $$1.a(cmq.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxg.a : dxg.e, $$2);
      }

      if ($$4) {
         $$1.a(new ja($$2), this, this.O);
      }
   }

   private void e(dsk $$0, dcf $$1, ja $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, b, K);
   }
}
