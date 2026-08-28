import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dja extends dlj {
   public static final MapCodec<dja> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dwk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dja::new)
   );
   public static final dwm b = dwl.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fas e = diq.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fas f = diq.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fas g = diq.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fas h = diq.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fas i = diq.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fas j = diq.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fas k = diq.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fas l = diq.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fas m = diq.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fas n = diq.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fas o = diq.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fas G = diq.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fas H = diq.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fas I = diq.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fas J = diq.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fas K = diq.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dwk O;
   private final int P;

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   protected dja(dwk $$0, int $$1, dvu.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dwg.b));
      this.P = $$1;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dwg)$$0.c(L)) {
         case a:
            if ($$4.o() == jm.a.a) {
               return $$5 ? o : g;
            }

            return $$5 ? G : h;
         case b:
            return switch ($$4) {
               case f -> $$5 ? K : l;
               case e -> $$5 ? J : k;
               case d -> $$5 ? I : j;
               case c, b, a -> $$5 ? H : i;
            };
         case c:
         default:
            if ($$4.o() == jm.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$0.c(b)) {
         return bsk.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsk.a;
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, dfe $$3, BiConsumer<cwm, jh> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dvv $$0, dfm $$1, jh $$2, @Nullable cou $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ear.a, $$2);
   }

   protected void a(@Nullable cou $$0, dfn $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awo.e);
   }

   protected awm a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dvv $$0, dfm $$1, jh $$2) {
      cpb $$3 = this.O.e() ? $$1.a(cpb.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ear.a : ear.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dvv $$0, dfm $$1, jh $$2) {
      jm $$3 = n($$0).g();
      etd $$4 = esz.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, b, L);
   }
}
