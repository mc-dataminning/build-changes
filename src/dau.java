import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dau(jj<czj> c, bpi d) implements daq {
   public static final MapCodec<dau> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czj.b.fieldOf("enchantment").forGetter(dau::b), bpi.c.fieldOf("level").forGetter(dau::c)).apply($$0, dau::new)
   );

   @Override
   public void a(cua $$0, czp.a $$1, aym $$2, dcd $$3, ja $$4) {
      $$1.b(this.c, aye.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dau> a() {
      return b;
   }

   public jj<czj> b() {
      return this.c;
   }

   public bpi c() {
      return this.d;
   }
}
