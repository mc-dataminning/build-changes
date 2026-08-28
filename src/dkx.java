import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkx extends dnh {
   public static final MapCodec<dkx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dkx::new)
   );
   public static final dym b = dyl.x;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fcs e = dkm.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcs f = dkm.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcs g = dkm.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fcs h = dkm.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fcs i = dkm.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fcs j = dkm.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fcs k = dkm.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcs l = dkm.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fcs m = dkm.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcs n = dkm.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcs o = dkm.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fcs G = dkm.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fcs H = dkm.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fcs I = dkm.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fcs J = dkm.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcs K = dkm.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dyk O;
   private final int P;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(dyk $$0, int $$1, dxu.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dyg.b));
      this.P = $$1;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dyg)$$0.c(L)) {
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
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$0.c(b)) {
         return btj.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return btj.a;
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, dha $$3, BiConsumer<cxp, jh> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dxv $$0, dhi $$1, jh $$2, @Nullable cpx $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, ecr.a, $$2);
   }

   protected void a(@Nullable cpx $$0, dhj $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), axg.e);
   }

   protected axe a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dxv $$0, dhi $$1, jh $$2) {
      cqe $$3 = this.O.e() ? $$1.a(cqe.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? ecr.a : ecr.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dxv $$0, dhi $$1, jh $$2) {
      jm $$3 = n($$0).g();
      evf $$4 = evb.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF, b, L);
   }
}
