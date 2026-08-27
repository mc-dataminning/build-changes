import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqz extends cqm {
   public static final Codec<cqz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aen.d(cqp.ah), aen.d(cqp.ai), aen.d(cqp.aj), aen.d(cqp.ak), aen.d(cqp.al)).apply($$0, $$0.stable(cqz::new))
   );
   private final hf<cqi> c;
   private final hf<cqi> d;
   private final hf<cqi> e;
   private final hf<cqi> f;
   private final hf<cqi> g;

   public static cqz a(hg<cqi> $$0) {
      return new cqz($$0.b(cqp.ah), $$0.b(cqp.ai), $$0.b(cqp.aj), $$0.b(cqp.ak), $$0.b(cqp.al));
   }

   private cqz(hf<cqi> $$0, hf<cqi> $$1, hf<cqi> $$2, hf<cqi> $$3, hf<cqi> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<hf<cqi>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cqm> a() {
      return b;
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2, cqr.f $$3) {
      int $$4 = hr.c($$0);
      int $$5 = hr.c($$1);
      int $$6 = hr.c($$2);
      int $$7 = hy.a($$4);
      int $$8 = hy.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (hy.a($$4) * 2 + 1) * 8;
         int $$10 = (hy.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dka.e($$9, $$5, $$10));
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
