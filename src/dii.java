import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dii extends dkr {
   public static final MapCodec<dii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dvs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dii::new)
   );
   public static final dvu b = dvt.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fab e = dhy.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fab f = dhy.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fab g = dhy.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fab h = dhy.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fab i = dhy.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fab j = dhy.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fab k = dhy.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fab l = dhy.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fab m = dhy.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fab n = dhy.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fab o = dhy.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fab G = dhy.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fab H = dhy.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fab I = dhy.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fab J = dhy.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fab K = dhy.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dvs O;
   private final int P;

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   protected dii(dvs $$0, int $$1, dvc.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jl.c).b(b, Boolean.valueOf(false)).b(L, dvo.b));
      this.P = $$1;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      jl $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dvo)$$0.c(L)) {
         case a:
            if ($$4.o() == jl.a.a) {
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
            if ($$4.o() == jl.a.a) {
               return $$5 ? m : e;
            } else {
               return $$5 ? n : f;
            }
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$0.c(b)) {
         return bry.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bry.a;
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dvd $$0, dev $$1, jg $$2, @Nullable coh $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eaa.a, $$2);
   }

   protected void a(@Nullable coh $$0, dew $$1, jg $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awl.e);
   }

   protected awj a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dvd $$0, dev $$1, jg $$2) {
      cop $$3 = this.O.e() ? $$1.a(cop.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eaa.a : eaa.e, $$2);
      }

      if ($$4) {
         $$1.a(new jg($$2), this, this.P);
      }
   }

   private void e(dvd $$0, dev $$1, jg $$2) {
      jl $$3 = n($$0).g();
      esm $$4 = esi.a($$1, $$3, $$3.o().d() ? jl.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, b, L);
   }
}
