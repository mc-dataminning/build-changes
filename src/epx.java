import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class epx extends epv {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eqr> i;
   final BiFunction<cto, epf, cto> a;
   private final epu j = new epx.c() {
      @Override
      public void a(Consumer<cto> $$0, epf $$1) {
         epx.this.a(eqr.a(epx.this.a, $$0, $$1), $$1);
      }
   };

   protected epx(int $$0, int $$1, List<esl> $$2, List<eqr> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eqt.a($$3);
   }

   protected static <T extends epx> P4<Mu<T>, Integer, Integer, List<esl>, List<eqr>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eqt.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(epl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cto> var1, epf var2);

   @Override
   public boolean expand(epf $$0, Consumer<epu> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static epx.a<?> a(epx.d $$0) {
      return new epx.b($$0);
   }

   public abstract static class a<T extends epx.a<T>> extends epv.a<T> implements eqn<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eqr> c = ImmutableList.builder();

      public T a(eqr.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<eqr> a() {
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

   static class b extends epx.a<epx.b> {
      private final epx.d c;

      public b(epx.d $$0) {
         this.c = $$0;
      }

      protected epx.b g() {
         return this;
      }

      @Override
      public epv b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements epu {
      @Override
      public int a(float $$0) {
         return Math.max(ayd.d((float)epx.this.g + (float)epx.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      epx build(int var1, int var2, List<esl> var3, List<eqr> var4);
   }
}
