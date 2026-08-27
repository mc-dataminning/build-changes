import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dak extends dcu {
   public static final MapCodec<dak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dno.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, dak::new)
   );
   public static final dnq b = dnp.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eqk e = daa.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eqk f = daa.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eqk g = daa.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eqk h = daa.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eqk i = daa.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eqk j = daa.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eqk k = daa.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eqk l = daa.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eqk m = daa.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eqk n = daa.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eqk o = daa.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eqk F = daa.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eqk G = daa.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eqk H = daa.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eqk I = daa.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eqk J = daa.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dno N;
   private final int O;

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   protected dak(dno $$0, int $$1, dmy.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dnk.b));
      this.O = $$1;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      ih $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dnk)$$0.c(K)) {
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
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$0.c(b)) {
         return bnc.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, drn.a, $$2);
         return bnc.a($$1.B);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dmz $$0, cwz $$1, ib $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cis $$0, cxa $$1, ib $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), atz.e);
   }

   protected atx a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dmz $$0, cwz $$1, ib $$2) {
      ciy $$3 = this.N.e() ? $$1.a(ciy.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? drn.a : drn.e, $$2);
      }

      if ($$4) {
         $$1.a(new ib($$2), this, this.O);
      }
   }

   private void f(dmz $$0, cwz $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE, b, K);
   }
}
