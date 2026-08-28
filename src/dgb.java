import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dgb {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dgb.a a(dgh... $$0) {
      return new dgb.a(List.of($$0));
   }

   static dgb.b a(dgi... $$0) {
      return new dgb.b(List.of($$0));
   }

   static dgb.c a(dgj... $$0) {
      return new dgb.c(List.of($$0));
   }

   public static record a(List<dgh> d) implements dgh {
      public static final MapCodec<dgb.a> a = dgb.a(dgh.b, dgb.a::new, dgb.a::b);

      @Override
      public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
         for (dgh $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dgb.a> a() {
         return a;
      }

      public List<dgh> b() {
         return this.d;
      }
   }

   public static record b(List<dgi> b) implements dgi {
      public static final MapCodec<dgb.b> a = dgb.a(dgi.c, dgb.b::new, dgb.b::b);

      @Override
      public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4, boolean $$5) {
         for (dgi $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dfp $$0, bwf $$1, feq $$2, int $$3) {
         for (dgi $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dgb.b> a() {
         return a;
      }
   }

   public static record c(List<dgj> c) implements dgj {
      public static final MapCodec<dgb.c> a = dgb.a(dgj.b, dgb.c::new, dgb.c::b);

      @Override
      public float a(int $$0, azv $$1, float $$2) {
         for (dgj $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dgb.c> a() {
         return a;
      }

      public List<dgj> b() {
         return this.c;
      }
   }
}
