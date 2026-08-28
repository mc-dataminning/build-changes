import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bqn extends bqu {
   public static final MapCodec<bqn> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  bqu.c.fieldOf("source").forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.f),
                  Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, bqn::new)
      )
      .validate(
         $$0 -> $$0.g < $$0.f
               ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.f + ", max_inclusive: " + $$0.g)
               : DataResult.success($$0)
      );
   private final bqu b;
   private final int f;
   private final int g;

   public static bqn a(bqu $$0, int $$1, int $$2) {
      return new bqn($$0, $$1, $$2);
   }

   public bqn(bqu $$0, int $$1, int $$2) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(azl $$0) {
      return azd.a(this.b.a($$0), this.f, this.g);
   }

   @Override
   public int a() {
      return Math.max(this.f, this.b.a());
   }

   @Override
   public int b() {
      return Math.min(this.g, this.b.b());
   }

   @Override
   public bqv<?> c() {
      return bqv.d;
   }
}
