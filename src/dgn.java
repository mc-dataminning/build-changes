import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dgn extends dga {
   public static final MapCodec<dgn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.d(dgd.ah), alf.d(dgd.ai), alf.d(dgd.aj), alf.d(dgd.ak), alf.d(dgd.al)).apply($$0, $$0.stable(dgn::new))
   );
   private final jp<dfw> c;
   private final jp<dfw> d;
   private final jp<dfw> e;
   private final jp<dfw> f;
   private final jp<dfw> g;

   public static dgn a(jq<dfw> $$0) {
      return new dgn($$0.b(dgd.ah), $$0.b(dgd.ai), $$0.b(dgd.aj), $$0.b(dgd.ak), $$0.b(dgd.al));
   }

   private dgn(jp<dfw> $$0, jp<dfw> $$1, jp<dfw> $$2, jp<dfw> $$3, jp<dfw> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jp<dfw>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dga> a() {
      return b;
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2, dgf.f $$3) {
      int $$4 = ka.c($$0);
      int $$5 = ka.c($$1);
      int $$6 = ka.c($$2);
      int $$7 = ki.a($$4);
      int $$8 = ki.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (ki.a($$4) * 2 + 1) * 8;
         int $$10 = (ki.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new eas.e($$9, $$5, $$10));
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
