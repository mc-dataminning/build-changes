import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class efx extends efv {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<egp> i;
   final BiFunction<clo, efc, clo> a;
   private final efu j = new efx.c() {
      @Override
      public void a(Consumer<clo> $$0, efc $$1) {
         efx.this.a(egp.a(efx.this.a, $$0, $$1), $$1);
      }
   };

   protected efx(int $$0, int $$1, List<eib> $$2, List<egp> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = egr.a($$3);
   }

   protected static <T extends efx> P4<Mu<T>, Integer, Integer, List<eib>, List<egp>> b(Instance<T> $$0) {
      return $$0.group(
            asy.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), asy.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(asy.a(egr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(efl $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<clo> var1, efc var2);

   @Override
   public boolean expand(efc $$0, Consumer<efu> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static efx.a<?> a(efx.d $$0) {
      return new efx.b($$0);
   }

   public abstract static class a<T extends efx.a<T>> extends efv.a<T> implements egm<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<egp> c = ImmutableList.builder();

      public T a(egp.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<egp> a() {
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

   static class b extends efx.a<efx.b> {
      private final efx.d c;

      public b(efx.d $$0) {
         this.c = $$0;
      }

      protected efx.b g() {
         return this;
      }

      @Override
      public efv b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements efu {
      @Override
      public int a(float $$0) {
         return Math.max(atq.d((float)efx.this.g + (float)efx.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      efx build(int var1, int var2, List<eib> var3, List<egp> var4);
   }
}
