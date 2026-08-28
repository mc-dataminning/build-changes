import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkj extends djw {
   public static final MapCodec<dkj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.d(djz.ai), alc.d(djz.aj), alc.d(djz.ak), alc.d(djz.al), alc.d(djz.am)).apply($$0, $$0.stable(dkj::new))
   );
   private final je<djs> c;
   private final je<djs> d;
   private final je<djs> e;
   private final je<djs> f;
   private final je<djs> g;

   public static dkj a(jf<djs> $$0) {
      return new dkj($$0.b(djz.ai), $$0.b(djz.aj), $$0.b(djz.ak), $$0.b(djz.al), $$0.b(djz.am));
   }

   private dkj(je<djs> $$0, je<djs> $$1, je<djs> $$2, je<djs> $$3, je<djs> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<je<djs>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends djw> a() {
      return b;
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2, dkb.f $$3) {
      int $$4 = jp.c($$0);
      int $$5 = jp.c($$1);
      int $$6 = jp.c($$2);
      int $$7 = jx.a($$4);
      int $$8 = jx.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jx.a($$4) * 2 + 1) * 8;
         int $$10 = (jx.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new efg.e($$9, $$5, $$10));
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
