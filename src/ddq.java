import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddq extends ddd {
   public static final MapCodec<ddq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.d(ddg.ah), ald.d(ddg.ai), ald.d(ddg.aj), ald.d(ddg.ak), ald.d(ddg.al)).apply($$0, $$0.stable(ddq::new))
   );
   private final ji<dcz> c;
   private final ji<dcz> d;
   private final ji<dcz> e;
   private final ji<dcz> f;
   private final ji<dcz> g;

   public static ddq a(jj<dcz> $$0) {
      return new ddq($$0.b(ddg.ah), $$0.b(ddg.ai), $$0.b(ddg.aj), $$0.b(ddg.ak), $$0.b(ddg.al));
   }

   private ddq(ji<dcz> $$0, ji<dcz> $$1, ji<dcz> $$2, ji<dcz> $$3, ji<dcz> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcz>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddd> a() {
      return b;
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      int $$4 = jt.c($$0);
      int $$5 = jt.c($$1);
      int $$6 = jt.c($$2);
      int $$7 = kb.a($$4);
      int $$8 = kb.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kb.a($$4) * 2 + 1) * 8;
         int $$10 = (kb.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dxp.e($$9, $$5, $$10));
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
