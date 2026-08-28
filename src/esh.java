import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class esh extends esf {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<etd> i;
   final BiFunction<cuq, erp, cuq> a;
   private final ese j = new esh.c() {
      @Override
      public void a(Consumer<cuq> $$0, erp $$1) {
         esh.this.a(etd.a(esh.this.a, $$0, $$1), $$1);
      }
   };

   protected esh(int $$0, int $$1, List<eva> $$2, List<etd> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = etf.a($$3);
   }

   protected static <T extends esh> P4<Mu<T>, Integer, Integer, List<eva>, List<etd>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(etf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuq> var1, erp var2);

   @Override
   public boolean expand(erp $$0, Consumer<ese> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static esh.a<?> a(esh.d $$0) {
      return new esh.b($$0);
   }

   public abstract static class a<T extends esh.a<T>> extends esf.a<T> implements esz<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<etd> c = ImmutableList.builder();

      public T a(etd.a $$0) {
         this.c.add($$0.b());
         return this.aH_();
      }

      protected List<etd> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aH_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aH_();
      }
   }

   static class b extends esh.a<esh.b> {
      private final esh.d c;

      public b(esh.d $$0) {
         this.c = $$0;
      }

      protected esh.b g() {
         return this;
      }

      @Override
      public esf b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ese {
      @Override
      public int a(float $$0) {
         return Math.max(ayo.d((float)esh.this.g + (float)esh.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      esh build(int var1, int var2, List<eva> var3, List<etd> var4);
   }
}
