import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dax(jq<axe> c) implements daw {
   public static final MapCodec<dax> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axe.b.fieldOf("sound").forGetter(dax::b)).apply($$0, dax::new));
   public static final zt<xg, dax> b = zt.a(axe.d, dax::b, dax::new);

   @Override
   public daw.a<dax> a() {
      return daw.a.e;
   }

   @Override
   public boolean a(dha $$0, cxk $$1, bwb $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jq<axe> b() {
      return this.c;
   }
}
