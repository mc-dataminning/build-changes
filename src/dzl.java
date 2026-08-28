import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzl extends dzr {
   final awk<dff> a;
   public static final MapCodec<dzl> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awk.a(lr.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dzl::new)
   );

   protected dzl(ke $$0, awk<dff> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dsh $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dzh<?> a() {
      return dzh.b;
   }
}
