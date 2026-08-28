import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class del extends ddy {
   public static final MapCodec<del> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ako.d(deb.ah), ako.d(deb.ai), ako.d(deb.aj), ako.d(deb.ak), ako.d(deb.al)).apply($$0, $$0.stable(del::new))
   );
   private final jm<ddu> c;
   private final jm<ddu> d;
   private final jm<ddu> e;
   private final jm<ddu> f;
   private final jm<ddu> g;

   public static del a(jn<ddu> $$0) {
      return new del($$0.b(deb.ah), $$0.b(deb.ai), $$0.b(deb.aj), $$0.b(deb.ak), $$0.b(deb.al));
   }

   private del(jm<ddu> $$0, jm<ddu> $$1, jm<ddu> $$2, jm<ddu> $$3, jm<ddu> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jm<ddu>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends ddy> a() {
      return b;
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2, ded.f $$3) {
      int $$4 = jx.c($$0);
      int $$5 = jx.c($$1);
      int $$6 = jx.c($$2);
      int $$7 = kf.a($$4);
      int $$8 = kf.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kf.a($$4) * 2 + 1) * 8;
         int $$10 = (kf.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dyo.e($$9, $$5, $$10));
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
