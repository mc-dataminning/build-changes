import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class fag extends fae {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fbc> i;
   final BiFunction<czk, ezo, czk> a;
   private final fad j = new fag.c() {
      @Override
      public void a(Consumer<czk> $$0, ezo $$1) {
         fag.this.a(fbc.a(fag.this.a, $$0, $$1), $$1);
      }
   };

   protected fag(int $$0, int $$1, List<fcx> $$2, List<fbc> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fbe.a($$3);
   }

   protected static <T extends fag> P4<Mu<T>, Integer, Integer, List<fcx>, List<fbc>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fbe.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<czk> var1, ezo var2);

   @Override
   public boolean expand(ezo $$0, Consumer<fad> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static fag.a<?> a(fag.d $$0) {
      return new fag.b($$0);
   }

   public abstract static class a<T extends fag.a<T>> extends fae.a<T> implements fay<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fbc> c = ImmutableList.builder();

      public T a(fbc.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<fbc> a() {
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

   static class b extends fag.a<fag.b> {
      private final fag.d c;

      public b(fag.d $$0) {
         this.c = $$0;
      }

      protected fag.b g() {
         return this;
      }

      @Override
      public fae b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements fad {
      @Override
      public int a(float $$0) {
         return Math.max(azm.d((float)fag.this.g + (float)fag.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      fag build(int var1, int var2, List<fcx> var3, List<fbc> var4);
   }
}
