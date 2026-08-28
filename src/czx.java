import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czx(czq d) implements czz {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(czq.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, czx::new));

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      aql $$6 = $$2.c() instanceof aql $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2::d);
   }

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czq b() {
      return this.d;
   }
}
