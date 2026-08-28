import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcb(dbt d) implements dcd {
   public static final MapCodec<dcb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dcb::new));

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      arn $$6 = $$2.c() instanceof arn $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dbt b() {
      return this.d;
   }
}
