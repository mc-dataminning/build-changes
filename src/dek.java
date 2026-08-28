import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dek(jr<dcy> c, bro d) implements deg {
   public static final MapCodec<dek> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcy.c.fieldOf("enchantment").forGetter(dek::b), bro.c.fieldOf("level").forGetter(dek::c)).apply($$0, dek::new)
   );

   @Override
   public void a(cwo $$0, dde.a $$1, azh $$2, bsh $$3) {
      $$1.b(this.c, ayz.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dek> a() {
      return b;
   }

   public jr<dcy> b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }
}
