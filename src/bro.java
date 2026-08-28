import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bro {
   brn a();

   static <T> bro.b<T> a(T $$0, int $$1) {
      return new bro.b<>($$0, brn.a($$1));
   }

   public static class a implements bro {
      private final brn a;

      public a(int $$0) {
         this.a = brn.a($$0);
      }

      public a(brn $$0) {
         this.a = $$0;
      }

      @Override
      public brn a() {
         return this.a;
      }
   }

   public static record b<T>(T a, brn b) implements bro {
      @Override
      public brn a() {
         return this.b;
      }

      public static <E> Codec<bro.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bro.b::b), brn.a.fieldOf("weight").forGetter(bro.b::c)).apply($$1, bro.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public brn c() {
         return this.b;
      }
   }
}
