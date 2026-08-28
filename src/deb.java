import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface deb {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static deb.a a(deh... $$0) {
      return new deb.a(List.of($$0));
   }

   static deb.b a(dei... $$0) {
      return new deb.b(List.of($$0));
   }

   static deb.c a(dej... $$0) {
      return new deb.c(List.of($$0));
   }

   public static record a(List<deh> d) implements deh {
      public static final MapCodec<deb.a> a = deb.a(deh.b, deb.a::new, deb.a::b);

      @Override
      public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
         for (deh $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<deb.a> a() {
         return a;
      }

      public List<deh> b() {
         return this.d;
      }
   }

   public static record b(List<dei> b) implements dei {
      public static final MapCodec<deb.b> a = deb.a(dei.c, deb.b::new, deb.b::b);

      @Override
      public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4, boolean $$5) {
         for (dei $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(ddp $$0, bvb $$1, fbr $$2, int $$3) {
         for (dei $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<deb.b> a() {
         return a;
      }
   }

   public static record c(List<dej> c) implements dej {
      public static final MapCodec<deb.c> a = deb.a(dej.b, deb.c::new, deb.c::b);

      @Override
      public float a(int $$0, bac $$1, float $$2) {
         for (dej $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<deb.c> a() {
         return a;
      }

      public List<dej> b() {
         return this.c;
      }
   }
}
