import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfd(jr<ddr> c, bsd d) implements dez {
   public static final MapCodec<dfd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddr.c.fieldOf("enchantment").forGetter(dfd::b), bsd.c.fieldOf("level").forGetter(dfd::c)).apply($$0, dfd::new)
   );

   @Override
   public void a(cxh $$0, ddx.a $$1, azh $$2, bsw $$3) {
      $$1.b(this.c, ayz.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dfd> a() {
      return b;
   }

   public jr<ddr> b() {
      return this.c;
   }

   public bsd c() {
      return this.d;
   }
}
