import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cvn extends cva {
   public static final Codec<cvn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahf.d(cvd.ah), ahf.d(cvd.ai), ahf.d(cvd.aj), ahf.d(cvd.ak), ahf.d(cvd.al)).apply($$0, $$0.stable(cvn::new))
   );
   private final ih<cuw> c;
   private final ih<cuw> d;
   private final ih<cuw> e;
   private final ih<cuw> f;
   private final ih<cuw> g;

   public static cvn a(ii<cuw> $$0) {
      return new cvn($$0.b(cvd.ah), $$0.b(cvd.ai), $$0.b(cvd.aj), $$0.b(cvd.ak), $$0.b(cvd.al));
   }

   private cvn(ih<cuw> $$0, ih<cuw> $$1, ih<cuw> $$2, ih<cuw> $$3, ih<cuw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ih<cuw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cva> a() {
      return b;
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2, cvf.f $$3) {
      int $$4 = is.c($$0);
      int $$5 = is.c($$1);
      int $$6 = is.c($$2);
      int $$7 = iz.a($$4);
      int $$8 = iz.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iz.a($$4) * 2 + 1) * 8;
         int $$10 = (iz.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dor.e($$9, $$5, $$10));
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
