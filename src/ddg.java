import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddg extends deu {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awe.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, ddg::new)
   );
   private final awe b;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(awe $$0, doy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(doz $$0, cyd $$1, ib $$2) {
      return this.b.a();
   }
}
