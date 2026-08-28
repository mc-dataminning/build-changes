import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzr extends dzx {
   final awm<dfh> a;
   public static final MapCodec<dzr> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awm.a(lr.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzr::new)
   );

   protected dzr(ke $$0, awm<dfh> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsk $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzn<?> a() {
      return dzn.b;
   }
}
