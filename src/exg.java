import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class exg extends exe {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eyc> i;
   final BiFunction<cxo, ewo, cxo> a;
   private final exd j = new exg.c() {
      @Override
      public void a(Consumer<cxo> $$0, ewo $$1) {
         exg.this.a(eyc.a(exg.this.a, $$0, $$1), $$1);
      }
   };

   protected exg(int $$0, int $$1, List<ezx> $$2, List<eyc> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eye.a($$3);
   }

   protected static <T extends exg> P4<Mu<T>, Integer, Integer, List<ezx>, List<eyc>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eye.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cxo> var1, ewo var2);

   @Override
   public boolean expand(ewo $$0, Consumer<exd> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static exg.a<?> a(exg.d $$0) {
      return new exg.b($$0);
   }

   public abstract static class a<T extends exg.a<T>> extends exe.a<T> implements exy<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eyc> c = ImmutableList.builder();

      public T a(eyc.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<eyc> a() {
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

   static class b extends exg.a<exg.b> {
      private final exg.d c;

      public b(exg.d $$0) {
         this.c = $$0;
      }

      protected exg.b g() {
         return this;
      }

      @Override
      public exe b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements exd {
      @Override
      public int a(float $$0) {
         return Math.max(bae.d((float)exg.this.g + (float)exg.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      exg build(int var1, int var2, List<ezx> var3, List<eyc> var4);
   }
}
