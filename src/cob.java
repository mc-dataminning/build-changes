import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cob extends cno {
   public static final Codec<cob> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aco.d(cnr.ah), aco.d(cnr.ai), aco.d(cnr.aj), aco.d(cnr.ak), aco.d(cnr.al)).apply($$0, $$0.stable(cob::new))
   );
   private final he<cnk> c;
   private final he<cnk> d;
   private final he<cnk> e;
   private final he<cnk> f;
   private final he<cnk> g;

   public static cob a(hf<cnk> $$0) {
      return new cob($$0.b(cnr.ah), $$0.b(cnr.ai), $$0.b(cnr.aj), $$0.b(cnr.ak), $$0.b(cnr.al));
   }

   private cob(he<cnk> $$0, he<cnk> $$1, he<cnk> $$2, he<cnk> $$3, he<cnk> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<he<cnk>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cno> a() {
      return b;
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2, cnt.f $$3) {
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
         double $$11 = $$3.e().a(new dhd.e($$9, $$5, $$10));
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
