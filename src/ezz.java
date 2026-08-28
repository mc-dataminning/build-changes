import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class ezz extends ezx {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fav> i;
   final BiFunction<czd, ezh, czd> a;
   private final ezw j = new ezz.c() {
      @Override
      public void a(Consumer<czd> $$0, ezh $$1) {
         ezz.this.a(fav.a(ezz.this.a, $$0, $$1), $$1);
      }
   };

   protected ezz(int $$0, int $$1, List<fcq> $$2, List<fav> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fax.a($$3);
   }

   protected static <T extends ezz> P4<Mu<T>, Integer, Integer, List<fcq>, List<fav>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fax.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(ezn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<czd> var1, ezh var2);

   @Override
   public boolean expand(ezh $$0, Consumer<ezw> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static ezz.a<?> a(ezz.d $$0) {
      return new ezz.b($$0);
   }

   public abstract static class a<T extends ezz.a<T>> extends ezx.a<T> implements far<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fav> c = ImmutableList.builder();

      public T a(fav.a $$0) {
         this.c.add($$0.b());
         return this.aB_();
      }

      protected List<fav> a() {
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

   static class b extends ezz.a<ezz.b> {
      private final ezz.d c;

      public b(ezz.d $$0) {
         this.c = $$0;
      }

      protected ezz.b g() {
         return this;
      }

      @Override
      public ezx b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements ezw {
      @Override
      public int a(float $$0) {
         return Math.max(azm.d((float)ezz.this.g + (float)ezz.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      ezz build(int var1, int var2, List<fcq> var3, List<fav> var4);
   }
}
