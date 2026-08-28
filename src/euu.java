import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class euu extends eus {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<evq> i;
   final BiFunction<cwb, euc, cwb> a;
   private final eur j = new euu.c() {
      @Override
      public void a(Consumer<cwb> $$0, euc $$1) {
         euu.this.a(evq.a(euu.this.a, $$0, $$1), $$1);
      }
   };

   protected euu(int $$0, int $$1, List<exn> $$2, List<evq> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = evs.a($$3);
   }

   protected static <T extends euu> P4<Mu<T>, Integer, Integer, List<exn>, List<evq>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(evs.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eui $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwb> var1, euc var2);

   @Override
   public boolean expand(euc $$0, Consumer<eur> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static euu.a<?> a(euu.d $$0) {
      return new euu.b($$0);
   }

   public abstract static class a<T extends euu.a<T>> extends eus.a<T> implements evm<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<evq> c = ImmutableList.builder();

      public T a(evq.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<evq> a() {
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

   static class b extends euu.a<euu.b> {
      private final euu.d c;

      public b(euu.d $$0) {
         this.c = $$0;
      }

      protected euu.b g() {
         return this;
      }

      @Override
      public eus b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eur {
      @Override
      public int a(float $$0) {
         return Math.max(azk.d((float)euu.this.g + (float)euu.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      euu build(int var1, int var2, List<exn> var3, List<evq> var4);
   }
}
