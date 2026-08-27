import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class edf extends edd {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<edx> i;
   final BiFunction<cjl, eck, cjl> a;
   private final edc j = new edf.c() {
      @Override
      public void a(Consumer<cjl> $$0, eck $$1) {
         edf.this.a(edx.a(edf.this.a, $$0, $$1), $$1);
      }
   };

   protected edf(int $$0, int $$1, List<efj> $$2, List<edx> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = edz.a($$3);
   }

   protected static <T extends edf> P4<Mu<T>, Integer, Integer, List<efj>, List<edx>> b(Instance<T> $$0) {
      return $$0.group(
            arj.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), arj.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(arj.a(edz.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ect $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cjl> var1, eck var2);

   @Override
   public boolean expand(eck $$0, Consumer<edc> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static edf.a<?> a(edf.d $$0) {
      return new edf.b($$0);
   }

   public abstract static class a<T extends edf.a<T>> extends edd.a<T> implements edu<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<edx> c = ImmutableList.builder();

      public T a(edx.a $$0) {
         this.c.add($$0.b());
         return this.ax_();
      }

      protected List<edx> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.ax_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.ax_();
      }
   }

   static class b extends edf.a<edf.b> {
      private final edf.d c;

      public b(edf.d $$0) {
         this.c = $$0;
      }

      protected edf.b g() {
         return this;
      }

      @Override
      public edd b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements edc {
      @Override
      public int a(float $$0) {
         return Math.max(asb.d((float)edf.this.g + (float)edf.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      edf build(int var1, int var2, List<efj> var3, List<edx> var4);
   }
}
