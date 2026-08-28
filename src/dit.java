import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dit extends dlc {
   public static final MapCodec<dit> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dwd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dit::new)
   );
   public static final dwf b = dwe.w;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fal e = dij.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fal f = dij.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fal g = dij.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fal h = dij.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fal i = dij.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fal j = dij.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fal k = dij.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fal l = dij.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fal m = dij.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fal n = dij.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fal o = dij.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fal G = dij.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fal H = dij.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fal I = dij.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fal J = dij.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fal K = dij.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dwd O;
   private final int P;

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   protected dit(dwd $$0, int $$1, dvn.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dvz.b));
      this.P = $$1;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dvz)$$0.c(L)) {
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
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$0.c(b)) {
         return bsh.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsh.a;
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if ($$3.f() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dvo $$0, dff $$1, jh $$2, @Nullable cor $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eak.a, $$2);
   }

   protected void a(@Nullable cor $$0, dfg $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awp.e);
   }

   protected awn a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dvo $$0, dff $$1, jh $$2) {
      coy $$3 = this.O.e() ? $$1.a(coy.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eak.a : eak.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dvo $$0, dff $$1, jh $$2) {
      jm $$3 = n($$0).g();
      esw $$4 = ess.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, b, L);
   }
}
