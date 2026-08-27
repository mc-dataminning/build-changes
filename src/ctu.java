import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ctu extends cth {
   public static final Codec<ctu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agk.d(ctk.ah), agk.d(ctk.ai), agk.d(ctk.aj), agk.d(ctk.ak), agk.d(ctk.al)).apply($$0, $$0.stable(ctu::new))
   );
   private final ig<ctd> c;
   private final ig<ctd> d;
   private final ig<ctd> e;
   private final ig<ctd> f;
   private final ig<ctd> g;

   public static ctu a(ih<ctd> $$0) {
      return new ctu($$0.b(ctk.ah), $$0.b(ctk.ai), $$0.b(ctk.aj), $$0.b(ctk.ak), $$0.b(ctk.al));
   }

   private ctu(ig<ctd> $$0, ig<ctd> $$1, ig<ctd> $$2, ig<ctd> $$3, ig<ctd> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ig<ctd>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends cth> a() {
      return b;
   }

   @Override
   public ig<ctd> getNoiseBiome(int $$0, int $$1, int $$2, ctm.f $$3) {
      int $$4 = ir.c($$0);
      int $$5 = ir.c($$1);
      int $$6 = ir.c($$2);
      int $$7 = iy.a($$4);
      int $$8 = iy.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iy.a($$4) * 2 + 1) * 8;
         int $$10 = (iy.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dmp.e($$9, $$5, $$10));
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
