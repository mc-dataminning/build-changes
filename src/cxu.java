import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cxu extends cxh {
   public static final Codec<cxu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aja.d(cxk.ah), aja.d(cxk.ai), aja.d(cxk.aj), aja.d(cxk.ak), aja.d(cxk.al)).apply($$0, $$0.stable(cxu::new))
   );
   private final il<cxd> c;
   private final il<cxd> d;
   private final il<cxd> e;
   private final il<cxd> f;
   private final il<cxd> g;

   public static cxu a(im<cxd> $$0) {
      return new cxu($$0.b(cxk.ah), $$0.b(cxk.ai), $$0.b(cxk.aj), $$0.b(cxk.ak), $$0.b(cxk.al));
   }

   private cxu(il<cxd> $$0, il<cxd> $$1, il<cxd> $$2, il<cxd> $$3, il<cxd> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<il<cxd>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cxh> a() {
      return b;
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2, cxm.f $$3) {
      int $$4 = iw.c($$0);
      int $$5 = iw.c($$1);
      int $$6 = iw.c($$2);
      int $$7 = jd.a($$4);
      int $$8 = jd.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jd.a($$4) * 2 + 1) * 8;
         int $$10 = (jd.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new drj.e($$9, $$5, $$10));
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
