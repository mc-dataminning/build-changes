import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface brt {
   brs a();

   static <T> brt.b<T> a(T $$0, int $$1) {
      return new brt.b<>($$0, brs.a($$1));
   }

   public static class a implements brt {
      private final brs a;

      public a(int $$0) {
         this.a = brs.a($$0);
      }

      public a(brs $$0) {
         this.a = $$0;
      }

      @Override
      public brs a() {
         return this.a;
      }
   }

   public static record b<T>(T a, brs b) implements brt {
      @Override
      public brs a() {
         return this.b;
      }

      public static <E> Codec<brt.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(brt.b::b), brs.a.fieldOf("weight").forGetter(brt.b::c)).apply($$1, brt.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public brs c() {
         return this.b;
      }
   }
}
