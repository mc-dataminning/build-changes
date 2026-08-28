import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface des {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static des.a a(dey... $$0) {
      return new des.a(List.of($$0));
   }

   static des.b a(dez... $$0) {
      return new des.b(List.of($$0));
   }

   static des.c a(dfa... $$0) {
      return new des.c(List.of($$0));
   }

   public static record a(List<dey> d) implements dey {
      public static final MapCodec<des.a> a = des.a(dey.b, des.a::new, des.a::b);

      @Override
      public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
         for (dey $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<des.a> a() {
         return a;
      }

      public List<dey> b() {
         return this.d;
      }
   }

   public static record b(List<dez> b) implements dez {
      public static final MapCodec<des.b> a = des.a(dez.c, des.b::new, des.b::b);

      @Override
      public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4, boolean $$5) {
         for (dez $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(deg $$0, bvs $$1, fcu $$2, int $$3) {
         for (dez $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<des.b> a() {
         return a;
      }
   }

   public static record c(List<dfa> c) implements dfa {
      public static final MapCodec<des.c> a = des.a(dfa.b, des.c::new, des.c::b);

      @Override
      public float a(int $$0, azs $$1, float $$2) {
         for (dfa $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<des.c> a() {
         return a;
      }

      public List<dfa> b() {
         return this.c;
      }
   }
}
