import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcc(dbu d) implements dce {
   public static final MapCodec<dcc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dcc::new));

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      ark $$6 = $$2.c() instanceof ark $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dbu b() {
      return this.d;
   }
}
