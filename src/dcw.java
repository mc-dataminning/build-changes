import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcw(jn<dbk> c, bqu d) implements dcs {
   public static final MapCodec<dcw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbk.c.fieldOf("enchantment").forGetter(dcw::b), bqu.c.fieldOf("level").forGetter(dcw::c)).apply($$0, dcw::new)
   );

   @Override
   public void a(cvp $$0, dbq.a $$1, azl $$2, brn $$3) {
      $$1.b(this.c, azd.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dcw> a() {
      return b;
   }

   public jn<dbk> b() {
      return this.c;
   }

   public bqu c() {
      return this.d;
   }
}
