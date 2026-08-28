import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class erm extends erk {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<esi> i;
   final BiFunction<cuc, equ, cuc> a;
   private final erj j = new erm.c() {
      @Override
      public void a(Consumer<cuc> $$0, equ $$1) {
         erm.this.a(esi.a(erm.this.a, $$0, $$1), $$1);
      }
   };

   protected erm(int $$0, int $$1, List<euf> $$2, List<esi> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = esk.a($$3);
   }

   protected static <T extends erm> P4<Mu<T>, Integer, Integer, List<euf>, List<esi>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(esk.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(era $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cuc> var1, equ var2);

   @Override
   public boolean expand(equ $$0, Consumer<erj> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static erm.a<?> a(erm.d $$0) {
      return new erm.b($$0);
   }

   public abstract static class a<T extends erm.a<T>> extends erk.a<T> implements ese<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<esi> c = ImmutableList.builder();

      public T a(esi.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<esi> a() {
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

   static class b extends erm.a<erm.b> {
      private final erm.d c;

      public b(erm.d $$0) {
         this.c = $$0;
      }

      protected erm.b g() {
         return this;
      }

      @Override
      public erk b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements erj {
      @Override
      public int a(float $$0) {
         return Math.max(ayg.d((float)erm.this.g + (float)erm.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      erm build(int var1, int var2, List<euf> var3, List<esi> var4);
   }
}
