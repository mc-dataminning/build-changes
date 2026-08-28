import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dej {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dej.a a(dep... $$0) {
      return new dej.a(List.of($$0));
   }

   static dej.b a(deq... $$0) {
      return new dej.b(List.of($$0));
   }

   static dej.c a(der... $$0) {
      return new dej.c(List.of($$0));
   }

   public static record a(List<dep> d) implements dep {
      public static final MapCodec<dej.a> a = dej.a(dep.b, dej.a::new, dej.a::b);

      @Override
      public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
         for (dep $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dej.a> a() {
         return a;
      }

      public List<dep> b() {
         return this.d;
      }
   }

   public static record b(List<deq> b) implements deq {
      public static final MapCodec<dej.b> a = dej.a(deq.c, dej.b::new, dej.b::b);

      @Override
      public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4, boolean $$5) {
         for (deq $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(ddx $$0, bvj $$1, fbx $$2, int $$3) {
         for (deq $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dej.b> a() {
         return a;
      }
   }

   public static record c(List<der> c) implements der {
      public static final MapCodec<dej.c> a = dej.a(der.b, dej.c::new, dej.c::b);

      @Override
      public float a(int $$0, bam $$1, float $$2) {
         for (der $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dej.c> a() {
         return a;
      }

      public List<der> b() {
         return this.c;
      }
   }
}
