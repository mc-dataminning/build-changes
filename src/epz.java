import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class epz extends epx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eqt> i;
   final BiFunction<ctq, eph, ctq> a;
   private final epw j = new epz.c() {
      @Override
      public void a(Consumer<ctq> $$0, eph $$1) {
         epz.this.a(eqt.a(epz.this.a, $$0, $$1), $$1);
      }
   };

   protected epz(int $$0, int $$1, List<esn> $$2, List<eqt> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eqv.a($$3);
   }

   protected static <T extends epz> P4<Mu<T>, Integer, Integer, List<esn>, List<eqt>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eqv.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(epn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<ctq> var1, eph var2);

   @Override
   public boolean expand(eph $$0, Consumer<epw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static epz.a<?> a(epz.d $$0) {
      return new epz.b($$0);
   }

   public abstract static class a<T extends epz.a<T>> extends epx.a<T> implements eqp<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eqt> c = ImmutableList.builder();

      public T a(eqt.a $$0) {
         this.c.add($$0.b());
         return this.aC_();
      }

      protected List<eqt> a() {
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

   static class b extends epz.a<epz.b> {
      private final epz.d c;

      public b(epz.d $$0) {
         this.c = $$0;
      }

      protected epz.b g() {
         return this;
      }

      @Override
      public epx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements epw {
      @Override
      public int a(float $$0) {
         return Math.max(ayf.d((float)epz.this.g + (float)epz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      epz build(int var1, int var2, List<esn> var3, List<eqt> var4);
   }
}
