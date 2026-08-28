import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class euy extends euw {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<evu> i;
   final BiFunction<cwf, eug, cwf> a;
   private final euv j = new euy.c() {
      @Override
      public void a(Consumer<cwf> $$0, eug $$1) {
         euy.this.a(evu.a(euy.this.a, $$0, $$1), $$1);
      }
   };

   protected euy(int $$0, int $$1, List<exr> $$2, List<evu> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = evw.a($$3);
   }

   protected static <T extends euy> P4<Mu<T>, Integer, Integer, List<exr>, List<evu>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(evw.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwf> var1, eug var2);

   @Override
   public boolean expand(eug $$0, Consumer<euv> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static euy.a<?> a(euy.d $$0) {
      return new euy.b($$0);
   }

   public abstract static class a<T extends euy.a<T>> extends euw.a<T> implements evq<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<evu> c = ImmutableList.builder();

      public T a(evu.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<evu> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aF_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aF_();
      }
   }

   static class b extends euy.a<euy.b> {
      private final euy.d c;

      public b(euy.d $$0) {
         this.c = $$0;
      }

      protected euy.b g() {
         return this;
      }

      @Override
      public euw b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements euv {
      @Override
      public int a(float $$0) {
         return Math.max(azn.d((float)euy.this.g + (float)euy.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      euy build(int var1, int var2, List<exr> var3, List<evu> var4);
   }
}
