import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class euo extends eum {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<evk> i;
   final BiFunction<cvx, etw, cvx> a;
   private final eul j = new euo.c() {
      @Override
      public void a(Consumer<cvx> $$0, etw $$1) {
         euo.this.a(evk.a(euo.this.a, $$0, $$1), $$1);
      }
   };

   protected euo(int $$0, int $$1, List<exh> $$2, List<evk> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = evm.a($$3);
   }

   protected static <T extends euo> P4<Mu<T>, Integer, Integer, List<exh>, List<evk>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(evm.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(euc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cvx> var1, etw var2);

   @Override
   public boolean expand(etw $$0, Consumer<eul> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static euo.a<?> a(euo.d $$0) {
      return new euo.b($$0);
   }

   public abstract static class a<T extends euo.a<T>> extends eum.a<T> implements evg<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<evk> c = ImmutableList.builder();

      public T a(evk.a $$0) {
         this.c.add($$0.b());
         return this.aG_();
      }

      protected List<evk> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aG_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aG_();
      }
   }

   static class b extends euo.a<euo.b> {
      private final euo.d c;

      public b(euo.d $$0) {
         this.c = $$0;
      }

      protected euo.b g() {
         return this;
      }

      @Override
      public eum b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eul {
      @Override
      public int a(float $$0) {
         return Math.max(azj.d((float)euo.this.g + (float)euo.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      euo build(int var1, int var2, List<exh> var3, List<evk> var4);
   }
}
