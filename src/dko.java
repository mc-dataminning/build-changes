import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dko extends dmy {
   public static final MapCodec<dko> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dyd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.O),
               Codec.intRange(1, 1024).fieldOf("ticks_to_stay_pressed").forGetter($$0x -> $$0x.P),
               t()
            )
            .apply($$0, dko::new)
   );
   public static final dyf b = dye.B;
   private static final int M = 1;
   private static final int N = 2;
   protected static final int c = 2;
   protected static final int d = 3;
   protected static final fcl e = dkd.a(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcl f = dkd.a(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcl g = dkd.a(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   protected static final fcl h = dkd.a(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   protected static final fcl i = dkd.a(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   protected static final fcl j = dkd.a(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   protected static final fcl k = dkd.a(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcl l = dkd.a(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   protected static final fcl m = dkd.a(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   protected static final fcl n = dkd.a(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   protected static final fcl o = dkd.a(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   protected static final fcl G = dkd.a(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   protected static final fcl H = dkd.a(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   protected static final fcl I = dkd.a(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   protected static final fcl J = dkd.a(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   protected static final fcl K = dkd.a(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final dyd O;
   private final int P;

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   protected dko(dyd $$0, int $$1, dxn.d $$2) {
      super($$2.a($$0.g()));
      this.O = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(L, dxz.b));
      this.P = $$1;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      jm $$4 = $$0.c(aF);
      boolean $$5 = $$0.c(b);
      switch ((dxz)$$0.c(L)) {
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
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$0.c(b)) {
         return bta.c;
      } else {
         this.a($$0, $$1, $$2, $$3);
         return bta.a;
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, dgr $$3, BiConsumer<cxg, jh> $$4) {
      if ($$3.g() && !$$0.c(b)) {
         this.a($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(dxo $$0, dgz $$1, jh $$2, @Nullable cpo $$3) {
      $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, this.P);
      this.a($$3, $$1, $$2, true);
      $$1.a($$3, eck.a, $$2);
   }

   protected void a(@Nullable cpo $$0, dha $$1, jh $$2, boolean $$3) {
      $$1.a($$3 ? $$0 : null, $$2, this.a($$3), aww.e);
   }

   protected awu a(boolean $$0) {
      return $$0 ? this.O.o() : this.O.n();
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$1.C && this.O.e() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dxo $$0, dgz $$1, jh $$2) {
      cpv $$3 = this.O.e() ? $$1.a(cpv.class, $$0.f($$1, $$2).a().a($$2)).stream().findFirst().orElse(null) : null;
      boolean $$4 = $$3 != null;
      boolean $$5 = $$0.c(b);
      if ($$4 != $$5) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf($$4)), 3);
         this.e($$0, $$1, $$2);
         this.a(null, $$1, $$2, $$4);
         $$1.a($$3, $$4 ? eck.a : eck.e, $$2);
      }

      if ($$4) {
         $$1.a(new jh($$2), this, this.P);
      }
   }

   private void e(dxo $$0, dgz $$1, jh $$2) {
      jm $$3 = n($$0).g();
      euy $$4 = euu.a($$1, $$3, $$3.o().d() ? jm.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(aF, b, L);
   }
}
