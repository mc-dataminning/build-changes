import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fhh<T>(T b, iv c, int d, fhm e) {
   public static final Strategy<fhh<?>> a = new Strategy<fhh<?>>() {
      public int a(fhh<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fhh<?> $$0, @Nullable fhh<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fhh<T>> a(Codec<T> $$0) {
      MapCodec<iv> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(ka::u), Codec.INT.fieldOf("y").forGetter(ka::v), Codec.INT.fieldOf("z").forGetter(ka::w))
               .apply($$0x, iv::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  $$0.fieldOf("i").forGetter(fhh::a), $$1.forGetter(fhh::b), Codec.INT.fieldOf("t").forGetter(fhh::c), fhm.h.fieldOf("p").forGetter(fhh::d)
               )
               .apply($$2, fhh::new)
      );
   }

   public static <T> List<fhh<T>> a(List<fhh<T>> $$0, djc $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> djc.a($$1x.b()) == $$2).toList();
   }

   public fhi<T> a(long $$0, long $$1) {
      return new fhi<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> fhh<T> a(T $$0, iv $$1) {
      return new fhh<>($$0, $$1, 0, fhm.d);
   }

   public T a() {
      return this.b;
   }

   public iv b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fhm d() {
      return this.e;
   }
}
