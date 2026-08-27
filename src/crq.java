import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crq extends crd {
   public static final Codec<crq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aex.d(crg.ah), aex.d(crg.ai), aex.d(crg.aj), aex.d(crg.ak), aex.d(crg.al)).apply($$0, $$0.stable(crq::new))
   );
   private final he<cqz> c;
   private final he<cqz> d;
   private final he<cqz> e;
   private final he<cqz> f;
   private final he<cqz> g;

   public static crq a(hf<cqz> $$0) {
      return new crq($$0.b(crg.ah), $$0.b(crg.ai), $$0.b(crg.aj), $$0.b(crg.ak), $$0.b(crg.al));
   }

   private crq(he<cqz> $$0, he<cqz> $$1, he<cqz> $$2, he<cqz> $$3, he<cqz> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<he<cqz>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends crd> a() {
      return b;
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2, cri.f $$3) {
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
         double $$11 = $$3.e().a(new dkf.e($$9, $$5, $$10));
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
