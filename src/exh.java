import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exh implements exr {
   protected final List<exr> c;
   private final Predicate<eug> a;

   protected exh(List<exr> $$0, Predicate<eug> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends exh> MapCodec<T> a(Function<List<exr>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(exr.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends exh> Codec<T> b(Function<List<exr>, T> $$0) {
      return exr.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eug $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eum $$0) {
      exr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements exr.a {
      private final Builder<exr> a = ImmutableList.builder();

      protected a(exr.a... $$0) {
         for (exr.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(exr.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public exr build() {
         return this.a(this.a.build());
      }

      protected abstract exr a(List<exr> var1);
   }
}
