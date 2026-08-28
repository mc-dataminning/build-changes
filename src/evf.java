import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class evf extends evd {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<ewb> i;
   final BiFunction<cwm, eun, cwm> a;
   private final evc j = new evf.c() {
      @Override
      public void a(Consumer<cwm> $$0, eun $$1) {
         evf.this.a(ewb.a(evf.this.a, $$0, $$1), $$1);
      }
   };

   protected evf(int $$0, int $$1, List<exy> $$2, List<ewb> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ewd.a($$3);
   }

   protected static <T extends evf> P4<Mu<T>, Integer, Integer, List<exy>, List<ewb>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(ewd.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwm> var1, eun var2);

   @Override
   public boolean expand(eun $$0, Consumer<evc> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static evf.a<?> a(evf.d $$0) {
      return new evf.b($$0);
   }

   public abstract static class a<T extends evf.a<T>> extends evd.a<T> implements evx<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<ewb> c = ImmutableList.builder();

      public T a(ewb.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<ewb> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aE_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aE_();
      }
   }

   static class b extends evf.a<evf.b> {
      private final evf.d c;

      public b(evf.d $$0) {
         this.c = $$0;
      }

      protected evf.b g() {
         return this;
      }

      @Override
      public evd b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements evc {
      @Override
      public int a(float $$0) {
         return Math.max(azm.d((float)evf.this.g + (float)evf.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      evf build(int var1, int var2, List<exy> var3, List<ewb> var4);
   }
}
