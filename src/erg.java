import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class erg extends ere {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<esc> i;
   final BiFunction<cua, eqo, cua> a;
   private final erd j = new erg.c() {
      @Override
      public void a(Consumer<cua> $$0, eqo $$1) {
         erg.this.a(esc.a(erg.this.a, $$0, $$1), $$1);
      }
   };

   protected erg(int $$0, int $$1, List<etz> $$2, List<esc> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ese.a($$3);
   }

   protected static <T extends erg> P4<Mu<T>, Integer, Integer, List<etz>, List<esc>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(ese.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(equ $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cua> var1, eqo var2);

   @Override
   public boolean expand(eqo $$0, Consumer<erd> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static erg.a<?> a(erg.d $$0) {
      return new erg.b($$0);
   }

   public abstract static class a<T extends erg.a<T>> extends ere.a<T> implements ery<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<esc> c = ImmutableList.builder();

      public T a(esc.a $$0) {
         this.c.add($$0.b());
         return this.aC_();
      }

      protected List<esc> a() {
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

   static class b extends erg.a<erg.b> {
      private final erg.d c;

      public b(erg.d $$0) {
         this.c = $$0;
      }

      protected erg.b g() {
         return this;
      }

      @Override
      public ere b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements erd {
      @Override
      public int a(float $$0) {
         return Math.max(aye.d((float)erg.this.g + (float)erg.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      erg build(int var1, int var2, List<etz> var3, List<esc> var4);
   }
}
