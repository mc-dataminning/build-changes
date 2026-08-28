import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class erc extends era {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<erx> i;
   final BiFunction<cur, eqk, cur> a;
   private final eqz j = new erc.c() {
      @Override
      public void a(Consumer<cur> $$0, eqk $$1) {
         erc.this.a(erx.a(erc.this.a, $$0, $$1), $$1);
      }
   };

   protected erc(int $$0, int $$1, List<etu> $$2, List<erx> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = erz.a($$3);
   }

   protected static <T extends erc> P4<Mu<T>, Integer, Integer, List<etu>, List<erx>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(erz.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cur> var1, eqk var2);

   @Override
   public boolean expand(eqk $$0, Consumer<eqz> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static erc.a<?> a(erc.d $$0) {
      return new erc.b($$0);
   }

   public abstract static class a<T extends erc.a<T>> extends era.a<T> implements ert<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<erx> c = ImmutableList.builder();

      public T a(erx.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<erx> a() {
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

   static class b extends erc.a<erc.b> {
      private final erc.d c;

      public b(erc.d $$0) {
         this.c = $$0;
      }

      protected erc.b g() {
         return this;
      }

      @Override
      public era b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqz {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)erc.this.g + (float)erc.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      erc build(int var1, int var2, List<etu> var3, List<erx> var4);
   }
}
