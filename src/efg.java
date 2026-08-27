import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class efg extends efe {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<efy> i;
   final BiFunction<clb, eel, clb> a;
   private final efd j = new efg.c() {
      @Override
      public void a(Consumer<clb> $$0, eel $$1) {
         efg.this.a(efy.a(efg.this.a, $$0, $$1), $$1);
      }
   };

   protected efg(int $$0, int $$1, List<ehk> $$2, List<efy> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ega.a($$3);
   }

   protected static <T extends efg> P4<Mu<T>, Integer, Integer, List<ehk>, List<efy>> b(Instance<T> $$0) {
      return $$0.group(
            asq.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), asq.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(asq.a(ega.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eeu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<clb> var1, eel var2);

   @Override
   public boolean expand(eel $$0, Consumer<efd> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static efg.a<?> a(efg.d $$0) {
      return new efg.b($$0);
   }

   public abstract static class a<T extends efg.a<T>> extends efe.a<T> implements efv<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<efy> c = ImmutableList.builder();

      public T a(efy.a $$0) {
         this.c.add($$0.b());
         return this.aC_();
      }

      protected List<efy> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aC_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aC_();
      }
   }

   static class b extends efg.a<efg.b> {
      private final efg.d c;

      public b(efg.d $$0) {
         this.c = $$0;
      }

      protected efg.b g() {
         return this;
      }

      @Override
      public efe b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements efd {
      @Override
      public int a(float $$0) {
         return Math.max(ati.d((float)efg.this.g + (float)efg.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      efg build(int var1, int var2, List<ehk> var3, List<efy> var4);
   }
}
