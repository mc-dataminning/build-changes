import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface ddi {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static ddi.a a(ddo... $$0) {
      return new ddi.a(List.of($$0));
   }

   static ddi.b a(ddp... $$0) {
      return new ddi.b(List.of($$0));
   }

   static ddi.c a(ddq... $$0) {
      return new ddi.c(List.of($$0));
   }

   public static record a(List<ddo> d) implements ddo {
      public static final MapCodec<ddi.a> a = ddi.a(ddo.b, ddi.a::new, ddi.a::b);

      @Override
      public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
         for (ddo $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<ddi.a> a() {
         return a;
      }

      public List<ddo> b() {
         return this.d;
      }
   }

   public static record b(List<ddp> b) implements ddp {
      public static final MapCodec<ddi.b> a = ddi.a(ddp.c, ddi.b::new, ddi.b::b);

      @Override
      public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4, boolean $$5) {
         for (ddp $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dcw $$0, buj $$1, fay $$2, int $$3) {
         for (ddp $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<ddi.b> a() {
         return a;
      }
   }

   public static record c(List<ddq> c) implements ddq {
      public static final MapCodec<ddi.c> a = ddi.a(ddq.b, ddi.c::new, ddi.c::b);

      @Override
      public float a(int $$0, azg $$1, float $$2) {
         for (ddq $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<ddi.c> a() {
         return a;
      }

      public List<ddq> b() {
         return this.c;
      }
   }
}
