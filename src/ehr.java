import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ehr extends ehp {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eij> i;
   final BiFunction<cmy, egw, cmy> a;
   private final eho j = new ehr.c() {
      @Override
      public void a(Consumer<cmy> $$0, egw $$1) {
         ehr.this.a(eij.a(ehr.this.a, $$0, $$1), $$1);
      }
   };

   protected ehr(int $$0, int $$1, List<ejv> $$2, List<eij> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eil.a($$3);
   }

   protected static <T extends ehr> P4<Mu<T>, Integer, Integer, List<ejv>, List<eij>> b(Instance<T> $$0) {
      return $$0.group(
            atw.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), atw.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(atw.a(eil.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ehf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cmy> var1, egw var2);

   @Override
   public boolean expand(egw $$0, Consumer<eho> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ehr.a<?> a(ehr.d $$0) {
      return new ehr.b($$0);
   }

   public abstract static class a<T extends ehr.a<T>> extends ehp.a<T> implements eig<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eij> c = ImmutableList.builder();

      public T a(eij.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<eij> a() {
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

   static class b extends ehr.a<ehr.b> {
      private final ehr.d c;

      public b(ehr.d $$0) {
         this.c = $$0;
      }

      protected ehr.b g() {
         return this;
      }

      @Override
      public ehp b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eho {
      @Override
      public int a(float $$0) {
         return Math.max(auo.d((float)ehr.this.g + (float)ehr.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ehr build(int var1, int var2, List<ejv> var3, List<eij> var4);
   }
}
