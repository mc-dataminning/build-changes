import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exo implements exy {
   protected final List<exy> c;
   private final Predicate<eun> a;

   protected exo(List<exy> $$0, Predicate<eun> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends exo> MapCodec<T> a(Function<List<exy>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(exy.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends exo> Codec<T> b(Function<List<exy>, T> $$0) {
      return exy.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eun $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eut $$0) {
      exy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements exy.a {
      private final Builder<exy> a = ImmutableList.builder();

      protected a(exy.a... $$0) {
         for (exy.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(exy.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public exy build() {
         return this.a(this.a.build());
      }

      protected abstract exy a(List<exy> var1);
   }
}
