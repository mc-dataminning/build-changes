import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eqy extends eqw {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<ert> i;
   final BiFunction<cun, eqg, cun> a;
   private final eqv j = new eqy.c() {
      @Override
      public void a(Consumer<cun> $$0, eqg $$1) {
         eqy.this.a(ert.a(eqy.this.a, $$0, $$1), $$1);
      }
   };

   protected eqy(int $$0, int $$1, List<etq> $$2, List<ert> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = erv.a($$3);
   }

   protected static <T extends eqy> P4<Mu<T>, Integer, Integer, List<etq>, List<ert>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(erv.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqm $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cun> var1, eqg var2);

   @Override
   public boolean expand(eqg $$0, Consumer<eqv> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eqy.a<?> a(eqy.d $$0) {
      return new eqy.b($$0);
   }

   public abstract static class a<T extends eqy.a<T>> extends eqw.a<T> implements erp<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<ert> c = ImmutableList.builder();

      public T a(ert.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<ert> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aB_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aB_();
      }
   }

   static class b extends eqy.a<eqy.b> {
      private final eqy.d c;

      public b(eqy.d $$0) {
         this.c = $$0;
      }

      protected eqy.b g() {
         return this;
      }

      @Override
      public eqw b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqv {
      @Override
      public int a(float $$0) {
         return Math.max(ayx.d((float)eqy.this.g + (float)eqy.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eqy build(int var1, int var2, List<etq> var3, List<ert> var4);
   }
}
