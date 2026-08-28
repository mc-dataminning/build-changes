import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcn(dbz d) implements dcj {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("duration").forGetter($$0x -> $$0x.d)).apply($$0, dcn::new));

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      $$3.d(this.d.a($$1));
   }

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dbz b() {
      return this.d;
   }
}
