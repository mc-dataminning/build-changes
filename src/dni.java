import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dni extends dox {
   public static final MapCodec<dni> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dni::new)
   );
   protected final ayf b;

   @Override
   public MapCodec<? extends dni> a() {
      return a;
   }

   public dni(ayf $$0, dzy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dzz $$0, dib $$1, iu $$2) {
      return this.b.a();
   }
}
