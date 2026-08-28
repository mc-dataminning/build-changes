import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(dah d) implements daq {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, dao::new));

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      aqu $$6 = $$2.c() instanceof aqu $$5 ? $$5 : null;
      $$2.a().a((int)this.d.a($$1), $$0, $$6, $$2.d());
   }

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public dah b() {
      return this.d;
   }
}
