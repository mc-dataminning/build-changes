import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsu extends dni {
   public static final MapCodec<dsu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dsu::new)
   );

   @Override
   public MapCodec<dsu> a() {
      return c;
   }

   public dsu(ayf $$0, dzy.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      dzx.a($$0, $$1, $$2, $$3);
   }
}
