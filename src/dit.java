import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dit extends dig {
   public static final MapCodec<dit> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aks.d(dij.ai), aks.d(dij.aj), aks.d(dij.ak), aks.d(dij.al), aks.d(dij.am)).apply($$0, $$0.stable(dit::new))
   );
   private final jr<dic> c;
   private final jr<dic> d;
   private final jr<dic> e;
   private final jr<dic> f;
   private final jr<dic> g;

   public static dit a(js<dic> $$0) {
      return new dit($$0.b(dij.ai), $$0.b(dij.aj), $$0.b(dij.ak), $$0.b(dij.al), $$0.b(dij.am));
   }

   private dit(jr<dic> $$0, jr<dic> $$1, jr<dic> $$2, jr<dic> $$3, jr<dic> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jr<dic>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return b;
   }

   @Override
   public jr<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
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
         double $$11 = $$3.e().a(new edh.e($$9, $$5, $$10));
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
