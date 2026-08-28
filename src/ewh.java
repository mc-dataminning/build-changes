import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ewh extends ewf {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<exd> i;
   final BiFunction<cwn, evp, cwn> a;
   private final ewe j = new ewh.c() {
      @Override
      public void a(Consumer<cwn> $$0, evp $$1) {
         ewh.this.a(exd.a(ewh.this.a, $$0, $$1), $$1);
      }
   };

   protected ewh(int $$0, int $$1, List<eyy> $$2, List<exd> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = exf.a($$3);
   }

   protected static <T extends ewh> P4<Mu<T>, Integer, Integer, List<eyy>, List<exd>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(exf.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(evv $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<cwn> var1, evp var2);

   @Override
   public boolean expand(evp $$0, Consumer<ewe> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ewh.a<?> a(ewh.d $$0) {
      return new ewh.b($$0);
   }

   public abstract static class a<T extends ewh.a<T>> extends ewf.a<T> implements ewz<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<exd> c = ImmutableList.builder();

      public T a(exd.a $$0) {
         this.c.add($$0.b());
         return this.aE_();
      }

      protected List<exd> a() {
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

   static class b extends ewh.a<ewh.b> {
      private final ewh.d c;

      public b(ewh.d $$0) {
         this.c = $$0;
      }

      protected ewh.b g() {
         return this;
      }

      @Override
      public ewf b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ewe {
      @Override
      public int a(float $$0) {
         return Math.max(ayy.d((float)ewh.this.g + (float)ewh.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ewh build(int var1, int var2, List<eyy> var3, List<exd> var4);
   }
}
