import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfh extends dhr {
   public static final MapCodec<dfh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfh::new)
   );
   public static final dsr b = dsq.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewi e = dex.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewi f = dex.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewi g = dex.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewi h = dex.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewi i = dex.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewi j = dex.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewi k = dex.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewi l = dex.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewi m = dex.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewi n = dex.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewi o = dex.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewi F = dex.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewi G = dex.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewi H = dex.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewi I = dex.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewi J = dex.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsp N;
   private final int O;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   protected dfh(dsp $$0, int $$1, drz.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsl.b));
      this.O = $$1;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      je $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsl)$$0.c(K)) {
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
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$0.c(b)) {
         return bqs.c;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dwt.a, $$2);
         return bqs.a($$1.B);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dbo $$3, BiConsumer<cun, iz> $$4) {
      if ($$3.j() == dbo.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dsa $$0, dbw $$1, iz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cmv $$0, dbx $$1, iz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awa.e);
   }

   protected avy a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dsa $$0, dbw $$1, iz $$2) {
      cnb $$3 = this.N.e() ? $$1.a(cnb.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dwt.a : dwt.e, $$2);
      }

      if ($$4) {
         $$1.a(new iz($$2), this, this.O);
      }
   }

   private void f(dsa $$0, dbw $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(aE, b, K);
   }
}
