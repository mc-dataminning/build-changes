import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dij(jg<dgx> c, buh d) implements dif {
   public static final MapCodec<dij> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgx.c.fieldOf("enchantment").forGetter(dij::b), buh.c.fieldOf("level").forGetter(dij::c)).apply($$0, dij::new)
   );

   @Override
   public void a(dak $$0, dhd.a $$1, bai $$2, bva $$3) {
      $$1.b(this.c, azz.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dij> a() {
      return b;
   }

   public jg<dgx> b() {
      return this.c;
   }

   public buh c() {
      return this.d;
   }
}
