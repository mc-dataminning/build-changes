import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class elr extends elp {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<emj> i;
   final BiFunction<cqm, ekw, cqm> a;
   private final elo j = new elr.c() {
      @Override
      public void a(Consumer<cqm> $$0, ekw $$1) {
         elr.this.a(emj.a(elr.this.a, $$0, $$1), $$1);
      }
   };

   protected elr(int $$0, int $$1, List<env> $$2, List<emj> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eml.a($$3);
   }

   protected static <T extends elr> P4<Mu<T>, Integer, Integer, List<env>, List<emj>> b(Instance<T> $$0) {
      return $$0.group(
            awe.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), awe.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(awe.a(eml.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(elf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cqm> var1, ekw var2);

   @Override
   public boolean expand(ekw $$0, Consumer<elo> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static elr.a<?> a(elr.d $$0) {
      return new elr.b($$0);
   }

   public abstract static class a<T extends elr.a<T>> extends elp.a<T> implements emg<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<emj> c = ImmutableList.builder();

      public T a(emj.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<emj> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aE_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aE_();
      }
   }

   static class b extends elr.a<elr.b> {
      private final elr.d c;

      public b(elr.d $$0) {
         this.c = $$0;
      }

      protected elr.b g() {
         return this;
      }

      @Override
      public elp b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements elo {
      @Override
      public int a(float $$0) {
         return Math.max(aww.d((float)elr.this.g + (float)elr.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      elr build(int var1, int var2, List<env> var3, List<emj> var4);
   }
}
