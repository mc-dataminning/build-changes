import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class erb extends eqz {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<erw> i;
   final BiFunction<cuq, eqj, cuq> a;
   private final eqy j = new erb.c() {
      @Override
      public void a(Consumer<cuq> $$0, eqj $$1) {
         erb.this.a(erw.a(erb.this.a, $$0, $$1), $$1);
      }
   };

   protected erb(int $$0, int $$1, List<ett> $$2, List<erw> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ery.a($$3);
   }

   protected static <T extends erb> P4<Mu<T>, Integer, Integer, List<ett>, List<erw>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(ery.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuq> var1, eqj var2);

   @Override
   public boolean expand(eqj $$0, Consumer<eqy> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static erb.a<?> a(erb.d $$0) {
      return new erb.b($$0);
   }

   public abstract static class a<T extends erb.a<T>> extends eqz.a<T> implements ers<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<erw> c = ImmutableList.builder();

      public T a(erw.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<erw> a() {
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

   static class b extends erb.a<erb.b> {
      private final erb.d c;

      public b(erb.d $$0) {
         this.c = $$0;
      }

      protected erb.b g() {
         return this;
      }

      @Override
      public eqz b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eqy {
      @Override
      public int a(float $$0) {
         return Math.max(ayz.d((float)erb.this.g + (float)erb.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      erb build(int var1, int var2, List<ett> var3, List<erw> var4);
   }
}
