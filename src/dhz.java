import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dhz extends dhm {
   public static final MapCodec<dhz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aks.d(dhp.ai), aks.d(dhp.aj), aks.d(dhp.ak), aks.d(dhp.al), aks.d(dhp.am)).apply($$0, $$0.stable(dhz::new))
   );
   private final jr<dhi> c;
   private final jr<dhi> d;
   private final jr<dhi> e;
   private final jr<dhi> f;
   private final jr<dhi> g;

   public static dhz a(js<dhi> $$0) {
      return new dhz($$0.b(dhp.ai), $$0.b(dhp.aj), $$0.b(dhp.ak), $$0.b(dhp.al), $$0.b(dhp.am));
   }

   private dhz(jr<dhi> $$0, jr<dhi> $$1, jr<dhi> $$2, jr<dhi> $$3, jr<dhi> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jr<dhi>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dhm> a() {
      return b;
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2, dhr.f $$3) {
      int $$4 = kc.c($$0);
      int $$5 = kc.c($$1);
      int $$6 = kc.c($$2);
      int $$7 = kk.a($$4);
      int $$8 = kk.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kk.a($$4) * 2 + 1) * 8;
         int $$10 = (kk.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new ecj.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
