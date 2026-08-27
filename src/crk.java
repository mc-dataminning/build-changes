import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crk extends cqx {
   public static final Codec<crk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeu.d(cra.ah), aeu.d(cra.ai), aeu.d(cra.aj), aeu.d(cra.ak), aeu.d(cra.al)).apply($$0, $$0.stable(crk::new))
   );
   private final he<cqt> c;
   private final he<cqt> d;
   private final he<cqt> e;
   private final he<cqt> f;
   private final he<cqt> g;

   public static crk a(hf<cqt> $$0) {
      return new crk($$0.b(cra.ah), $$0.b(cra.ai), $$0.b(cra.aj), $$0.b(cra.ak), $$0.b(cra.al));
   }

   private crk(he<cqt> $$0, he<cqt> $$1, he<cqt> $$2, he<cqt> $$3, he<cqt> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<he<cqt>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqx> a() {
      return b;
   }

   @Override
   public he<cqt> getNoiseBiome(int $$0, int $$1, int $$2, crc.f $$3) {
      int $$4 = hp.c($$0);
      int $$5 = hp.c($$1);
      int $$6 = hp.c($$2);
      int $$7 = hw.a($$4);
      int $$8 = hw.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (hw.a($$4) * 2 + 1) * 8;
         int $$10 = (hw.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dkl.e($$9, $$5, $$10));
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
