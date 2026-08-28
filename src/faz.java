import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class faz extends fax {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fbv> i;
   final BiFunction<czy, fah, czy> a;
   private final faw j = new faz.c() {
      @Override
      public void a(Consumer<czy> $$0, fah $$1) {
         faz.this.a(fbv.a(faz.this.a, $$0, $$1), $$1);
      }
   };

   protected faz(int $$0, int $$1, List<fdq> $$2, List<fbv> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fbx.a($$3);
   }

   protected static <T extends faz> P4<Mu<T>, Integer, Integer, List<fdq>, List<fbv>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fbx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(fan $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<czy> var1, fah var2);

   @Override
   public boolean expand(fah $$0, Consumer<faw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static faz.a<?> a(faz.d $$0) {
      return new faz.b($$0);
   }

   public abstract static class a<T extends faz.a<T>> extends fax.a<T> implements fbr<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fbv> c = ImmutableList.builder();

      public T a(fbv.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<fbv> a() {
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

   static class b extends faz.a<faz.b> {
      private final faz.d c;

      public b(faz.d $$0) {
         this.c = $$0;
      }

      protected faz.b g() {
         return this;
      }

      @Override
      public fax b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements faw {
      @Override
      public int a(float $$0) {
         return Math.max(azo.d((float)faz.this.g + (float)faz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      faz build(int var1, int var2, List<fdq> var3, List<fbv> var4);
   }
}
