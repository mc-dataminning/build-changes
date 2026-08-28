import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebx extends ecc {
   private final jr<dhj> e;
   public static final MapCodec<ebx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kc.a(lv.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ebx::new)
   );

   public ebx(ki $$0, jr<dhj> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(duo $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ebs<?> a() {
      return ebs.a;
   }
}
