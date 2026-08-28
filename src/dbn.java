import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbn(jm<dac> c, bpw d) implements dbj {
   public static final MapCodec<dbn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dac.c.fieldOf("enchantment").forGetter(dbn::b), bpw.c.fieldOf("level").forGetter(dbn::c)).apply($$0, dbn::new)
   );

   @Override
   public void a(cuq $$0, dai.a $$1, ayw $$2, bqp $$3) {
      $$1.b(this.c, ayo.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dbn> a() {
      return b;
   }

   public jm<dac> b() {
      return this.c;
   }

   public bpw c() {
      return this.d;
   }
}
