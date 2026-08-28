import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbb(jq<axe> c) implements dba {
   public static final MapCodec<dbb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axe.b.fieldOf("sound").forGetter(dbb::b)).apply($$0, dbb::new));
   public static final zt<xg, dbb> b = zt.a(axe.d, dbb::b, dbb::new);

   @Override
   public dba.a<dbb> a() {
      return dba.a.e;
   }

   @Override
   public boolean a(dhh $$0, cxo $$1, bwf $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jq<axe> b() {
      return this.c;
   }
}
