import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class edc extends eda {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<edu> i;
   final BiFunction<ciy, ech, ciy> a;
   private final ecz j = new edc.c() {
      @Override
      public void a(Consumer<ciy> $$0, ech $$1) {
         edc.this.a(edu.a(edc.this.a, $$0, $$1), $$1);
      }
   };

   protected edc(int $$0, int $$1, List<efg> $$2, List<edu> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = edw.a($$3);
   }

   protected static <T extends edc> P4<Mu<T>, Integer, Integer, List<efg>, List<edu>> b(Instance<T> $$0) {
      return $$0.group(
            aqy.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), aqy.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(aqy.a(edw.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ecq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<ciy> var1, ech var2);

   @Override
   public boolean expand(ech $$0, Consumer<ecz> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static edc.a<?> a(edc.d $$0) {
      return new edc.b($$0);
   }

   public abstract static class a<T extends edc.a<T>> extends eda.a<T> implements edr<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<edu> c = ImmutableList.builder();

      public T a(edu.a $$0) {
         this.c.add($$0.b());
         return this.at_();
      }

      protected List<edu> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.at_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.at_();
      }
   }

   static class b extends edc.a<edc.b> {
      private final edc.d c;

      public b(edc.d $$0) {
         this.c = $$0;
      }

      protected edc.b g() {
         return this;
      }

      @Override
      public eda b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ecz {
      @Override
      public int a(float $$0) {
         return Math.max(arp.d((float)edc.this.g + (float)edc.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      edc build(int var1, int var2, List<efg> var3, List<edu> var4);
   }
}
