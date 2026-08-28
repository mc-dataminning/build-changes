import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(dbu d) implements dce {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dci::new));

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dbu b() {
      return this.d;
   }
}
