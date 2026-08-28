import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhz(jg<dgn> c, bty d) implements dhv {
   public static final MapCodec<dhz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgn.c.fieldOf("enchantment").forGetter(dhz::b), bty.c.fieldOf("level").forGetter(dhz::c)).apply($$0, dhz::new)
   );

   @Override
   public void a(daa $$0, dgt.a $$1, azz $$2, bur $$3) {
      $$1.b(this.c, azq.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dhz> a() {
      return b;
   }

   public jg<dgn> b() {
      return this.c;
   }

   public bty c() {
      return this.d;
   }
}
