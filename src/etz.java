import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class etz extends etx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<euv> i;
   final BiFunction<cvp, eth, cvp> a;
   private final etw j = new etz.c() {
      @Override
      public void a(Consumer<cvp> $$0, eth $$1) {
         etz.this.a(euv.a(etz.this.a, $$0, $$1), $$1);
      }
   };

   protected etz(int $$0, int $$1, List<ews> $$2, List<euv> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eux.a($$3);
   }

   protected static <T extends etz> P4<Mu<T>, Integer, Integer, List<ews>, List<euv>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eux.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cvp> var1, eth var2);

   @Override
   public boolean expand(eth $$0, Consumer<etw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static etz.a<?> a(etz.d $$0) {
      return new etz.b($$0);
   }

   public abstract static class a<T extends etz.a<T>> extends etx.a<T> implements eur<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<euv> c = ImmutableList.builder();

      public T a(euv.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<euv> a() {
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

   static class b extends etz.a<etz.b> {
      private final etz.d c;

      public b(etz.d $$0) {
         this.c = $$0;
      }

      protected etz.b g() {
         return this;
      }

      @Override
      public etx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements etw {
      @Override
      public int a(float $$0) {
         return Math.max(azd.d((float)etz.this.g + (float)etz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      etz build(int var1, int var2, List<ews> var3, List<euv> var4);
   }
}
