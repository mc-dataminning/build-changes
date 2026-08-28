import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfp extends dhz {
   public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfp::new)
   );
   public static final dsy b = dsx.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ews e = dff.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ews f = dff.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ews g = dff.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ews h = dff.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ews i = dff.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ews j = dff.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ews k = dff.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ews l = dff.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ews m = dff.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ews n = dff.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ews o = dff.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ews F = dff.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ews G = dff.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ews H = dff.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ews I = dff.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ews J = dff.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsw N;
   private final int O;

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   protected dfp(dsw $$0, int $$1, dsg.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(K, dss.b));
      this.O = $$1;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      jf $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dss)$$0.c(K)) {
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
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$0.c(b)) {
         return bqd.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bqd.a($$1.B);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dsh $$0, dcd $$1, ja $$2, @Nullable cmh $$3) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
      this.a($$3, $$1, $$2, false);
      $$1.a($$3, dxa.a, $$2);
   }

   protected void a(@Nullable cmh $$0, dce $$1, ja $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avg.e);
   }

   protected ave a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dsh $$0, dcd $$1, ja $$2) {
      cmn $$3 = this.N.e() ? $$1.a(cmn.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dxa.a : dxa.e, $$2);
      }

      if ($$4) {
         $$1.a(new ja($$2), this, this.O);
      }
   }

   private void e(dsh $$0, dcd $$1, ja $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, b, K);
   }
}
