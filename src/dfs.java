import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfs extends dic {
   public static final MapCodec<dfs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dta.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfs::new)
   );
   public static final dtc b = dtb.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final exa e = dfi.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exa f = dfi.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exa g = dfi.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final exa h = dfi.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final exa i = dfi.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final exa j = dfi.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final exa k = dfi.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exa l = dfi.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final exa m = dfi.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final exa n = dfi.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final exa o = dfi.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final exa F = dfi.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final exa G = dfi.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final exa H = dfi.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final exa I = dfi.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final exa J = dfi.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dta N;
   private final int O;

   @Override
   public MapCodec<dfs> a() {
      return a;
   }

   protected dfs(dta $$0, int $$1, dsk.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(K, dsw.b));
      this.O = $$1;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      jf $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsw)$$0.c(K)) {
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
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$0.c(b)) {
         return bqh.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bqh.a($$1.B);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dby $$3, BiConsumer<cud, ja> $$4) {
      if ($$3.n() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dsl $$0, dcg $$1, ja $$2, @Nullable cml $$3) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dxh.a, $$2);
   }

   protected void a(@Nullable cml $$0, dch $$1, ja $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avi.e);
   }

   protected avg a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsl $$0, dcg $$1, ja $$2) {
      cmr $$3 = this.N.e() ? $$1.a(cmr.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxh.a : dxh.e, $$2);
      }

      if ($$4) {
         $$1.a(new ja($$2), this, this.O);
      }
   }

   private void e(dsl $$0, dcg $$1, ja $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, b, K);
   }
}
