import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ewj extends ewh {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exf> i;
   final BiFunction<cwp, evr, cwp> a;
   private final ewg j = new ewj.c() {
      @Override
      public void a(Consumer<cwp> $$0, evr $$1) {
         ewj.this.a(exf.a(ewj.this.a, $$0, $$1), $$1);
      }
   };

   protected ewj(int $$0, int $$1, List<eza> $$2, List<exf> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exh.a($$3);
   }

   protected static <T extends ewj> P4<Mu<T>, Integer, Integer, List<eza>, List<exf>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exh.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwp> var1, evr var2);

   @Override
   public boolean expand(evr $$0, Consumer<ewg> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ewj.a<?> a(ewj.d $$0) {
      return new ewj.b($$0);
   }

   public abstract static class a<T extends ewj.a<T>> extends ewh.a<T> implements exb<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exf> c = ImmutableList.builder();

      public T a(exf.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<exf> a() {
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

   static class b extends ewj.a<ewj.b> {
      private final ewj.d c;

      public b(ewj.d $$0) {
         this.c = $$0;
      }

      protected ewj.b g() {
         return this;
      }

      @Override
      public ewh b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ewg {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)ewj.this.g + (float)ewj.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ewj build(int var1, int var2, List<eza> var3, List<exf> var4);
   }
}
