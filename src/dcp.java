import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dcp extends dcc {
   public static final MapCodec<dcp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.d(dcf.ah), akl.d(dcf.ai), akl.d(dcf.aj), akl.d(dcf.ak), akl.d(dcf.al)).apply($$0, $$0.stable(dcp::new))
   );
   private final ix<dby> c;
   private final ix<dby> d;
   private final ix<dby> e;
   private final ix<dby> f;
   private final ix<dby> g;

   public static dcp a(iy<dby> $$0) {
      return new dcp($$0.b(dcf.ah), $$0.b(dcf.ai), $$0.b(dcf.aj), $$0.b(dcf.ak), $$0.b(dcf.al));
   }

   private dcp(ix<dby> $$0, ix<dby> $$1, ix<dby> $$2, ix<dby> $$3, ix<dby> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ix<dby>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dcc> a() {
      return b;
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2, dch.f $$3) {
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
         double $$11 = $$3.e().a(new dwo.e($$9, $$5, $$10));
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
