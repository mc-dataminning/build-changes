import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class bno extends bnv {
   public static final Codec<bno> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bnv.c.fieldOf("source").forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.f),
                  Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, bno::new)
      )
      .comapFlatMap(
         $$0 -> $$0.g < $$0.f
               ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.f + ", max_inclusive: " + $$0.g)
               : DataResult.success($$0),
         Function.identity()
      );
   private final bnv b;
   private final int f;
   private final int g;

   public static bno a(bnv $$0, int $$1, int $$2) {
      return new bno($$0, $$1, $$2);
   }

   public bno(bnv $$0, int $$1, int $$2) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(ayd $$0) {
      return axw.a(this.b.a($$0), this.f, this.g);
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
   public bnw<?> c() {
      return bnw.d;
   }
}
