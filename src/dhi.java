import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dhi {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dhi.a a(dho... $$0) {
      return new dhi.a(List.of($$0));
   }

   static dhi.b a(dhp... $$0) {
      return new dhi.b(List.of($$0));
   }

   static dhi.c a(dhq... $$0) {
      return new dhi.c(List.of($$0));
   }

   public static record a(List<dho> d) implements dho {
      public static final MapCodec<dhi.a> a = dhi.a(dho.b, dhi.a::new, dhi.a::b);

      @Override
      public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
         for (dho $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dhi.a> a() {
         return a;
      }

      public List<dho> b() {
         return this.d;
      }
   }

   public static record b(List<dhp> b) implements dhp {
      public static final MapCodec<dhi.b> a = dhi.a(dhp.c, dhi.b::new, dhi.b::b);

      @Override
      public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4, boolean $$5) {
         for (dhp $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dgw $$0, bxe $$1, fgc $$2, int $$3) {
         for (dhp $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dhi.b> a() {
         return a;
      }
   }

   public static record c(List<dhq> c) implements dhq {
      public static final MapCodec<dhi.c> a = dhi.a(dhq.b, dhi.c::new, dhi.c::b);

      @Override
      public float a(int $$0, bai $$1, float $$2) {
         for (dhq $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dhi.c> a() {
         return a;
      }

      public List<dhq> b() {
         return this.c;
      }
   }
}
