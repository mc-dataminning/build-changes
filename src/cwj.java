import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cwj extends cyt {
   public static final MapCodec<cwj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dje.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cwj::new)
   );
   public static final djg b = djf.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final elu e = cvz.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final elu f = cvz.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final elu g = cvz.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final elu h = cvz.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final elu i = cvz.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final elu j = cvz.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final elu k = cvz.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final elu l = cvz.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final elu m = cvz.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final elu n = cvz.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final elu o = cvz.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final elu F = cvz.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final elu G = cvz.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final elu H = cvz.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final elu I = cvz.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final elu J = cvz.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dje N;
   private final int O;

   @Override
   public MapCodec<cwj> a() {
      return a;
   }

   protected cwj(dje $$0, int $$1, dio.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ia.c).a(b, Boolean.valueOf(false)).a(K, dja.b));
      this.O = $$1;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      ia $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dja)$$0.c(K)) {
         case a:
            if ($$4.o() == ia.a.a) {
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
            if ($$4.o() == ia.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$0.c(b)) {
         return bjl.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dmz.a, $$2);
         return bjl.a($$1.B);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dip $$0, csy $$1, hv $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable cer $$0, csz $$1, hv $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), ard.e);
   }

   protected arb a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dip $$0, csy $$1, hv $$2) {
      cex $$3 = this.N.e() ? $$1.a(cex.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dmz.a : dmz.e, $$2);
      }

      if ($$4) {
         $$1.a(new hv($$2), this, this.O);
      }
   }

   private void f(dip $$0, csy $$1, hv $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, b, K);
   }
}
