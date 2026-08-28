import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dyd(int g, int h, int i, int j) {
   public static final Codec<dyd> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dvv.e, dvv.d).fieldOf("min_y").forGetter(dyd::c),
                  Codec.intRange(0, dvv.c).fieldOf("height").forGetter(dyd::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dyd::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dyd::f)
               )
               .apply($$0, dyd::new)
      )
      .comapFlatMap(dyd::a, Function.identity());
   protected static final dyd b = a(-64, 384, 1, 2);
   protected static final dyd c = a(0, 128, 1, 2);
   protected static final dyd d = a(0, 128, 2, 1);
   protected static final dyd e = a(-64, 192, 1, 2);
   protected static final dyd f = a(0, 256, 2, 1);

   private static DataResult<dyd> a(dyd $$0) {
      if ($$0.c() + $$0.d() > dvv.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dvv.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dyd a(int $$0, int $$1, int $$2, int $$3) {
      dyd $$4 = new dyd($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jt.c(this.f());
   }

   public int b() {
      return jt.c(this.e());
   }

   public dyd a(dcb $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.am()) - $$1;
      return new dyd($$1, $$2, this.i, this.j);
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
