import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djx extends dmh {
   public static final MapCodec<djx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dxm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, djx::new)
   );
   public static final dxo b = dxn.B;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fbu e = djm.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fbu f = djm.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fbu g = djm.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fbu h = djm.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fbu i = djm.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fbu j = djm.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fbu k = djm.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbu l = djm.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fbu m = djm.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fbu n = djm.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fbu o = djm.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fbu G = djm.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fbu H = djm.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fbu I = djm.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fbu J = djm.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fbu K = djm.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dxm O;
   private final int P;

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dxm $$0, int $$1, dww.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(L, dxi.b));
      this.P = $$1;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      jn $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dxi)$$0.c(L)) {
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
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$0.c(b)) {
         return bsk.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bsk.a;
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, dga $$3, BiConsumer<cwp, ji> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dwx $$0, dgi $$1, ji $$2, @Nullable cox $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ebt.a, $$2);
   }

   protected void a(@Nullable cox $$0, dgj $$1, ji $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), awb.e);
   }

   protected avz a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dwx $$0, dgi $$1, ji $$2) {
      cpe $$3 = this.O.e() ? $$1.a(cpe.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ebt.a : ebt.e, $$2);
      }

      if ($$4) {
         $$1.a(new ji($$2), this, this.P);
      }
   }

   private void e(dwx $$0, dgi $$1, ji $$2) {
      jn $$3 = n($$0).g();
      euh $$4 = eud.a($$1, $$3, $$3.o().d() ? jn.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, b, L);
   }
}
