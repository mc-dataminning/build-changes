import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddp extends dfd {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awg.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, ddp::new)
   );
   private final awg b;

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public ddp(awg $$0, dph.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dpi $$0, cym $$1, id $$2) {
      return this.b.a();
   }
}
