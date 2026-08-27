import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ctm extends cvu {
   public static final MapCodec<ctm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               t()
            )
            .apply($$0, ctm::new)
   );
   public static final dfu b = dft.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eia e = ctc.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eia f = ctc.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eia g = ctc.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eia h = ctc.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eia i = ctc.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eia j = ctc.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eia k = ctc.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eia l = ctc.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eia m = ctc.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eia n = ctc.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eia o = ctc.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eia F = ctc.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eia G = ctc.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eia H = ctc.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eia I = ctc.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eia J = ctc.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dfs N;
   private final int O;

   @Override
   public MapCodec<ctm> a() {
      return a;
   }

   protected ctm(dfs $$0, int $$1, dfc.d $$2) {
      super($$2.a($$0.f()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ha.c).a(b, Boolean.valueOf(false)).a(K, dfo.b));
      this.O = $$1;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ha $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dfo)$$0.c(K)) {
         case a:
            if ($$4.o() == ha.a.a) {
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
            if ($$4.o() == ha.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$0.c(b)) {
         return bhe.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, djn.a, $$2);
         return bhe.a($$1.B);
      }
   }

   public void d(dfd $$0, cqb $$1, gw $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cca $$0, cqc $$1, gw $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aph.e);
   }

   protected apf a(boolean $$0) {
      return $$0 ? this.N.n() : this.N.m();
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B && this.N.d() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dfd $$0, cqb $$1, gw $$2) {
      ccg $$3 = this.N.d() ? $$1.a(ccg.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? djn.a : djn.e, $$2);
      }

      if ($$4) {
         $$1.a(new gw($$2), this, this.O);
      }
   }

   private void f(dfd $$0, cqb $$1, gw $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, b, K);
   }
}
