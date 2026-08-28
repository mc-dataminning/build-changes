import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebj extends ebo {
   private final jr<dgv> e;
   public static final MapCodec<ebj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kc.a(lv.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ebj::new)
   );

   public ebj(ki $$0, jr<dgv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ebe<?> a() {
      return ebe.a;
   }
}
