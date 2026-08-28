import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eqz extends eqx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eru> i;
   final BiFunction<cuo, eqh, cuo> a;
   private final eqw j = new eqz.c() {
      @Override
      public void a(Consumer<cuo> $$0, eqh $$1) {
         eqz.this.a(eru.a(eqz.this.a, $$0, $$1), $$1);
      }
   };

   protected eqz(int $$0, int $$1, List<etr> $$2, List<eru> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = erw.a($$3);
   }

   protected static <T extends eqz> P4<Mu<T>, Integer, Integer, List<etr>, List<eru>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(erw.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuo> var1, eqh var2);

   @Override
   public boolean expand(eqh $$0, Consumer<eqw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eqz.a<?> a(eqz.d $$0) {
      return new eqz.b($$0);
   }

   public abstract static class a<T extends eqz.a<T>> extends eqx.a<T> implements erq<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eru> c = ImmutableList.builder();

      public T a(eru.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<eru> a() {
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

   static class b extends eqz.a<eqz.b> {
      private final eqz.d c;

      public b(eqz.d $$0) {
         this.c = $$0;
      }

      protected eqz.b g() {
         return this;
      }

      @Override
      public eqx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqw {
      @Override
      public int a(float $$0) {
         return Math.max(ayy.d((float)eqz.this.g + (float)eqz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eqz build(int var1, int var2, List<etr> var3, List<eru> var4);
   }
}
