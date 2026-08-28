import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djv extends dmf {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dxk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, djv::new)
   );
   public static final dxm b = dxl.B;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fbs e = djk.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fbs f = djk.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fbs g = djk.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fbs h = djk.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fbs i = djk.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fbs j = djk.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fbs k = djk.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbs l = djk.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fbs m = djk.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fbs n = djk.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fbs o = djk.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fbs G = djk.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fbs H = djk.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fbs I = djk.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fbs J = djk.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbs K = djk.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dxk O;
   private final int P;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(dxk $$0, int $$1, dwu.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(L, dxg.b));
      this.P = $$1;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      jn $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dxg)$$0.c(L)) {
         case a:
            if ($$4.o() == jn.a.a) {
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
            if ($$4.o() == jn.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$0.c(b)) {
         return bsi.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsi.a;
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dwv $$0, dgg $$1, ji $$2, @Nullable cov $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ebr.a, $$2);
   }

   protected void a(@Nullable cov $$0, dgh $$1, ji $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awa.e);
   }

   protected avy a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dwv $$0, dgg $$1, ji $$2) {
      cpc $$3 = this.O.e() ? $$1.a(cpc.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ebr.a : ebr.e, $$2);
      }

      if ($$4) {
         $$1.a(new ji($$2), this, this.P);
      }
   }

   private void e(dwv $$0, dgg $$1, ji $$2) {
      jn $$3 = n($$0).g();
      euf $$4 = eub.a($$1, $$3, $$3.o().d() ? jn.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF, b, L);
   }
}
