import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eqv extends eqt {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<erq> i;
   final BiFunction<cuk, eqd, cuk> a;
   private final eqs j = new eqv.c() {
      @Override
      public void a(Consumer<cuk> $$0, eqd $$1) {
         eqv.this.a(erq.a(eqv.this.a, $$0, $$1), $$1);
      }
   };

   protected eqv(int $$0, int $$1, List<etn> $$2, List<erq> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ers.a($$3);
   }

   protected static <T extends eqv> P4<Mu<T>, Integer, Integer, List<etn>, List<erq>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(ers.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuk> var1, eqd var2);

   @Override
   public boolean expand(eqd $$0, Consumer<eqs> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eqv.a<?> a(eqv.d $$0) {
      return new eqv.b($$0);
   }

   public abstract static class a<T extends eqv.a<T>> extends eqt.a<T> implements erm<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<erq> c = ImmutableList.builder();

      public T a(erq.a $$0) {
         this.c.add($$0.b());
         return this.aC_();
      }

      protected List<erq> a() {
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

   static class b extends eqv.a<eqv.b> {
      private final eqv.d c;

      public b(eqv.d $$0) {
         this.c = $$0;
      }

      protected eqv.b g() {
         return this;
      }

      @Override
      public eqt b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqs {
      @Override
      public int a(float $$0) {
         return Math.max(ayu.d((float)eqv.this.g + (float)eqv.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eqv build(int var1, int var2, List<etn> var3, List<erq> var4);
   }
}
