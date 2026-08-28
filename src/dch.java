import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(dbz d) implements dcj {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dch::new));

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      aro $$6 = $$2.c() instanceof aro $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public dbz b() {
      return this.d;
   }
}
