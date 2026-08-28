import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dax(jj<czm> c, bpm d) implements dat {
   public static final MapCodec<dax> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czm.c.fieldOf("enchantment").forGetter(dax::b), bpm.c.fieldOf("level").forGetter(dax::c)).apply($$0, dax::new)
   );

   @Override
   public void a(cud $$0, czs.a $$1, ayo $$2, bqf $$3) {
      $$1.b(this.c, ayg.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dax> a() {
      return b;
   }

   public jj<czm> b() {
      return this.c;
   }

   public bpm c() {
      return this.d;
   }
}
