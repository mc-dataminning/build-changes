import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfe extends dho {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dsm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dfe::new)
   );
   public static final dso b = dsn.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ewf e = deu.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewf f = deu.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewf g = deu.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ewf h = deu.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ewf i = deu.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ewf j = deu.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ewf k = deu.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewf l = deu.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ewf m = deu.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ewf n = deu.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ewf o = deu.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ewf F = deu.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ewf G = deu.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ewf H = deu.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ewf I = deu.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ewf J = deu.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dsm N;
   private final int O;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   protected dfe(dsm $$0, int $$1, drw.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsi.b));
      this.O = $$1;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      je $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dsi)$$0.c(K)) {
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
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$0.c(b)) {
         return bqp.c;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dwq.a, $$2);
         return bqp.a($$1.B);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, dbl $$3, BiConsumer<cuk, iz> $$4) {
      if ($$3.j() == dbl.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(drx $$0, dbt $$1, iz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cms $$0, dbu $$1, iz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), avx.e);
   }

   protected avv a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(drx $$0, dbt $$1, iz $$2) {
      cmy $$3 = this.N.e() ? $$1.a(cmy.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dwq.a : dwq.e, $$2);
      }

      if ($$4) {
         $$1.a(new iz($$2), this, this.O);
      }
   }

   private void f(drx $$0, dbt $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, b, K);
   }
}
