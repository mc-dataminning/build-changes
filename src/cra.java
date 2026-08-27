import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cra extends cqn {
   public static final Codec<cra> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aep.d(cqq.ah), aep.d(cqq.ai), aep.d(cqq.aj), aep.d(cqq.ak), aep.d(cqq.al)).apply($$0, $$0.stable(cra::new))
   );
   private final he<cqj> c;
   private final he<cqj> d;
   private final he<cqj> e;
   private final he<cqj> f;
   private final he<cqj> g;

   public static cra a(hf<cqj> $$0) {
      return new cra($$0.b(cqq.ah), $$0.b(cqq.ai), $$0.b(cqq.aj), $$0.b(cqq.ak), $$0.b(cqq.al));
   }

   private cra(he<cqj> $$0, he<cqj> $$1, he<cqj> $$2, he<cqj> $$3, he<cqj> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<he<cqj>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqn> a() {
      return b;
   }

   @Override
   public he<cqj> getNoiseBiome(int $$0, int $$1, int $$2, cqs.f $$3) {
      int $$4 = hq.c($$0);
      int $$5 = hq.c($$1);
      int $$6 = hq.c($$2);
      int $$7 = hx.a($$4);
      int $$8 = hx.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (hx.a($$4) * 2 + 1) * 8;
         int $$10 = (hx.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dkb.e($$9, $$5, $$10));
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
