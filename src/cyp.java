import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cyp extends cyc {
   public static final Codec<cyp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajf.d(cyf.ah), ajf.d(cyf.ai), ajf.d(cyf.aj), ajf.d(cyf.ak), ajf.d(cyf.al)).apply($$0, $$0.stable(cyp::new))
   );
   private final il<cxy> c;
   private final il<cxy> d;
   private final il<cxy> e;
   private final il<cxy> f;
   private final il<cxy> g;

   public static cyp a(im<cxy> $$0) {
      return new cyp($$0.b(cyf.ah), $$0.b(cyf.ai), $$0.b(cyf.aj), $$0.b(cyf.ak), $$0.b(cyf.al));
   }

   private cyp(il<cxy> $$0, il<cxy> $$1, il<cxy> $$2, il<cxy> $$3, il<cxy> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<il<cxy>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cyc> a() {
      return b;
   }

   @Override
   public il<cxy> getNoiseBiome(int $$0, int $$1, int $$2, cyh.f $$3) {
      int $$4 = iw.c($$0);
      int $$5 = iw.c($$1);
      int $$6 = iw.c($$2);
      int $$7 = je.a($$4);
      int $$8 = je.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (je.a($$4) * 2 + 1) * 8;
         int $$10 = (je.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dsf.e($$9, $$5, $$10));
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
