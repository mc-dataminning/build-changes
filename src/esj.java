import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class esj extends esh {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<etf> i;
   final BiFunction<cuq, err, cuq> a;
   private final esg j = new esj.c() {
      @Override
      public void a(Consumer<cuq> $$0, err $$1) {
         esj.this.a(etf.a(esj.this.a, $$0, $$1), $$1);
      }
   };

   protected esj(int $$0, int $$1, List<evc> $$2, List<etf> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eth.a($$3);
   }

   protected static <T extends esj> P4<Mu<T>, Integer, Integer, List<evc>, List<etf>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eth.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuq> var1, err var2);

   @Override
   public boolean expand(err $$0, Consumer<esg> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static esj.a<?> a(esj.d $$0) {
      return new esj.b($$0);
   }

   public abstract static class a<T extends esj.a<T>> extends esh.a<T> implements etb<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<etf> c = ImmutableList.builder();

      public T a(etf.a $$0) {
         this.c.add($$0.b());
         return this.aH_();
      }

      protected List<etf> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aH_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aH_();
      }
   }

   static class b extends esj.a<esj.b> {
      private final esj.d c;

      public b(esj.d $$0) {
         this.c = $$0;
      }

      protected esj.b g() {
         return this;
      }

      @Override
      public esh b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements esg {
      @Override
      public int a(float $$0) {
         return Math.max(ayo.d((float)esj.this.g + (float)esj.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      esj build(int var1, int var2, List<evc> var3, List<etf> var4);
   }
}
