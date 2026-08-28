import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eoo extends epf {
   public static final MapCodec<eoo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eao.a.g.fieldOf("heightmap").orElse(eao.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eoo::new)
   );
   private final eao.a b;
   private final int c;

   public eoo(eao.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      eao.a $$6;
      if ($$0 instanceof arj) {
         if (this.b == eao.a.a) {
            $$6 = eao.a.b;
         } else if (this.b == eao.a.c) {
            $$6 = eao.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jf $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new epi.c(new jf($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eph<?> a() {
      return eph.g;
   }
}
