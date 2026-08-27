import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dne(int g, int h, int i, int j) {
   public static final Codec<dne> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dkw.e, dkw.d).fieldOf("min_y").forGetter(dne::c),
                  Codec.intRange(0, dkw.c).fieldOf("height").forGetter(dne::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dne::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dne::f)
               )
               .apply($$0, dne::new)
      )
      .comapFlatMap(dne::a, Function.identity());
   protected static final dne b = a(-64, 384, 1, 2);
   protected static final dne c = a(0, 128, 1, 2);
   protected static final dne d = a(0, 128, 2, 1);
   protected static final dne e = a(-64, 192, 1, 2);
   protected static final dne f = a(0, 256, 2, 1);

   private static DataResult<dne> a(dne $$0) {
      if ($$0.c() + $$0.d() > dkw.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dkw.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dne a(int $$0, int $$1, int $$2, int $$3) {
      dne $$4 = new dne($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return ir.c(this.f());
   }

   public int b() {
      return ir.c(this.e());
   }

   public dne a(csh $$0) {
      int $$1 = Math.max(this.g, $$0.J_());
      int $$2 = Math.min(this.g + this.h, $$0.ak()) - $$1;
      return new dne($$1, $$2, this.i, this.j);
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }
}
