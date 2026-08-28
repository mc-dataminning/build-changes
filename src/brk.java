import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface brk {
   brj a();

   static <T> brk.b<T> a(T $$0, int $$1) {
      return new brk.b<>($$0, brj.a($$1));
   }

   public static class a implements brk {
      private final brj a;

      public a(int $$0) {
         this.a = brj.a($$0);
      }

      public a(brj $$0) {
         this.a = $$0;
      }

      @Override
      public brj a() {
         return this.a;
      }
   }

   public static record b<T>(T a, brj b) implements brk {
      @Override
      public brj a() {
         return this.b;
      }

      public static <E> Codec<brk.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(brk.b::b), brj.a.fieldOf("weight").forGetter(brk.b::c)).apply($$1, brk.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public brj c() {
         return this.b;
      }
   }
}
