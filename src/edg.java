import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class edg extends ede {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<edy> i;
   final BiFunction<cja, ecl, cja> a;
   private final edd j = new edg.c() {
      @Override
      public void a(Consumer<cja> $$0, ecl $$1) {
         edg.this.a(edy.a(edg.this.a, $$0, $$1), $$1);
      }
   };

   protected edg(int $$0, int $$1, List<efk> $$2, List<edy> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eea.a($$3);
   }

   protected static <T extends edg> P4<Mu<T>, Integer, Integer, List<efk>, List<edy>> b(Instance<T> $$0) {
      return $$0.group(
            arb.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), arb.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(arb.a(eea.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ecu $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.b(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cja> var1, ecl var2);

   @Override
   public boolean expand(ecl $$0, Consumer<edd> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static edg.a<?> a(edg.d $$0) {
      return new edg.b($$0);
   }

   public abstract static class a<T extends edg.a<T>> extends ede.a<T> implements edv<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<edy> c = ImmutableList.builder();

      public T a(edy.a $$0) {
         this.c.add($$0.b());
         return this.as_();
      }

      protected List<edy> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.as_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.as_();
      }
   }

   static class b extends edg.a<edg.b> {
      private final edg.d c;

      public b(edg.d $$0) {
         this.c = $$0;
      }

      protected edg.b g() {
         return this;
      }

      @Override
      public ede b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements edd {
      @Override
      public int a(float $$0) {
         return Math.max(ars.d((float)edg.this.g + (float)edg.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      edg build(int var1, int var2, List<efk> var3, List<edy> var4);
   }
}
