import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cyr extends cye {
   public static final Codec<cyr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajf.d(cyh.ah), ajf.d(cyh.ai), ajf.d(cyh.aj), ajf.d(cyh.ak), ajf.d(cyh.al)).apply($$0, $$0.stable(cyr::new))
   );
   private final il<cya> c;
   private final il<cya> d;
   private final il<cya> e;
   private final il<cya> f;
   private final il<cya> g;

   public static cyr a(im<cya> $$0) {
      return new cyr($$0.b(cyh.ah), $$0.b(cyh.ai), $$0.b(cyh.aj), $$0.b(cyh.ak), $$0.b(cyh.al));
   }

   private cyr(il<cya> $$0, il<cya> $$1, il<cya> $$2, il<cya> $$3, il<cya> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<il<cya>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cye> a() {
      return b;
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2, cyj.f $$3) {
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
         double $$11 = $$3.e().a(new dsh.e($$9, $$5, $$10));
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
