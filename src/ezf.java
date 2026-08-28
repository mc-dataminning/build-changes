import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ezf extends ezd {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fab> i;
   final BiFunction<cys, eyn, cys> a;
   private final ezc j = new ezf.c() {
      @Override
      public void a(Consumer<cys> $$0, eyn $$1) {
         ezf.this.a(fab.a(ezf.this.a, $$0, $$1), $$1);
      }
   };

   protected ezf(int $$0, int $$1, List<fbw> $$2, List<fab> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fad.a($$3);
   }

   protected static <T extends ezf> P4<Mu<T>, Integer, Integer, List<fbw>, List<fab>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fad.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eyt $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cys> var1, eyn var2);

   @Override
   public boolean expand(eyn $$0, Consumer<ezc> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ezf.a<?> a(ezf.d $$0) {
      return new ezf.b($$0);
   }

   public abstract static class a<T extends ezf.a<T>> extends ezd.a<T> implements ezx<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fab> c = ImmutableList.builder();

      public T a(fab.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<fab> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aA_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aA_();
      }
   }

   static class b extends ezf.a<ezf.b> {
      private final ezf.d c;

      public b(ezf.d $$0) {
         this.c = $$0;
      }

      protected ezf.b g() {
         return this;
      }

      @Override
      public ezd b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ezc {
      @Override
      public int a(float $$0) {
         return Math.max(azk.d((float)ezf.this.g + (float)ezf.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ezf build(int var1, int var2, List<fbw> var3, List<fab> var4);
   }
}
