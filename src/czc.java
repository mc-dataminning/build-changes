import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class czc extends dbm {
   public static final MapCodec<czc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dly.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, czc::new)
   );
   public static final dma b = dlz.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eos e = cys.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eos f = cys.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eos g = cys.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eos h = cys.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eos i = cys.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eos j = cys.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eos k = cys.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eos l = cys.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eos m = cys.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eos n = cys.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eos o = cys.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eos F = cys.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eos G = cys.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eos H = cys.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eos I = cys.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eos J = cys.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dly N;
   private final int O;

   @Override
   public MapCodec<czc> a() {
      return a;
   }

   protected czc(dly $$0, int $$1, dli.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ie.c).a(b, Boolean.valueOf(false)).a(K, dlu.b));
      this.O = $$1;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      ie $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dlu)$$0.c(K)) {
         case a:
            if ($$4.o() == ie.a.a) {
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
            if ($$4.o() == ie.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$0.c(b)) {
         return blw.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dpw.a, $$2);
         return blw.a($$1.B);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if ($$3.j() == cvj.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dlj $$0, cvr $$1, hz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable chl $$0, cvs $$1, hz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), atm.e);
   }

   protected atk a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dlj $$0, cvr $$1, hz $$2) {
      chr $$3 = this.N.e() ? $$1.a(chr.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dpw.a : dpw.e, $$2);
      }

      if ($$4) {
         $$1.a(new hz($$2), this, this.O);
      }
   }

   private void f(dlj $$0, cvr $$1, hz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE, b, K);
   }
}
