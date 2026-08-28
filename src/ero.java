import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ero extends erm {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<esk> i;
   final BiFunction<cud, eqw, cud> a;
   private final erl j = new ero.c() {
      @Override
      public void a(Consumer<cud> $$0, eqw $$1) {
         ero.this.a(esk.a(ero.this.a, $$0, $$1), $$1);
      }
   };

   protected ero(int $$0, int $$1, List<euh> $$2, List<esk> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = esm.a($$3);
   }

   protected static <T extends ero> P4<Mu<T>, Integer, Integer, List<euh>, List<esk>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(esm.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cud> var1, eqw var2);

   @Override
   public boolean expand(eqw $$0, Consumer<erl> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ero.a<?> a(ero.d $$0) {
      return new ero.b($$0);
   }

   public abstract static class a<T extends ero.a<T>> extends erm.a<T> implements esg<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<esk> c = ImmutableList.builder();

      public T a(esk.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<esk> a() {
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

   static class b extends ero.a<ero.b> {
      private final ero.d c;

      public b(ero.d $$0) {
         this.c = $$0;
      }

      protected ero.b g() {
         return this;
      }

      @Override
      public erm b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements erl {
      @Override
      public int a(float $$0) {
         return Math.max(ayg.d((float)ero.this.g + (float)ero.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ero build(int var1, int var2, List<euh> var3, List<esk> var4);
   }
}
