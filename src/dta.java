import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta extends dno {
   public static final MapCodec<dta> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dta::new)
   );

   @Override
   public MapCodec<dta> a() {
      return c;
   }

   public dta(ayf $$0, eag.d $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      eaf.a($$0, $$1, $$2, $$3);
   }
}
