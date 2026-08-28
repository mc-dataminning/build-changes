import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ewk extends ewi {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exg> i;
   final BiFunction<cwq, evs, cwq> a;
   private final ewh j = new ewk.c() {
      @Override
      public void a(Consumer<cwq> $$0, evs $$1) {
         ewk.this.a(exg.a(ewk.this.a, $$0, $$1), $$1);
      }
   };

   protected ewk(int $$0, int $$1, List<ezb> $$2, List<exg> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exi.a($$3);
   }

   protected static <T extends ewk> P4<Mu<T>, Integer, Integer, List<ezb>, List<exg>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exi.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwq> var1, evs var2);

   @Override
   public boolean expand(evs $$0, Consumer<ewh> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ewk.a<?> a(ewk.d $$0) {
      return new ewk.b($$0);
   }

   public abstract static class a<T extends ewk.a<T>> extends ewi.a<T> implements exc<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exg> c = ImmutableList.builder();

      public T a(exg.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<exg> a() {
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

   static class b extends ewk.a<ewk.b> {
      private final ewk.d c;

      public b(ewk.d $$0) {
         this.c = $$0;
      }

      protected ewk.b g() {
         return this;
      }

      @Override
      public ewi b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ewh {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)ewk.this.g + (float)ewk.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ewk build(int var1, int var2, List<ezb> var3, List<exg> var4);
   }
}
