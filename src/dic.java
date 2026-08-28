import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dic extends dhp {
   public static final MapCodec<dic> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.d(dhs.ai), akt.d(dhs.aj), akt.d(dhs.ak), akt.d(dhs.al), akt.d(dhs.am)).apply($$0, $$0.stable(dic::new))
   );
   private final jr<dhl> c;
   private final jr<dhl> d;
   private final jr<dhl> e;
   private final jr<dhl> f;
   private final jr<dhl> g;

   public static dic a(js<dhl> $$0) {
      return new dic($$0.b(dhs.ai), $$0.b(dhs.aj), $$0.b(dhs.ak), $$0.b(dhs.al), $$0.b(dhs.am));
   }

   private dic(jr<dhl> $$0, jr<dhl> $$1, jr<dhl> $$2, jr<dhl> $$3, jr<dhl> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jr<dhl>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dhp> a() {
      return b;
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2, dhu.f $$3) {
      int $$4 = kc.c($$0);
      int $$5 = kc.c($$1);
      int $$6 = kc.c($$2);
      int $$7 = kk.a($$4);
      int $$8 = kk.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (kk.a($$4) * 2 + 1) * 8;
         int $$10 = (kk.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new ecm.e($$9, $$5, $$10));
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
