import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class edn extends edl {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eef> i;
   final BiFunction<cjh, ecs, cjh> a;
   private final edk j = new edn.c() {
      @Override
      public void a(Consumer<cjh> $$0, ecs $$1) {
         edn.this.a(eef.a(edn.this.a, $$0, $$1), $$1);
      }
   };

   protected edn(int $$0, int $$1, List<efr> $$2, List<eef> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eeh.a($$3);
   }

   protected static <T extends edn> P4<Mu<T>, Integer, Integer, List<efr>, List<eef>> b(Instance<T> $$0) {
      return $$0.group(
            arh.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), arh.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(arh.a(eeh.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(edb $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cjh> var1, ecs var2);

   @Override
   public boolean expand(ecs $$0, Consumer<edk> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static edn.a<?> a(edn.d $$0) {
      return new edn.b($$0);
   }

   public abstract static class a<T extends edn.a<T>> extends edl.a<T> implements eec<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eef> c = ImmutableList.builder();

      public T a(eef.a $$0) {
         this.c.add($$0.b());
         return this.ax_();
      }

      protected List<eef> a() {
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

   static class b extends edn.a<edn.b> {
      private final edn.d c;

      public b(edn.d $$0) {
         this.c = $$0;
      }

      protected edn.b g() {
         return this;
      }

      @Override
      public edl b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements edk {
      @Override
      public int a(float $$0) {
         return Math.max(ary.d((float)edn.this.g + (float)edn.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      edn build(int var1, int var2, List<efr> var3, List<eef> var4);
   }
}
