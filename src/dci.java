import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dci extends des {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dpo.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dci::new)
   );
   public static final dpq b = dpp.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final est e = dby.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final est f = dby.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final est g = dby.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final est h = dby.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final est i = dby.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final est j = dby.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final est k = dby.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final est l = dby.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final est m = dby.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final est n = dby.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final est o = dby.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final est F = dby.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final est G = dby.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final est H = dby.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final est I = dby.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final est J = dby.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dpo N;
   private final int O;

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   protected dci(dpo $$0, int $$1, doy.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dpk.b));
      this.O = $$1;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      ih $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dpk)$$0.c(K)) {
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
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$0.c(b)) {
         return boa.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dts.a, $$2);
         return boa.a($$1.B);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(doz $$0, cyx $$1, ib $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cjt $$0, cyy $$1, ib $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aun.e);
   }

   protected aul a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(doz $$0, cyx $$1, ib $$2) {
      cjz $$3 = this.N.e() ? $$1.a(cjz.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dts.a : dts.e, $$2);
      }

      if ($$4) {
         $$1.a(new ib($$2), this, this.O);
      }
   }

   private void f(doz $$0, cyx $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, b, K);
   }
}
