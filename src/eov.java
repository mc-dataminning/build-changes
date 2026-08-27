import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eov extends eot {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<epp> i;
   final BiFunction<csd, eoa, csd> a;
   private final eos j = new eov.c() {
      @Override
      public void a(Consumer<csd> $$0, eoa $$1) {
         eov.this.a(epp.a(eov.this.a, $$0, $$1), $$1);
      }
   };

   protected eov(int $$0, int $$1, List<erh> $$2, List<epp> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = epr.a($$3);
   }

   protected static <T extends eov> P4<Mu<T>, Integer, Integer, List<erh>, List<epp>> b(Instance<T> $$0) {
      return $$0.group(
            axe.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), axe.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(axe.a(epr.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eoj $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<csd> var1, eoa var2);

   @Override
   public boolean expand(eoa $$0, Consumer<eos> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eov.a<?> a(eov.d $$0) {
      return new eov.b($$0);
   }

   public abstract static class a<T extends eov.a<T>> extends eot.a<T> implements epl<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<epp> c = ImmutableList.builder();

      public T a(epp.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<epp> a() {
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

   static class b extends eov.a<eov.b> {
      private final eov.d c;

      public b(eov.d $$0) {
         this.c = $$0;
      }

      protected eov.b g() {
         return this;
      }

      @Override
      public eot b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eos {
      @Override
      public int a(float $$0) {
         return Math.max(axw.d((float)eov.this.g + (float)eov.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eov build(int var1, int var2, List<erh> var3, List<epp> var4);
   }
}
