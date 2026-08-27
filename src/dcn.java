import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dcn extends dca {
   public static final MapCodec<dcn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.d(dcd.ah), akk.d(dcd.ai), akk.d(dcd.aj), akk.d(dcd.ak), akk.d(dcd.al)).apply($$0, $$0.stable(dcn::new))
   );
   private final ix<dbw> c;
   private final ix<dbw> d;
   private final ix<dbw> e;
   private final ix<dbw> f;
   private final ix<dbw> g;

   public static dcn a(iy<dbw> $$0) {
      return new dcn($$0.b(dcd.ah), $$0.b(dcd.ai), $$0.b(dcd.aj), $$0.b(dcd.ak), $$0.b(dcd.al));
   }

   private dcn(ix<dbw> $$0, ix<dbw> $$1, ix<dbw> $$2, ix<dbw> $$3, ix<dbw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ix<dbw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dca> a() {
      return b;
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2, dcf.f $$3) {
      int $$4 = ji.c($$0);
      int $$5 = ji.c($$1);
      int $$6 = ji.c($$2);
      int $$7 = jq.a($$4);
      int $$8 = jq.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jq.a($$4) * 2 + 1) * 8;
         int $$10 = (jq.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dwm.e($$9, $$5, $$10));
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
