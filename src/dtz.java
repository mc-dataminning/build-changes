import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz extends don {
   public static final MapCodec<dtz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayj.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dtz::new)
   );

   @Override
   public MapCodec<dtz> a() {
      return c;
   }

   public dtz(ayj $$0, ebf.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      ebe.a($$0, $$1, $$2, $$3);
   }
}
