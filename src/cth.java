import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cth extends csu {
   public static final Codec<cth> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(age.d(csx.ah), age.d(csx.ai), age.d(csx.aj), age.d(csx.ak), age.d(csx.al)).apply($$0, $$0.stable(cth::new))
   );
   private final ib<csq> c;
   private final ib<csq> d;
   private final ib<csq> e;
   private final ib<csq> f;
   private final ib<csq> g;

   public static cth a(ic<csq> $$0) {
      return new cth($$0.b(csx.ah), $$0.b(csx.ai), $$0.b(csx.aj), $$0.b(csx.ak), $$0.b(csx.al));
   }

   private cth(ib<csq> $$0, ib<csq> $$1, ib<csq> $$2, ib<csq> $$3, ib<csq> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<ib<csq>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected Codec<? extends csu> a() {
      return b;
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2, csz.f $$3) {
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
         double $$11 = $$3.e().a(new dly.e($$9, $$5, $$10));
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
