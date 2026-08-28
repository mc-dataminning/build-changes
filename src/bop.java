import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bop {
   boo a();

   static <T> bop.b<T> a(T $$0, int $$1) {
      return new bop.b<>($$0, boo.a($$1));
   }

   public static class a implements bop {
      private final boo a;

      public a(int $$0) {
         this.a = boo.a($$0);
      }

      public a(boo $$0) {
         this.a = $$0;
      }

      @Override
      public boo a() {
         return this.a;
      }
   }

   public static record b<T>(T a, boo b) implements bop {
      @Override
      public boo a() {
         return this.b;
      }

      public static <E> Codec<bop.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bop.b::b), boo.a.fieldOf("weight").forGetter(bop.b::c)).apply($$1, bop.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public boo c() {
         return this.b;
      }
   }
}
