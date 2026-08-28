import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class fbb extends faz {
   public static final int d = 1;
   public static final int f = 0;
   protected final int g;
   protected final int h;
   protected final List<fbx> i;
   final BiFunction<daa, faj, daa> a;
   private final fay j = new fbb.c() {
      @Override
      public void a(Consumer<daa> $$0, faj $$1) {
         fbb.this.a(fbx.a(fbb.this.a, $$0, $$1), $$1);
      }
   };

   protected fbb(int $$0, int $$1, List<fds> $$2, List<fbx> $$3) {
      super($$2);
      this.g = $$0;
      this.h = $$1;
      this.i = $$3;
      this.a = fbz.a($$3);
   }

   protected static <T extends fbb> P4<Mu<T>, Integer, Integer, List<fds>, List<fbx>> b(Instance<T> $$0) {
      return $$0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter($$0x -> $$0x.g), Codec.INT.optionalFieldOf("quality", 0).forGetter($$0x -> $$0x.h))
         .and(a($$0).t1())
         .and(fbz.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.i));
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".functions[" + $$1 + "]"));
      }
   }

   protected abstract void a(Consumer<daa> var1, faj var2);

   @Override
   public boolean expand(faj $$0, Consumer<fay> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static fbb.a<?> a(fbb.d $$0) {
      return new fbb.b($$0);
   }

   public abstract static class a<T extends fbb.a<T>> extends faz.a<T> implements fbt<T> {
      protected int a = 1;
      protected int b = 0;
      private final Builder<fbx> c = ImmutableList.builder();

      public T a(fbx.a $$0) {
         this.c.add($$0.b());
         return this.aF_();
      }

      protected List<fbx> a() {
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

   static class b extends fbb.a<fbb.b> {
      private final fbb.d c;

      public b(fbb.d $$0) {
         this.c = $$0;
      }

      protected fbb.b g() {
         return this;
      }

      @Override
      public faz b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements fay {
      @Override
      public int a(float $$0) {
         return Math.max(azq.d((float)fbb.this.g + (float)fbb.this.h * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      fbb build(int var1, int var2, List<fds> var3, List<fbx> var4);
   }
}
