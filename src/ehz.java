import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehz extends eif {
   final axr<dmm> a;
   public static final MapCodec<ehz> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.a(mh.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ehz::new)
   );

   protected ehz(ka $$0, axr<dmm> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(eao $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ehv<?> a() {
      return ehv.b;
   }
}
