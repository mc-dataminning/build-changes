import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dgw {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dgw.a a(dhc... $$0) {
      return new dgw.a(List.of($$0));
   }

   static dgw.b a(dhd... $$0) {
      return new dgw.b(List.of($$0));
   }

   static dgw.c a(dhe... $$0) {
      return new dgw.c(List.of($$0));
   }

   public static record a(List<dhc> d) implements dhc {
      public static final MapCodec<dgw.a> a = dgw.a(dhc.b, dgw.a::new, dgw.a::b);

      @Override
      public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
         for (dhc $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dgw.a> a() {
         return a;
      }

      public List<dhc> b() {
         return this.d;
      }
   }

   public static record b(List<dhd> b) implements dhd {
      public static final MapCodec<dgw.b> a = dgw.a(dhd.c, dgw.b::new, dgw.b::b);

      @Override
      public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4, boolean $$5) {
         for (dhd $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dgk $$0, bwt $$1, ffq $$2, int $$3) {
         for (dhd $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dgw.b> a() {
         return a;
      }
   }

   public static record c(List<dhe> c) implements dhe {
      public static final MapCodec<dgw.c> a = dgw.a(dhe.b, dgw.c::new, dgw.c::b);

      @Override
      public float a(int $$0, azx $$1, float $$2) {
         for (dhe $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dgw.c> a() {
         return a;
      }

      public List<dhe> b() {
         return this.c;
      }
   }
}
