import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class fal extends faj {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fbh> i;
   final BiFunction<czn, ezt, czn> a;
   private final fai j = new fal.c() {
      @Override
      public void a(Consumer<czn> $$0, ezt $$1) {
         fal.this.a(fbh.a(fal.this.a, $$0, $$1), $$1);
      }
   };

   protected fal(int $$0, int $$1, List<fdc> $$2, List<fbh> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fbj.a($$3);
   }

   protected static <T extends fal> P4<Mu<T>, Integer, Integer, List<fdc>, List<fbh>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fbj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ezz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<czn> var1, ezt var2);

   @Override
   public boolean expand(ezt $$0, Consumer<fai> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static fal.a<?> a(fal.d $$0) {
      return new fal.b($$0);
   }

   public abstract static class a<T extends fal.a<T>> extends faj.a<T> implements fbd<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fbh> c = ImmutableList.builder();

      public T a(fbh.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<fbh> a() {
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

   static class b extends fal.a<fal.b> {
      private final fal.d c;

      public b(fal.d $$0) {
         this.c = $$0;
      }

      protected fal.b g() {
         return this;
      }

      @Override
      public faj b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements fai {
      @Override
      public int a(float $$0) {
         return Math.max(azm.d((float)fal.this.g + (float)fal.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      fal build(int var1, int var2, List<fdc> var3, List<fbh> var4);
   }
}
