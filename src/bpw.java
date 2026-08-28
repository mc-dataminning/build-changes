import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpw {
   bpv a();

   static <T> bpw.b<T> a(T $$0, int $$1) {
      return new bpw.b<>($$0, bpv.a($$1));
   }

   public static class a implements bpw {
      private final bpv a;

      public a(int $$0) {
         this.a = bpv.a($$0);
      }

      public a(bpv $$0) {
         this.a = $$0;
      }

      @Override
      public bpv a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpv b) implements bpw {
      @Override
      public bpv a() {
         return this.b;
      }

      public static <E> Codec<bpw.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpw.b::b), bpv.a.fieldOf("weight").forGetter(bpw.b::c)).apply($$1, bpw.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpv c() {
         return this.b;
      }
   }
}
