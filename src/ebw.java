import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebw extends ecc {
   final axj<dhj> a;
   public static final MapCodec<ebw> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axj.a(lv.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ebw::new)
   );

   protected ebw(ki $$0, axj<dhj> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(duo $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ebs<?> a() {
      return ebs.b;
   }
}
