import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(jn<daw> c, bqp d) implements dce {
   public static final MapCodec<dci> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daw.c.fieldOf("enchantment").forGetter(dci::b), bqp.c.fieldOf("level").forGetter(dci::c)).apply($$0, dci::new)
   );

   @Override
   public void a(cvl $$0, dbc.a $$1, azk $$2, bri $$3) {
      $$1.b(this.c, azc.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dci> a() {
      return b;
   }

   public jn<daw> b() {
      return this.c;
   }

   public bqp c() {
      return this.d;
   }
}
