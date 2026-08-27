import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ejq extends ejo {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eki> i;
   final BiFunction<coz, eiv, coz> a;
   private final ejn j = new ejq.c() {
      @Override
      public void a(Consumer<coz> $$0, eiv $$1) {
         ejq.this.a(eki.a(ejq.this.a, $$0, $$1), $$1);
      }
   };

   protected ejq(int $$0, int $$1, List<elu> $$2, List<eki> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = ekk.a($$3);
   }

   protected static <T extends ejq> P4<Mu<T>, Integer, Integer, List<elu>, List<eki>> b(Instance<T> $$0) {
      return $$0.group(
            avp.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), avp.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(avp.a(ekk.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(eje $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<coz> var1, eiv var2);

   @Override
   public boolean expand(eiv $$0, Consumer<ejn> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ejq.a<?> a(ejq.d $$0) {
      return new ejq.b($$0);
   }

   public abstract static class a<T extends ejq.a<T>> extends ejo.a<T> implements ekf<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eki> c = ImmutableList.builder();

      public T a(eki.a $$0) {
         this.c.add($$0.b());
         return this.aG_();
      }

      protected List<eki> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aG_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aG_();
      }
   }

   static class b extends ejq.a<ejq.b> {
      private final ejq.d c;

      public b(ejq.d $$0) {
         this.c = $$0;
      }

      protected ejq.b g() {
         return this;
      }

      @Override
      public ejo b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ejn {
      @Override
      public int a(float $$0) {
         return Math.max(awh.d((float)ejq.this.g + (float)ejq.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ejq build(int var1, int var2, List<elu> var3, List<eki> var4);
   }
}
