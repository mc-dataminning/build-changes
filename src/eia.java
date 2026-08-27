import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eia extends ehy {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eis> i;
   final BiFunction<cng, ehf, cng> a;
   private final ehx j = new eia.c() {
      @Override
      public void a(Consumer<cng> $$0, ehf $$1) {
         eia.this.a(eis.a(eia.this.a, $$0, $$1), $$1);
      }
   };

   protected eia(int $$0, int $$1, List<eke> $$2, List<eis> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eiu.a($$3);
   }

   protected static <T extends eia> P4<Mu<T>, Integer, Integer, List<eke>, List<eis>> b(Instance<T> $$0) {
      return $$0.group(
            atx.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), atx.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(atx.a(eiu.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eho $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cng> var1, ehf var2);

   @Override
   public boolean expand(ehf $$0, Consumer<ehx> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eia.a<?> a(eia.d $$0) {
      return new eia.b($$0);
   }

   public abstract static class a<T extends eia.a<T>> extends ehy.a<T> implements eip<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eis> c = ImmutableList.builder();

      public T a(eis.a $$0) {
         this.c.add($$0.b());
         return this.aG_();
      }

      protected List<eis> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aG_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aG_();
      }
   }

   static class b extends eia.a<eia.b> {
      private final eia.d c;

      public b(eia.d $$0) {
         this.c = $$0;
      }

      protected eia.b g() {
         return this;
      }

      @Override
      public ehy b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ehx {
      @Override
      public int a(float $$0) {
         return Math.max(aup.d((float)eia.this.g + (float)eia.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eia build(int var1, int var2, List<eke> var3, List<eis> var4);
   }
}
