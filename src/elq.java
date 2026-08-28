import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class elq extends emg {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxt.a.g.fieldOf("heightmap").orElse(dxt.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, elq::new)
   );
   private final dxt.a b;
   private final int c;

   public elq(dxt.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      dxt.a $$6;
      if ($$0 instanceof are) {
         if (this.b == dxt.a.a) {
            $$6 = dxt.a.b;
         } else if (this.b == dxt.a.c) {
            $$6 = dxt.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new emj.c(new iz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected emi<?> a() {
      return emi.g;
   }
}
