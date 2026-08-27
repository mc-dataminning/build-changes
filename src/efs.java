import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class efs extends efq {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<egk> i;
   final BiFunction<clj, eex, clj> a;
   private final efp j = new efs.c() {
      @Override
      public void a(Consumer<clj> $$0, eex $$1) {
         efs.this.a(egk.a(efs.this.a, $$0, $$1), $$1);
      }
   };

   protected efs(int $$0, int $$1, List<ehw> $$2, List<egk> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = egm.a($$3);
   }

   protected static <T extends efs> P4<Mu<T>, Integer, Integer, List<ehw>, List<egk>> b(Instance<T> $$0) {
      return $$0.group(
            asu.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), asu.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(asu.a(egm.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(efg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<clj> var1, eex var2);

   @Override
   public boolean expand(eex $$0, Consumer<efp> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static efs.a<?> a(efs.d $$0) {
      return new efs.b($$0);
   }

   public abstract static class a<T extends efs.a<T>> extends efq.a<T> implements egh<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<egk> c = ImmutableList.builder();

      public T a(egk.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<egk> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aD_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aD_();
      }
   }

   static class b extends efs.a<efs.b> {
      private final efs.d c;

      public b(efs.d $$0) {
         this.c = $$0;
      }

      protected efs.b g() {
         return this;
      }

      @Override
      public efq b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements efp {
      @Override
      public int a(float $$0) {
         return Math.max(atm.d((float)efs.this.g + (float)efs.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      efs build(int var1, int var2, List<ehw> var3, List<egk> var4);
   }
}
