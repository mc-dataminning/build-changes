import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dno extends dpd {
   public static final MapCodec<dno> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dno::new)
   );
   protected final ayf b;

   @Override
   public MapCodec<? extends dno> a() {
      return a;
   }

   public dno(ayf $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(eah $$0, dig $$1, iu $$2) {
      return this.b.a();
   }
}
