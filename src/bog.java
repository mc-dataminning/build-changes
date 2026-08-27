import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bog {
   bof a();

   static <T> bog.b<T> a(T $$0, int $$1) {
      return new bog.b<>($$0, bof.a($$1));
   }

   public static class a implements bog {
      private final bof a;

      public a(int $$0) {
         this.a = bof.a($$0);
      }

      public a(bof $$0) {
         this.a = $$0;
      }

      @Override
      public bof a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bof b) implements bog {
      @Override
      public bof a() {
         return this.b;
      }

      public static <E> Codec<bog.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bog.b::b), bof.a.fieldOf("weight").forGetter(bog.b::c)).apply($$1, bog.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bof c() {
         return this.b;
      }
   }
}
