import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ekt extends ekr {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<ell> i;
   final BiFunction<cpq, ejy, cpq> a;
   private final ekq j = new ekt.c() {
      @Override
      public void a(Consumer<cpq> $$0, ejy $$1) {
         ekt.this.a(ell.a(ekt.this.a, $$0, $$1), $$1);
      }
   };

   protected ekt(int $$0, int $$1, List<emx> $$2, List<ell> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eln.a($$3);
   }

   protected static <T extends ekt> P4<Mu<T>, Integer, Integer, List<emx>, List<ell>> b(Instance<T> $$0) {
      return $$0.group(
            avu.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), avu.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(avu.a(eln.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ekh $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cpq> var1, ejy var2);

   @Override
   public boolean expand(ejy $$0, Consumer<ekq> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ekt.a<?> a(ekt.d $$0) {
      return new ekt.b($$0);
   }

   public abstract static class a<T extends ekt.a<T>> extends ekr.a<T> implements eli<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<ell> c = ImmutableList.builder();

      public T a(ell.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<ell> a() {
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

   static class b extends ekt.a<ekt.b> {
      private final ekt.d c;

      public b(ekt.d $$0) {
         this.c = $$0;
      }

      protected ekt.b g() {
         return this;
      }

      @Override
      public ekr b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ekq {
      @Override
      public int a(float $$0) {
         return Math.max(awm.d((float)ekt.this.g + (float)ekt.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ekt build(int var1, int var2, List<emx> var3, List<ell> var4);
   }
}
