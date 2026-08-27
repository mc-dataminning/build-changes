import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ehk extends ehi {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eic> i;
   final BiFunction<cmr, egp, cmr> a;
   private final ehh j = new ehk.c() {
      @Override
      public void a(Consumer<cmr> $$0, egp $$1) {
         ehk.this.a(eic.a(ehk.this.a, $$0, $$1), $$1);
      }
   };

   protected ehk(int $$0, int $$1, List<ejo> $$2, List<eic> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eie.a($$3);
   }

   protected static <T extends ehk> P4<Mu<T>, Integer, Integer, List<ejo>, List<eic>> b(Instance<T> $$0) {
      return $$0.group(
            atq.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), atq.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(atq.a(eie.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(egy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cmr> var1, egp var2);

   @Override
   public boolean expand(egp $$0, Consumer<ehh> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ehk.a<?> a(ehk.d $$0) {
      return new ehk.b($$0);
   }

   public abstract static class a<T extends ehk.a<T>> extends ehi.a<T> implements ehz<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eic> c = ImmutableList.builder();

      public T a(eic.a $$0) {
         this.c.add($$0.b());
         return this.aD_();
      }

      protected List<eic> a() {
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

   static class b extends ehk.a<ehk.b> {
      private final ehk.d c;

      public b(ehk.d $$0) {
         this.c = $$0;
      }

      protected ehk.b g() {
         return this;
      }

      @Override
      public ehi b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ehh {
      @Override
      public int a(float $$0) {
         return Math.max(aui.d((float)ehk.this.g + (float)ehk.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ehk build(int var1, int var2, List<ejo> var3, List<eic> var4);
   }
}
