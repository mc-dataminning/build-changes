import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ddn extends dda {
   public static final MapCodec<ddn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.d(ddd.ah), alc.d(ddd.ai), alc.d(ddd.aj), alc.d(ddd.ak), alc.d(ddd.al)).apply($$0, $$0.stable(ddn::new))
   );
   private final ji<dcw> c;
   private final ji<dcw> d;
   private final ji<dcw> e;
   private final ji<dcw> f;
   private final ji<dcw> g;

   public static ddn a(jj<dcw> $$0) {
      return new ddn($$0.b(ddd.ah), $$0.b(ddd.ai), $$0.b(ddd.aj), $$0.b(ddd.ak), $$0.b(ddd.al));
   }

   private ddn(ji<dcw> $$0, ji<dcw> $$1, ji<dcw> $$2, ji<dcw> $$3, ji<dcw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ji<dcw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dda> a() {
      return b;
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2, ddf.f $$3) {
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
         double $$11 = $$3.e().a(new dxm.e($$9, $$5, $$10));
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
