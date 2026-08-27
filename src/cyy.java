import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cyy extends dbi {
   public static final MapCodec<cyy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dlu.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.N),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.O),
               u()
            )
            .apply($$0, cyy::new)
   );
   public static final dlw b = dlv.w;
   private static final int L = 1;
   private static final int M = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final eol e = cyo.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eol f = cyo.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eol g = cyo.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final eol h = cyo.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final eol i = cyo.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final eol j = cyo.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final eol k = cyo.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eol l = cyo.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final eol m = cyo.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final eol n = cyo.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final eol o = cyo.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final eol F = cyo.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final eol G = cyo.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final eol H = cyo.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final eol I = cyo.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eol J = cyo.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dlu N;
   private final int O;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   protected cyy(dlu $$0, int $$1, dle.d $$2) {
      super($$2.a($$0.g()));
      this.N = $$0;
      this.k(this.E.b().a(aE, ie.c).a(b, Boolean.valueOf(false)).a(K, dlq.b));
      this.O = $$1;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      ie $$4 = $$0.c(aE);
      boolean $$5 = $$0.c(b);
      switch ((dlq)$$0.c(K)) {
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
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$0.c(b)) {
         return blu.b;
      } else {
         this.d($$0, $$1, $$2);
         this.a($$3, $$1, $$2, true);
         $$1.a($$3, dpp.a, $$2);
         return blu.a($$1.B);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if ($$3.j() == cvf.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void d(dlf $$0, cvn $$1, hz $$2) {
      $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, this.O);
   }

   protected void a(@Nullable chh $$0, cvo $$1, hz $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), atl.e);
   }

   protected atj a(boolean $$0) {
      return $$0 ? this.N.o() : this.N.n();
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B && this.N.e() && !$$0.c(b)) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dlf $$0, cvn $$1, hz $$2) {
      chn $$3 = this.N.e() ? $$1.a(chn.class, $$0.j($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf($$4)), 3);
         this.f($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dpp.a : dpp.e, $$2);
      }

      if ($$4) {
         $$1.a(new hz($$2), this, this.O);
      }
   }

   private void f(dlf $$0, cvn $$1, hz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(aE, b, K);
   }
}
