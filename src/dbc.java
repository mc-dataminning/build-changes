import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbc(jq<axe> c) implements dbb {
   public static final MapCodec<dbc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axe.b.fieldOf("sound").forGetter(dbc::b)).apply($$0, dbc::new));
   public static final zt<xg, dbc> b = zt.a(axe.d, dbc::b, dbc::new);

   @Override
   public dbb.a<dbc> a() {
      return dbb.a.e;
   }

   @Override
   public boolean a(dhi $$0, cxp $$1, bwg $$2) {
      $$0.a(null, $$2.dw(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jq<axe> b() {
      return this.c;
   }
}
