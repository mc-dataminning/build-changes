import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eah extends ean {
   final awt<dfw> a;
   public static final MapCodec<eah> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awt.a(lu.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eah::new)
   );

   protected eah(kh $$0, awt<dfw> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dta $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ead<?> a() {
      return ead.b;
   }
}
