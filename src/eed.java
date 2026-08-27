import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eed extends eeb {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eev> i;
   final BiFunction<ckj, edi, ckj> a;
   private final eea j = new eed.c() {
      @Override
      public void a(Consumer<ckj> $$0, edi $$1) {
         eed.this.a(eev.a(eed.this.a, $$0, $$1), $$1);
      }
   };

   protected eed(int $$0, int $$1, List<egh> $$2, List<eev> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eex.a($$3);
   }

   protected static <T extends eed> P4<Mu<T>, Integer, Integer, List<egh>, List<eev>> b(Instance<T> $$0) {
      return $$0.group(
            asg.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), asg.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(asg.a(eex.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(edr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<ckj> var1, edi var2);

   @Override
   public boolean expand(edi $$0, Consumer<eea> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eed.a<?> a(eed.d $$0) {
      return new eed.b($$0);
   }

   public abstract static class a<T extends eed.a<T>> extends eeb.a<T> implements ees<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eev> c = ImmutableList.builder();

      public T a(eev.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<eev> a() {
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

   static class b extends eed.a<eed.b> {
      private final eed.d c;

      public b(eed.d $$0) {
         this.c = $$0;
      }

      protected eed.b g() {
         return this;
      }

      @Override
      public eeb b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eea {
      @Override
      public int a(float $$0) {
         return Math.max(asy.d((float)eed.this.g + (float)eed.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eed build(int var1, int var2, List<egh> var3, List<eev> var4);
   }
}
