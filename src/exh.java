import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class exh extends exf {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eyd> i;
   final BiFunction<cxp, ewp, cxp> a;
   private final exe j = new exh.c() {
      @Override
      public void a(Consumer<cxp> $$0, ewp $$1) {
         exh.this.a(eyd.a(exh.this.a, $$0, $$1), $$1);
      }
   };

   protected exh(int $$0, int $$1, List<ezy> $$2, List<eyd> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = eyf.a($$3);
   }

   protected static <T extends exh> P4<Mu<T>, Integer, Integer, List<ezy>, List<eyd>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(eyf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ewv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cxp> var1, ewp var2);

   @Override
   public boolean expand(ewp $$0, Consumer<exe> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static exh.a<?> a(exh.d $$0) {
      return new exh.b($$0);
   }

   public abstract static class a<T extends exh.a<T>> extends exf.a<T> implements exz<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eyd> c = ImmutableList.builder();

      public T a(eyd.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<eyd> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aF_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aF_();
      }
   }

   static class b extends exh.a<exh.b> {
      private final exh.d c;

      public b(exh.d $$0) {
         this.c = $$0;
      }

      protected exh.b g() {
         return this;
      }

      @Override
      public exf b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements exe {
      @Override
      public int a(float $$0) {
         return Math.max(bae.d((float)exh.this.g + (float)exh.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      exh build(int var1, int var2, List<ezy> var3, List<eyd> var4);
   }
}
