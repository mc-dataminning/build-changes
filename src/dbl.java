import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbl(dbd d) implements dbn {
   public static final MapCodec<dbl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dbl::new));

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      arh $$6 = $$2.c() instanceof arh $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbd b() {
      return this.d;
   }
}
