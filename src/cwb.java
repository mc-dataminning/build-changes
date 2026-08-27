import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwb extends cxo {
   public static final MapCodec<cwb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(asd.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, cwb::new)
   );
   private final asd b;

   @Override
   public MapCodec<cwb> a() {
      return a;
   }

   public cwb(asd $$0, dgv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int d(dgw $$0, cqy $$1, ht $$2) {
      return this.b.a();
   }
}
