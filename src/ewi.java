import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ewi extends ewg {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exe> i;
   final BiFunction<cwo, evq, cwo> a;
   private final ewf j = new ewi.c() {
      @Override
      public void a(Consumer<cwo> $$0, evq $$1) {
         ewi.this.a(exe.a(ewi.this.a, $$0, $$1), $$1);
      }
   };

   protected ewi(int $$0, int $$1, List<eyz> $$2, List<exe> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exg.a($$3);
   }

   protected static <T extends ewi> P4<Mu<T>, Integer, Integer, List<eyz>, List<exe>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exg.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwo> var1, evq var2);

   @Override
   public boolean expand(evq $$0, Consumer<ewf> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ewi.a<?> a(ewi.d $$0) {
      return new ewi.b($$0);
   }

   public abstract static class a<T extends ewi.a<T>> extends ewg.a<T> implements exa<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exe> c = ImmutableList.builder();

      public T a(exe.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<exe> a() {
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

   static class b extends ewi.a<ewi.b> {
      private final ewi.d c;

      public b(ewi.d $$0) {
         this.c = $$0;
      }

      protected ewi.b g() {
         return this;
      }

      @Override
      public ewg b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ewf {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)ewi.this.g + (float)ewi.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ewi build(int var1, int var2, List<eyz> var3, List<exe> var4);
   }
}
