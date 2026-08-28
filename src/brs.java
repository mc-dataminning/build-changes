import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface brs {
   brr a();

   static <T> brs.b<T> a(T $$0, int $$1) {
      return new brs.b<>($$0, brr.a($$1));
   }

   public static class a implements brs {
      private final brr a;

      public a(int $$0) {
         this.a = brr.a($$0);
      }

      public a(brr $$0) {
         this.a = $$0;
      }

      @Override
      public brr a() {
         return this.a;
      }
   }

   public static record b<T>(T a, brr b) implements brs {
      @Override
      public brr a() {
         return this.b;
      }

      public static <E> Codec<brs.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(brs.b::b), brr.a.fieldOf("weight").forGetter(brs.b::c)).apply($$1, brs.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public brr c() {
         return this.b;
      }
   }
}
