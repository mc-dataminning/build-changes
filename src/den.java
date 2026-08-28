import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class den extends dea {
   public static final MapCodec<den> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.d(ded.ah), akp.d(ded.ai), akp.d(ded.aj), akp.d(ded.ak), akp.d(ded.al)).apply($$0, $$0.stable(den::new))
   );
   private final jm<ddw> c;
   private final jm<ddw> d;
   private final jm<ddw> e;
   private final jm<ddw> f;
   private final jm<ddw> g;

   public static den a(jn<ddw> $$0) {
      return new den($$0.b(ded.ah), $$0.b(ded.ai), $$0.b(ded.aj), $$0.b(ded.ak), $$0.b(ded.al));
   }

   private den(jm<ddw> $$0, jm<ddw> $$1, jm<ddw> $$2, jm<ddw> $$3, jm<ddw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jm<ddw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dea> a() {
      return b;
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2, def.f $$3) {
      int $$4 = jx.c($$0);
      int $$5 = jx.c($$1);
      int $$6 = jx.c($$2);
      int $$7 = kf.a($$4);
      int $$8 = kf.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kf.a($$4) * 2 + 1) * 8;
         int $$10 = (kf.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dyr.e($$9, $$5, $$10));
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
