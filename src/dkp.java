import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dkp extends dkc {
   public static final MapCodec<dkp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.d(dkf.ai), ale.d(dkf.aj), ale.d(dkf.ak), ale.d(dkf.al), ale.d(dkf.am)).apply($$0, $$0.stable(dkp::new))
   );
   private final je<djy> c;
   private final je<djy> d;
   private final je<djy> e;
   private final je<djy> f;
   private final je<djy> g;

   public static dkp a(jf<djy> $$0) {
      return new dkp($$0.b(dkf.ai), $$0.b(dkf.aj), $$0.b(dkf.ak), $$0.b(dkf.al), $$0.b(dkf.am));
   }

   private dkp(je<djy> $$0, je<djy> $$1, je<djy> $$2, je<djy> $$3, je<djy> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<je<djy>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dkc> a() {
      return b;
   }

   @Override
   public je<djy> getNoiseBiome(int $$0, int $$1, int $$2, dkh.f $$3) {
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
         double $$11 = $$3.e().a(new efr.e($$9, $$5, $$10));
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
