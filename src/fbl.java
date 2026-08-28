import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class fbl extends fbj {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fch> i;
   final BiFunction<dak, fat, dak> a;
   private final fbi j = new fbl.c() {
      @Override
      public void a(Consumer<dak> $$0, fat $$1) {
         fbl.this.a(fch.a(fbl.this.a, $$0, $$1), $$1);
      }
   };

   protected fbl(int $$0, int $$1, List<fec> $$2, List<fch> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fcj.a($$3);
   }

   protected static <T extends fbl> P4<Mu<T>, Integer, Integer, List<fec>, List<fch>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fcj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(faz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<dak> var1, fat var2);

   @Override
   public boolean expand(fat $$0, Consumer<fbi> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static fbl.a<?> a(fbl.d $$0) {
      return new fbl.b($$0);
   }

   public abstract static class a<T extends fbl.a<T>> extends fbj.a<T> implements fcd<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fch> c = ImmutableList.builder();

      public T a(fch.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<fch> a() {
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

   static class b extends fbl.a<fbl.b> {
      private final fbl.d c;

      public b(fbl.d $$0) {
         this.c = $$0;
      }

      protected fbl.b g() {
         return this;
      }

      @Override
      public fbj b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements fbi {
      @Override
      public int a(float $$0) {
         return Math.max(azz.d((float)fbl.this.g + (float)fbl.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      fbl build(int var1, int var2, List<fec> var3, List<fch> var4);
   }
}
