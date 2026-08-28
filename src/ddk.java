import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface ddk {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static ddk.a a(ddq... $$0) {
      return new ddk.a(List.of($$0));
   }

   static ddk.b a(ddr... $$0) {
      return new ddk.b(List.of($$0));
   }

   static ddk.c a(dds... $$0) {
      return new ddk.c(List.of($$0));
   }

   public static record a(List<ddq> d) implements ddq {
      public static final MapCodec<ddk.a> a = ddk.a(ddq.b, ddk.a::new, ddk.a::b);

      @Override
      public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
         for (ddq $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<ddk.a> a() {
         return a;
      }

      public List<ddq> b() {
         return this.d;
      }
   }

   public static record b(List<ddr> b) implements ddr {
      public static final MapCodec<ddk.b> a = ddk.a(ddr.c, ddk.b::new, ddk.b::b);

      @Override
      public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4, boolean $$5) {
         for (ddr $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dcy $$0, buk $$1, fba $$2, int $$3) {
         for (ddr $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<ddk.b> a() {
         return a;
      }
   }

   public static record c(List<dds> c) implements dds {
      public static final MapCodec<ddk.c> a = ddk.a(dds.b, ddk.c::new, ddk.c::b);

      @Override
      public float a(int $$0, azh $$1, float $$2) {
         for (dds $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<ddk.c> a() {
         return a;
      }

      public List<dds> b() {
         return this.c;
      }
   }
}
