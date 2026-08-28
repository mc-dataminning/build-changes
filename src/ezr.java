import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ezr extends ezp {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fan> i;
   final BiFunction<cyy, eyz, cyy> a;
   private final ezo j = new ezr.c() {
      @Override
      public void a(Consumer<cyy> $$0, eyz $$1) {
         ezr.this.a(fan.a(ezr.this.a, $$0, $$1), $$1);
      }
   };

   protected ezr(int $$0, int $$1, List<fci> $$2, List<fan> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fap.a($$3);
   }

   protected static <T extends ezr> P4<Mu<T>, Integer, Integer, List<fci>, List<fan>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fap.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ezf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cyy> var1, eyz var2);

   @Override
   public boolean expand(eyz $$0, Consumer<ezo> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ezr.a<?> a(ezr.d $$0) {
      return new ezr.b($$0);
   }

   public abstract static class a<T extends ezr.a<T>> extends ezp.a<T> implements faj<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fan> c = ImmutableList.builder();

      public T a(fan.a $$0) {
         this.c.add($$0.b());
         return this.aA_();
      }

      protected List<fan> a() {
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

   static class b extends ezr.a<ezr.b> {
      private final ezr.d c;

      public b(ezr.d $$0) {
         this.c = $$0;
      }

      protected ezr.b g() {
         return this;
      }

      @Override
      public ezp b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ezo {
      @Override
      public int a(float $$0) {
         return Math.max(azm.d((float)ezr.this.g + (float)ezr.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ezr build(int var1, int var2, List<fci> var3, List<fan> var4);
   }
}
