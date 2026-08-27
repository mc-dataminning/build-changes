import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class enw extends enu {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eop> i;
   final BiFunction<crj, enb, crj> a;
   private final ent j = new enw.c() {
      @Override
      public void a(Consumer<crj> $$0, enb $$1) {
         enw.this.a(eop.a(enw.this.a, $$0, $$1), $$1);
      }
   };

   protected enw(int $$0, int $$1, List<eqc> $$2, List<eop> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eor.a($$3);
   }

   protected static <T extends enw> P4<Mu<T>, Integer, Integer, List<eqc>, List<eop>> b(Instance<T> $$0) {
      return $$0.group(
            aws.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), aws.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(aws.a(eor.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(enk $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<crj> var1, enb var2);

   @Override
   public boolean expand(enb $$0, Consumer<ent> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static enw.a<?> a(enw.d $$0) {
      return new enw.b($$0);
   }

   public abstract static class a<T extends enw.a<T>> extends enu.a<T> implements eom<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eop> c = ImmutableList.builder();

      public T a(eop.a $$0) {
         this.c.add($$0.b());
         return this.aC_();
      }

      protected List<eop> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aC_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aC_();
      }
   }

   static class b extends enw.a<enw.b> {
      private final enw.d c;

      public b(enw.d $$0) {
         this.c = $$0;
      }

      protected enw.b g() {
         return this;
      }

      @Override
      public enu b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ent {
      @Override
      public int a(float $$0) {
         return Math.max(axk.d((float)enw.this.g + (float)enw.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      enw build(int var1, int var2, List<eqc> var3, List<eop> var4);
   }
}
