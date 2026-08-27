import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class edl extends edj {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eed> i;
   final BiFunction<cjf, ecq, cjf> a;
   private final edi j = new edl.c() {
      @Override
      public void a(Consumer<cjf> $$0, ecq $$1) {
         edl.this.a(eed.a(edl.this.a, $$0, $$1), $$1);
      }
   };

   protected edl(int $$0, int $$1, List<efp> $$2, List<eed> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eef.a($$3);
   }

   protected static <T extends edl> P4<Mu<T>, Integer, Integer, List<efp>, List<eed>> b(Instance<T> $$0) {
      return $$0.group(
            arf.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), arf.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(arf.a(eef.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ecz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cjf> var1, ecq var2);

   @Override
   public boolean expand(ecq $$0, Consumer<edi> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static edl.a<?> a(edl.d $$0) {
      return new edl.b($$0);
   }

   public abstract static class a<T extends edl.a<T>> extends edj.a<T> implements eea<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eed> c = ImmutableList.builder();

      public T a(eed.a $$0) {
         this.c.add($$0.b());
         return this.ax_();
      }

      protected List<eed> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.ax_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.ax_();
      }
   }

   static class b extends edl.a<edl.b> {
      private final edl.d c;

      public b(edl.d $$0) {
         this.c = $$0;
      }

      protected edl.b g() {
         return this;
      }

      @Override
      public edj b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements edi {
      @Override
      public int a(float $$0) {
         return Math.max(arw.d((float)edl.this.g + (float)edl.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      edl build(int var1, int var2, List<efp> var3, List<eed> var4);
   }
}
