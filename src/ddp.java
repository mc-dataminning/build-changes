import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddp extends ddc {
   public static final MapCodec<ddp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.d(ddf.ah), ald.d(ddf.ai), ald.d(ddf.aj), ald.d(ddf.ak), ald.d(ddf.al)).apply($$0, $$0.stable(ddp::new))
   );
   private final ji<dcy> c;
   private final ji<dcy> d;
   private final ji<dcy> e;
   private final ji<dcy> f;
   private final ji<dcy> g;

   public static ddp a(jj<dcy> $$0) {
      return new ddp($$0.b(ddf.ah), $$0.b(ddf.ai), $$0.b(ddf.aj), $$0.b(ddf.ak), $$0.b(ddf.al));
   }

   private ddp(ji<dcy> $$0, ji<dcy> $$1, ji<dcy> $$2, ji<dcy> $$3, ji<dcy> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcy>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddc> a() {
      return b;
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2, ddh.f $$3) {
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
         double $$11 = $$3.e().a(new dxo.e($$9, $$5, $$10));
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
