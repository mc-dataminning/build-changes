import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcz(jo<dbn> c, bqx d) implements dcv {
   public static final MapCodec<dcz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbn.c.fieldOf("enchantment").forGetter(dcz::b), bqx.c.fieldOf("level").forGetter(dcz::c)).apply($$0, dcz::new)
   );

   @Override
   public void a(cvs $$0, dbt.a $$1, azn $$2, brq $$3) {
      $$1.b(this.c, azf.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dcz> a() {
      return b;
   }

   public jo<dbn> b() {
      return this.c;
   }

   public bqx c() {
      return this.d;
   }
}
