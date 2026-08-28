import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class exa extends ewy {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exw> i;
   final BiFunction<cxg, ewi, cxg> a;
   private final ewx j = new exa.c() {
      @Override
      public void a(Consumer<cxg> $$0, ewi $$1) {
         exa.this.a(exw.a(exa.this.a, $$0, $$1), $$1);
      }
   };

   protected exa(int $$0, int $$1, List<ezr> $$2, List<exw> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exy.a($$3);
   }

   protected static <T extends exa> P4<Mu<T>, Integer, Integer, List<ezr>, List<exw>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exy.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ewo $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cxg> var1, ewi var2);

   @Override
   public boolean expand(ewi $$0, Consumer<ewx> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static exa.a<?> a(exa.d $$0) {
      return new exa.b($$0);
   }

   public abstract static class a<T extends exa.a<T>> extends ewy.a<T> implements exs<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exw> c = ImmutableList.builder();

      public T a(exw.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<exw> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aF_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aF_();
      }
   }

   static class b extends exa.a<exa.b> {
      private final exa.d c;

      public b(exa.d $$0) {
         this.c = $$0;
      }

      protected exa.b g() {
         return this;
      }

      @Override
      public ewy b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ewx {
      @Override
      public int a(float $$0) {
         return Math.max(azu.d((float)exa.this.g + (float)exa.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      exa build(int var1, int var2, List<ezr> var3, List<exw> var4);
   }
}
