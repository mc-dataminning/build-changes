import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ctp extends ctc {
   public static final Codec<ctp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agg.d(ctf.ah), agg.d(ctf.ai), agg.d(ctf.aj), agg.d(ctf.ak), agg.d(ctf.al)).apply($$0, $$0.stable(ctp::new))
   );
   private final ib<csy> c;
   private final ib<csy> d;
   private final ib<csy> e;
   private final ib<csy> f;
   private final ib<csy> g;

   public static ctp a(ic<csy> $$0) {
      return new ctp($$0.b(ctf.ah), $$0.b(ctf.ai), $$0.b(ctf.aj), $$0.b(ctf.ak), $$0.b(ctf.al));
   }

   private ctp(ib<csy> $$0, ib<csy> $$1, ib<csy> $$2, ib<csy> $$3, ib<csy> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ib<csy>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends ctc> a() {
      return b;
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2, cth.f $$3) {
      int $$4 = in.c($$0);
      int $$5 = in.c($$1);
      int $$6 = in.c($$2);
      int $$7 = iu.a($$4);
      int $$8 = iu.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (iu.a($$4) * 2 + 1) * 8;
         int $$10 = (iu.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dmk.e($$9, $$5, $$10));
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
