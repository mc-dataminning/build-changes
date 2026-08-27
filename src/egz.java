import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class egz extends egx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<ehr> i;
   final BiFunction<cmh, ege, cmh> a;
   private final egw j = new egz.c() {
      @Override
      public void a(Consumer<cmh> $$0, ege $$1) {
         egz.this.a(ehr.a(egz.this.a, $$0, $$1), $$1);
      }
   };

   protected egz(int $$0, int $$1, List<ejd> $$2, List<ehr> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eht.a($$3);
   }

   protected static <T extends egz> P4<Mu<T>, Integer, Integer, List<ejd>, List<ehr>> b(Instance<T> $$0) {
      return $$0.group(
            atg.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), atg.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(atg.a(eht.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(egn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cmh> var1, ege var2);

   @Override
   public boolean expand(ege $$0, Consumer<egw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static egz.a<?> a(egz.d $$0) {
      return new egz.b($$0);
   }

   public abstract static class a<T extends egz.a<T>> extends egx.a<T> implements eho<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<ehr> c = ImmutableList.builder();

      public T a(ehr.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<ehr> a() {
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

   static class b extends egz.a<egz.b> {
      private final egz.d c;

      public b(egz.d $$0) {
         this.c = $$0;
      }

      protected egz.b g() {
         return this;
      }

      @Override
      public egx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements egw {
      @Override
      public int a(float $$0) {
         return Math.max(aty.d((float)egz.this.g + (float)egz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      egz build(int var1, int var2, List<ejd> var3, List<ehr> var4);
   }
}
