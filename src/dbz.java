import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbz(dbr d) implements dcb {
   public static final MapCodec<dbz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dbz::new));

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      ari $$6 = $$2.c() instanceof ari $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbr b() {
      return this.d;
   }
}
