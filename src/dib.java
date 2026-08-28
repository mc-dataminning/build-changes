import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dib extends dho {
   public static final MapCodec<dib> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aks.d(dhr.ai), aks.d(dhr.aj), aks.d(dhr.ak), aks.d(dhr.al), aks.d(dhr.am)).apply($$0, $$0.stable(dib::new))
   );
   private final jr<dhk> c;
   private final jr<dhk> d;
   private final jr<dhk> e;
   private final jr<dhk> f;
   private final jr<dhk> g;

   public static dib a(js<dhk> $$0) {
      return new dib($$0.b(dhr.ai), $$0.b(dhr.aj), $$0.b(dhr.ak), $$0.b(dhr.al), $$0.b(dhr.am));
   }

   private dib(jr<dhk> $$0, jr<dhk> $$1, jr<dhk> $$2, jr<dhk> $$3, jr<dhk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jr<dhk>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dho> a() {
      return b;
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2, dht.f $$3) {
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
         double $$11 = $$3.e().a(new ecl.e($$9, $$5, $$10));
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
