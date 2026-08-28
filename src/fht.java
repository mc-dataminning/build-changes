import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fht<T>(T b, iw c, int d, fhy e) {
   public static final Strategy<fht<?>> a = new Strategy<fht<?>>() {
      public int a(fht<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fht<?> $$0, @Nullable fht<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fht<T>> a(Codec<T> $$0) {
      MapCodec<iw> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(kb::u), Codec.INT.fieldOf("y").forGetter(kb::v), Codec.INT.fieldOf("z").forGetter(kb::w))
               .apply($$0x, iw::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  $$0.fieldOf("i").forGetter(fht::a), $$1.forGetter(fht::b), Codec.INT.fieldOf("t").forGetter(fht::c), fhy.h.fieldOf("p").forGetter(fht::d)
               )
               .apply($$2, fht::new)
      );
   }

   public static <T> List<fht<T>> a(List<fht<T>> $$0, djo $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> djo.a($$1x.b()) == $$2).toList();
   }

   public fhu<T> a(long $$0, long $$1) {
      return new fhu<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fht<T> a(T $$0, iw $$1) {
      return new fht<>($$0, $$1, 0, fhy.d);
   }

   public T a() {
      return this.b;
   }

   public iw b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fhy d() {
      return this.e;
   }
}
