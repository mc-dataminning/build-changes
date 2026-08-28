import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddi(jq<dbw> c, brm d) implements dde {
   public static final MapCodec<ddi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbw.c.fieldOf("enchantment").forGetter(ddi::b), brm.c.fieldOf("level").forGetter(ddi::c)).apply($$0, ddi::new)
   );

   @Override
   public void a(cwf $$0, dcc.a $$1, azv $$2, bsf $$3) {
      $$1.b(this.c, azn.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<ddi> a() {
      return b;
   }

   public jq<dbw> b() {
      return this.c;
   }

   public brm c() {
      return this.d;
   }
}
