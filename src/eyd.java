import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eyd extends eyb {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eyz> i;
   final BiFunction<cxy, exl, cxy> a;
   private final eya j = new eyd.c() {
      @Override
      public void a(Consumer<cxy> $$0, exl $$1) {
         eyd.this.a(eyz.a(eyd.this.a, $$0, $$1), $$1);
      }
   };

   protected eyd(int $$0, int $$1, List<fau> $$2, List<eyz> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ezb.a($$3);
   }

   protected static <T extends eyd> P4<Mu<T>, Integer, Integer, List<fau>, List<eyz>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(ezb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cxy> var1, exl var2);

   @Override
   public boolean expand(exl $$0, Consumer<eya> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eyd.a<?> a(eyd.d $$0) {
      return new eyd.b($$0);
   }

   public abstract static class a<T extends eyd.a<T>> extends eyb.a<T> implements eyv<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eyz> c = ImmutableList.builder();

      public T a(eyz.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<eyz> a() {
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

   static class b extends eyd.a<eyd.b> {
      private final eyd.d c;

      public b(eyd.d $$0) {
         this.c = $$0;
      }

      protected eyd.b g() {
         return this;
      }

      @Override
      public eyb b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eya {
      @Override
      public int a(float $$0) {
         return Math.max(azk.d((float)eyd.this.g + (float)eyd.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eyd build(int var1, int var2, List<fau> var3, List<eyz> var4);
   }
}
