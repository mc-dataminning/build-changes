import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqs {
   bqr a();

   static <T> bqs.b<T> a(T $$0, int $$1) {
      return new bqs.b<>($$0, bqr.a($$1));
   }

   public static class a implements bqs {
      private final bqr a;

      public a(int $$0) {
         this.a = bqr.a($$0);
      }

      public a(bqr $$0) {
         this.a = $$0;
      }

      @Override
      public bqr a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqr b) implements bqs {
      @Override
      public bqr a() {
         return this.b;
      }

      public static <E> Codec<bqs.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqs.b::b), bqr.a.fieldOf("weight").forGetter(bqs.b::c)).apply($$1, bqs.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqr c() {
         return this.b;
      }
   }
}
