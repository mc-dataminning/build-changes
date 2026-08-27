import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dxb(int g, int h, int i, int j) {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dut.e, dut.d).fieldOf("min_y").forGetter(dxb::c),
                  Codec.intRange(0, dut.c).fieldOf("height").forGetter(dxb::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dxb::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dxb::f)
               )
               .apply($$0, dxb::new)
      )
      .comapFlatMap(dxb::a, Function.identity());
   protected static final dxb b = a(-64, 384, 1, 2);
   protected static final dxb c = a(0, 128, 1, 2);
   protected static final dxb d = a(0, 128, 2, 1);
   protected static final dxb e = a(-64, 192, 1, 2);
   protected static final dxb f = a(0, 256, 2, 1);

   private static DataResult<dxb> a(dxb $$0) {
      if ($$0.c() + $$0.d() > dut.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dut.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dxb a(int $$0, int $$1, int $$2, int $$3) {
      dxb $$4 = new dxb($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return ji.c(this.f());
   }

   public int b() {
      return ji.c(this.e());
   }

   public dxb a(daz $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.al()) - $$1;
      return new dxb($$1, $$2, this.i, this.j);
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
