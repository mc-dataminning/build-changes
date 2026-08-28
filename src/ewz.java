import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ewz extends ewx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exv> i;
   final BiFunction<cxk, ewh, cxk> a;
   private final eww j = new ewz.c() {
      @Override
      public void a(Consumer<cxk> $$0, ewh $$1) {
         ewz.this.a(exv.a(ewz.this.a, $$0, $$1), $$1);
      }
   };

   protected ewz(int $$0, int $$1, List<ezs> $$2, List<exv> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exx.a($$3);
   }

   protected static <T extends ewz> P4<Mu<T>, Integer, Integer, List<ezs>, List<exv>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cxk> var1, ewh var2);

   @Override
   public boolean expand(ewh $$0, Consumer<eww> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ewz.a<?> a(ewz.d $$0) {
      return new ewz.b($$0);
   }

   public abstract static class a<T extends ewz.a<T>> extends ewx.a<T> implements exr<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exv> c = ImmutableList.builder();

      public T a(exv.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<exv> a() {
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

   static class b extends ewz.a<ewz.b> {
      private final ewz.d c;

      public b(ewz.d $$0) {
         this.c = $$0;
      }

      protected ewz.b g() {
         return this;
      }

      @Override
      public ewx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eww {
      @Override
      public int a(float $$0) {
         return Math.max(bae.d((float)ewz.this.g + (float)ewz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ewz build(int var1, int var2, List<ezs> var3, List<exv> var4);
   }
}
