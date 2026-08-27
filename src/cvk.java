import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvk extends cxu {
   public static final MapCodec<cvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cvk::new)
   );
   public static final dhz b = dhy.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ekn e = cva.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ekn f = cva.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ekn g = cva.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ekn h = cva.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ekn i = cva.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ekn j = cva.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ekn k = cva.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ekn l = cva.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ekn m = cva.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ekn n = cva.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ekn o = cva.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ekn F = cva.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ekn G = cva.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ekn H = cva.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ekn I = cva.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ekn J = cva.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dhx N;
   private final int O;

   @Override
   public MapCodec<cvk> a() {
      return a;
   }

   protected cvk(dhx $$0, int $$1, dhh.d $$2) {
      super($$2.a($$0.f()));
      this.N = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(K, dht.b));
      this.O = $$1;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      hx $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dht)$$0.c(K)) {
         case a:
            if ($$4.o() == hx.a.a) {
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
            if ($$4.o() == hx.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$0.c(b)) {
         return bix.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dls.a, $$2);
         return bix.a($$1.B);
      }
   }

   public void d(dhi $$0, csa $$1, ht $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cdu $$0, csb $$1, ht $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aqs.e);
   }

   protected aqq a(boolean $$0) {
      return $$0 ? this.N.n() : this.N.m();
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B && this.N.d() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dhi $$0, csa $$1, ht $$2) {
      cea $$3 = this.N.d() ? $$1.a(cea.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dls.a : dls.e, $$2);
      }

      if ($$4) {
         $$1.a(new ht($$2), this, this.O);
      }
   }

   private void f(dhi $$0, csa $$1, ht $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, b, K);
   }
}
