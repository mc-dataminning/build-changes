import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class esd extends esb {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<esz> i;
   final BiFunction<cuo, erl, cuo> a;
   private final esa j = new esd.c() {
      @Override
      public void a(Consumer<cuo> $$0, erl $$1) {
         esd.this.a(esz.a(esd.this.a, $$0, $$1), $$1);
      }
   };

   protected esd(int $$0, int $$1, List<euw> $$2, List<esz> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = etb.a($$3);
   }

   protected static <T extends esd> P4<Mu<T>, Integer, Integer, List<euw>, List<esz>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(etb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(err $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuo> var1, erl var2);

   @Override
   public boolean expand(erl $$0, Consumer<esa> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static esd.a<?> a(esd.d $$0) {
      return new esd.b($$0);
   }

   public abstract static class a<T extends esd.a<T>> extends esb.a<T> implements esv<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<esz> c = ImmutableList.builder();

      public T a(esz.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<esz> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aD_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aD_();
      }
   }

   static class b extends esd.a<esd.b> {
      private final esd.d c;

      public b(esd.d $$0) {
         this.c = $$0;
      }

      protected esd.b g() {
         return this;
      }

      @Override
      public esb b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements esa {
      @Override
      public int a(float $$0) {
         return Math.max(ayn.d((float)esd.this.g + (float)esd.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      esd build(int var1, int var2, List<euw> var3, List<esz> var4);
   }
}
