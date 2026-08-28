import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dlg extends dkt {
   public static final MapCodec<dlg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.d(dkw.ai), ale.d(dkw.aj), ale.d(dkw.ak), ale.d(dkw.al), ale.d(dkw.am)).apply($$0, $$0.stable(dlg::new))
   );
   private final jf<dkp> c;
   private final jf<dkp> d;
   private final jf<dkp> e;
   private final jf<dkp> f;
   private final jf<dkp> g;

   public static dlg a(jg<dkp> $$0) {
      return new dlg($$0.b(dkw.ai), $$0.b(dkw.aj), $$0.b(dkw.ak), $$0.b(dkw.al), $$0.b(dkw.am));
   }

   private dlg(jf<dkp> $$0, jf<dkp> $$1, jf<dkp> $$2, jf<dkp> $$3, jf<dkp> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jf<dkp>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dkt> a() {
      return b;
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2, dky.f $$3) {
      int $$4 = jq.c($$0);
      int $$5 = jq.c($$1);
      int $$6 = jq.c($$2);
      int $$7 = jy.a($$4);
      int $$8 = jy.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (jy.a($$4) * 2 + 1) * 8;
         int $$10 = (jy.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new egl.e($$9, $$5, $$10));
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
