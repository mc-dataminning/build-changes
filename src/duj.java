import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duj extends dox {
   public static final MapCodec<duj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayr.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, duj::new)
   );

   @Override
   public MapCodec<duj> a() {
      return c;
   }

   public duj(ayr $$0, ebp.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      ebo.a($$0, $$1, $$2, $$3);
   }
}
