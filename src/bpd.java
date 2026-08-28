import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpd {
   bpc a();

   static <T> bpd.b<T> a(T $$0, int $$1) {
      return new bpd.b<>($$0, bpc.a($$1));
   }

   public static class a implements bpd {
      private final bpc a;

      public a(int $$0) {
         this.a = bpc.a($$0);
      }

      public a(bpc $$0) {
         this.a = $$0;
      }

      @Override
      public bpc a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpc b) implements bpd {
      @Override
      public bpc a() {
         return this.b;
      }

      public static <E> Codec<bpd.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpd.b::b), bpc.a.fieldOf("weight").forGetter(bpd.b::c)).apply($$1, bpd.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpc c() {
         return this.b;
      }
   }
}
