import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dht extends dkd {
   public static final MapCodec<dht> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dvd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               u()
            )
            .apply($$0, dht::new)
   );
   public static final dvf b = dve.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final ezm e = dhj.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ezm f = dhj.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ezm g = dhj.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final ezm h = dhj.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final ezm i = dhj.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final ezm j = dhj.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final ezm k = dhj.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezm l = dhj.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final ezm m = dhj.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final ezm n = dhj.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final ezm o = dhj.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final ezm G = dhj.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final ezm H = dhj.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final ezm I = dhj.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final ezm J = dhj.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ezm K = dhj.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dvd O;
   private final int P;

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   protected dht(dvd $$0, int $$1, dun.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jj.c).b(b, Boolean.valueOf(false)).b(L, duz.b));
      this.P = $$1;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      jj $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((duz)$$0.c(L)) {
         case a:
            if ($$4.o() == jj.a.a) {
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
            if ($$4.o() == jj.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$0.c(b)) {
         return brp.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return brp.a;
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(duo $$0, deg $$1, je $$2, @Nullable cnu $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, dzl.a, $$2);
   }

   protected void a(@Nullable cnu $$0, deh $$1, je $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awf.e);
   }

   protected awd a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(duo $$0, deg $$1, je $$2) {
      cob $$3 = this.O.e() ? $$1.a(cob.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? dzl.a : dzl.e, $$2);
      }

      if ($$4) {
         $$1.a(new je($$2), this, this.P);
      }
   }

   private void e(duo $$0, deg $$1, je $$2) {
      jj $$3 = n($$0).g();
      erx $$4 = ert.a($$1, $$3, $$3.o().d() ? jj.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, b, L);
   }
}
