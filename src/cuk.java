import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cuk extends cws {
   public static final MapCodec<cuk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               t()
            )
            .apply($$0, cuk::new)
   );
   public static final dgs b = dgr.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eiy e = cua.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eiy f = cua.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eiy g = cua.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eiy h = cua.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eiy i = cua.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eiy j = cua.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eiy k = cua.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eiy l = cua.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eiy m = cua.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eiy n = cua.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eiy o = cua.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eiy F = cua.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eiy G = cua.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eiy H = cua.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eiy I = cua.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eiy J = cua.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dgq N;
   private final int O;

   @Override
   public MapCodec<cuk> a() {
      return a;
   }

   protected cuk(dgq $$0, int $$1, dga.d $$2) {
      super($$2.a($$0.f()));
      this.N = $$0;
      this.k(this.E.b().a(aE, hx.c).a(b, Boolean.valueOf(false)).a(K, dgm.b));
      this.O = $$1;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      hx $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dgm)$$0.c(K)) {
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
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$0.c(b)) {
         return bib.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dkl.a, $$2);
         return bib.a($$1.B);
      }
   }

   public void d(dgb $$0, cqz $$1, ht $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable ccx $$0, cra $$1, ht $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aqe.e);
   }

   protected aqc a(boolean $$0) {
      return $$0 ? this.N.n() : this.N.m();
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B && this.N.d() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dgb $$0, cqz $$1, ht $$2) {
      cdd $$3 = this.N.d() ? $$1.a(cdd.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dkl.a : dkl.e, $$2);
      }

      if ($$4) {
         $$1.a(new ht($$2), this, this.O);
      }
   }

   private void f(dgb $$0, cqz $$1, ht $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE, b, K);
   }
}
