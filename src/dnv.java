import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnv extends dpk {
   public static final MapCodec<dnv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayf.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), t()).apply($$0, dnv::new)
   );
   protected final ayf b;

   @Override
   public MapCodec<? extends dnv> a() {
      return a;
   }

   public dnv(ayf $$0, ean.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(eao $$0, din $$1, iv $$2) {
      return this.b.a();
   }
}
