import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class era extends eqy {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<erv> i;
   final BiFunction<cup, eqi, cup> a;
   private final eqx j = new era.c() {
      @Override
      public void a(Consumer<cup> $$0, eqi $$1) {
         era.this.a(erv.a(era.this.a, $$0, $$1), $$1);
      }
   };

   protected era(int $$0, int $$1, List<ets> $$2, List<erv> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = erx.a($$3);
   }

   protected static <T extends era> P4<Mu<T>, Integer, Integer, List<ets>, List<erv>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(erx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cup> var1, eqi var2);

   @Override
   public boolean expand(eqi $$0, Consumer<eqx> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static era.a<?> a(era.d $$0) {
      return new era.b($$0);
   }

   public abstract static class a<T extends era.a<T>> extends eqy.a<T> implements err<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<erv> c = ImmutableList.builder();

      public T a(erv.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<erv> a() {
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

   static class b extends era.a<era.b> {
      private final era.d c;

      public b(era.d $$0) {
         this.c = $$0;
      }

      protected era.b g() {
         return this;
      }

      @Override
      public eqy b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqx {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)era.this.g + (float)era.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      era build(int var1, int var2, List<ets> var3, List<erv> var4);
   }
}
