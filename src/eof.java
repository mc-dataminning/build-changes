import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class eof extends eod {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<eoy> i;
   final BiFunction<crs, enk, crs> a;
   private final eoc j = new eof.c() {
      @Override
      public void a(Consumer<crs> $$0, enk $$1) {
         eof.this.a(eoy.a(eof.this.a, $$0, $$1), $$1);
      }
   };

   protected eof(int $$0, int $$1, List<eql> $$2, List<eoy> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = epa.a($$3);
   }

   protected static <T extends eof> P4<Mu<T>, Integer, Integer, List<eql>, List<eoy>> b(Instance<T> $$0) {
      return $$0.group(
            awu.a(Codec.INT, "weight", Integer.valueOf(1)).forGetter($$0x -> $$0x.g), awu.a(Codec.INT, "quality", Integer.valueOf(0)).forGetter($$0x -> $$0x.h)
         )
         .and(a($$0).t1())
         .and(awu.a(epa.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ent $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<crs> var1, enk var2);

   @Override
   public boolean expand(enk $$0, Consumer<eoc> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static eof.a<?> a(eof.d $$0) {
      return new eof.b($$0);
   }

   public abstract static class a<T extends eof.a<T>> extends eod.a<T> implements eov<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<eoy> c = ImmutableList.builder();

      public T a(eoy.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<eoy> a() {
         return this.c.build();
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.aB_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.aB_();
      }
   }

   static class b extends eof.a<eof.b> {
      private final eof.d c;

      public b(eof.d $$0) {
         this.c = $$0;
      }

      protected eof.b g() {
         return this;
      }

      @Override
      public eod b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements eoc {
      @Override
      public int a(float $$0) {
         return Math.max(axm.d((float)eof.this.g + (float)eof.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      eof build(int var1, int var2, List<eql> var3, List<eoy> var4);
   }
}
