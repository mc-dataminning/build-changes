import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqt {
   bqs a();

   static <T> bqt.b<T> a(T $$0, int $$1) {
      return new bqt.b<>($$0, bqs.a($$1));
   }

   public static class a implements bqt {
      private final bqs a;

      public a(int $$0) {
         this.a = bqs.a($$0);
      }

      public a(bqs $$0) {
         this.a = $$0;
      }

      @Override
      public bqs a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqs b) implements bqt {
      @Override
      public bqs a() {
         return this.b;
      }

      public static <E> Codec<bqt.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqt.b::b), bqs.a.fieldOf("weight").forGetter(bqt.b::c)).apply($$1, bqt.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqs c() {
         return this.b;
      }
   }
}
