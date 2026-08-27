import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record dmn(int g, int h, int i, int j) {
   public static final Codec<dmn> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.intRange(dkf.e, dkf.d).fieldOf("min_y").forGetter(dmn::c),
                  Codec.intRange(0, dkf.c).fieldOf("height").forGetter(dmn::d),
                  Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(dmn::e),
                  Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(dmn::f)
               )
               .apply($$0, dmn::new)
      )
      .comapFlatMap(dmn::a, Function.identity());
   protected static final dmn b = a(-64, 384, 1, 2);
   protected static final dmn c = a(0, 128, 1, 2);
   protected static final dmn d = a(0, 128, 2, 1);
   protected static final dmn e = a(-64, 192, 1, 2);
   protected static final dmn f = a(0, 256, 2, 1);

   private static DataResult<dmn> a(dmn $$0) {
      if ($$0.c() + $$0.d() > dkf.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (dkf.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static dmn a(int $$0, int $$1, int $$2, int $$3) {
      dmn $$4 = new dmn($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return in.c(this.f());
   }

   public int b() {
      return in.c(this.e());
   }

   public dmn a(cru $$0) {
      int $$1 = Math.max(this.g, $$0.I_());
      int $$2 = Math.min(this.g + this.h, $$0.aj()) - $$1;
      return new dmn($$1, $$2, this.i, this.j);
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
