import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dek {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dek.a a(deq... $$0) {
      return new dek.a(List.of($$0));
   }

   static dek.b a(der... $$0) {
      return new dek.b(List.of($$0));
   }

   static dek.c a(des... $$0) {
      return new dek.c(List.of($$0));
   }

   public static record a(List<deq> d) implements deq {
      public static final MapCodec<dek.a> a = dek.a(deq.b, dek.a::new, dek.a::b);

      @Override
      public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
         for (deq $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dek.a> a() {
         return a;
      }

      public List<deq> b() {
         return this.d;
      }
   }

   public static record b(List<der> b) implements der {
      public static final MapCodec<dek.b> a = dek.a(der.c, dek.b::new, dek.b::b);

      @Override
      public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4, boolean $$5) {
         for (der $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(ddy $$0, bvk $$1, fby $$2, int $$3) {
         for (der $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dek.b> a() {
         return a;
      }
   }

   public static record c(List<des> c) implements des {
      public static final MapCodec<dek.c> a = dek.a(des.b, dek.c::new, dek.c::b);

      @Override
      public float a(int $$0, bam $$1, float $$2) {
         for (des $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dek.c> a() {
         return a;
      }

      public List<des> b() {
         return this.c;
      }
   }
}
