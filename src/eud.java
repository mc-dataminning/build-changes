import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eud extends eub {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<euz> i;
   final BiFunction<cvs, etl, cvs> a;
   private final eua j = new eud.c() {
      @Override
      public void a(Consumer<cvs> $$0, etl $$1) {
         eud.this.a(euz.a(eud.this.a, $$0, $$1), $$1);
      }
   };

   protected eud(int $$0, int $$1, List<eww> $$2, List<euz> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = evb.a($$3);
   }

   protected static <T extends eud> P4<Mu<T>, Integer, Integer, List<eww>, List<euz>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(evb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(etr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cvs> var1, etl var2);

   @Override
   public boolean expand(etl $$0, Consumer<eua> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eud.a<?> a(eud.d $$0) {
      return new eud.b($$0);
   }

   public abstract static class a<T extends eud.a<T>> extends eub.a<T> implements euv<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<euz> c = ImmutableList.builder();

      public T a(euz.a $$0) {
         this.c.add($$0.b());
         return this.aG_();
      }

      protected List<euz> a() {
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

   static class b extends eud.a<eud.b> {
      private final eud.d c;

      public b(eud.d $$0) {
         this.c = $$0;
      }

      protected eud.b g() {
         return this;
      }

      @Override
      public eub b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eua {
      @Override
      public int a(float $$0) {
         return Math.max(azf.d((float)eud.this.g + (float)eud.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eud build(int var1, int var2, List<eww> var3, List<euz> var4);
   }
}
