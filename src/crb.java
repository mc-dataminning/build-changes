import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class crb extends cqo {
   public static final Codec<crb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aep.d(cqr.ah), aep.d(cqr.ai), aep.d(cqr.aj), aep.d(cqr.ak), aep.d(cqr.al)).apply($$0, $$0.stable(crb::new))
   );
   private final he<cqk> c;
   private final he<cqk> d;
   private final he<cqk> e;
   private final he<cqk> f;
   private final he<cqk> g;

   public static crb a(hf<cqk> $$0) {
      return new crb($$0.b(cqr.ah), $$0.b(cqr.ai), $$0.b(cqr.aj), $$0.b(cqr.ak), $$0.b(cqr.al));
   }

   private crb(he<cqk> $$0, he<cqk> $$1, he<cqk> $$2, he<cqk> $$3, he<cqk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<he<cqk>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqo> a() {
      return b;
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2, cqt.f $$3) {
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
         double $$11 = $$3.e().a(new dkc.e($$9, $$5, $$10));
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
