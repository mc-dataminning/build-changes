import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddo extends ddb {
   public static final MapCodec<ddo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.d(dde.ah), ald.d(dde.ai), ald.d(dde.aj), ald.d(dde.ak), ald.d(dde.al)).apply($$0, $$0.stable(ddo::new))
   );
   private final ji<dcx> c;
   private final ji<dcx> d;
   private final ji<dcx> e;
   private final ji<dcx> f;
   private final ji<dcx> g;

   public static ddo a(jj<dcx> $$0) {
      return new ddo($$0.b(dde.ah), $$0.b(dde.ai), $$0.b(dde.aj), $$0.b(dde.ak), $$0.b(dde.al));
   }

   private ddo(ji<dcx> $$0, ji<dcx> $$1, ji<dcx> $$2, ji<dcx> $$3, ji<dcx> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcx>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddb> a() {
      return b;
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2, ddg.f $$3) {
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
         double $$11 = $$3.e().a(new dxn.e($$9, $$5, $$10));
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
