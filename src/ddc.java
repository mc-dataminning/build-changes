import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddc(jf<awm> c) implements ddb {
   public static final MapCodec<ddc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awm.b.fieldOf("sound").forGetter(ddc::b)).apply($$0, ddc::new));
   public static final yw<wj, ddc> b = yw.a(awm.d, ddc::b, ddc::new);

   @Override
   public ddb.a<ddc> a() {
      return ddb.a.e;
   }

   @Override
   public boolean a(djm $$0, czn $$1, bxj $$2) {
      $$0.a(null, $$2.du(), this.c.a(), $$2.dl(), 1.0F, 1.0F);
      return true;
   }

   public jf<awm> b() {
      return this.c;
   }
}
