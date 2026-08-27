import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ehq extends eho {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eii> i;
   final BiFunction<cmx, egv, cmx> a;
   private final ehn j = new ehq.c() {
      @Override
      public void a(Consumer<cmx> $$0, egv $$1) {
         ehq.this.a(eii.a(ehq.this.a, $$0, $$1), $$1);
      }
   };

   protected ehq(int $$0, int $$1, List<eju> $$2, List<eii> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eik.a($$3);
   }

   protected static <T extends ehq> P4<Mu<T>, Integer, Integer, List<eju>, List<eii>> b(Instance<T> $$0) {
      return $$0.group(
            atv.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), atv.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(atv.a(eik.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ehe $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cmx> var1, egv var2);

   @Override
   public boolean expand(egv $$0, Consumer<ehn> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ehq.a<?> a(ehq.d $$0) {
      return new ehq.b($$0);
   }

   public abstract static class a<T extends ehq.a<T>> extends eho.a<T> implements eif<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eii> c = ImmutableList.builder();

      public T a(eii.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<eii> a() {
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

   static class b extends ehq.a<ehq.b> {
      private final ehq.d c;

      public b(ehq.d $$0) {
         this.c = $$0;
      }

      protected ehq.b g() {
         return this;
      }

      @Override
      public eho b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ehn {
      @Override
      public int a(float $$0) {
         return Math.max(aun.d((float)ehq.this.g + (float)ehq.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ehq build(int var1, int var2, List<eju> var3, List<eii> var4);
   }
}
