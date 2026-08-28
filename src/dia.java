import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dia extends dhn {
   public static final MapCodec<dia> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.d(dhq.ai), akt.d(dhq.aj), akt.d(dhq.ak), akt.d(dhq.al), akt.d(dhq.am)).apply($$0, $$0.stable(dia::new))
   );
   private final jr<dhj> c;
   private final jr<dhj> d;
   private final jr<dhj> e;
   private final jr<dhj> f;
   private final jr<dhj> g;

   public static dia a(js<dhj> $$0) {
      return new dia($$0.b(dhq.ai), $$0.b(dhq.aj), $$0.b(dhq.ak), $$0.b(dhq.al), $$0.b(dhq.am));
   }

   private dia(jr<dhj> $$0, jr<dhj> $$1, jr<dhj> $$2, jr<dhj> $$3, jr<dhj> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jr<dhj>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dhn> a() {
      return b;
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2, dhs.f $$3) {
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
         double $$11 = $$3.e().a(new eck.e($$9, $$5, $$10));
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
