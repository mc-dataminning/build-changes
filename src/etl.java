import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class etl extends etj {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<euh> i;
   final BiFunction<cvl, est, cvl> a;
   private final eti j = new etl.c() {
      @Override
      public void a(Consumer<cvl> $$0, est $$1) {
         etl.this.a(euh.a(etl.this.a, $$0, $$1), $$1);
      }
   };

   protected etl(int $$0, int $$1, List<ewe> $$2, List<euh> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = euj.a($$3);
   }

   protected static <T extends etl> P4<Mu<T>, Integer, Integer, List<ewe>, List<euh>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(euj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cvl> var1, est var2);

   @Override
   public boolean expand(est $$0, Consumer<eti> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static etl.a<?> a(etl.d $$0) {
      return new etl.b($$0);
   }

   public abstract static class a<T extends etl.a<T>> extends etj.a<T> implements eud<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<euh> c = ImmutableList.builder();

      public T a(euh.a $$0) {
         this.c.add($$0.b());
         return this.aH_();
      }

      protected List<euh> a() {
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

   static class b extends etl.a<etl.b> {
      private final etl.d c;

      public b(etl.d $$0) {
         this.c = $$0;
      }

      protected etl.b g() {
         return this;
      }

      @Override
      public etj b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eti {
      @Override
      public int a(float $$0) {
         return Math.max(azc.d((float)etl.this.g + (float)etl.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      etl build(int var1, int var2, List<ewe> var3, List<euh> var4);
   }
}
