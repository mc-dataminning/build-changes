import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fbm implements fbw {
   protected final List<fbw> c;
   private final Predicate<eyn> a;

   protected fbm(List<fbw> $$0, Predicate<eyn> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fbm> MapCodec<T> a(Function<List<fbw>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fbw.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fbm> Codec<T> b(Function<List<fbw>, T> $$0) {
      return fbw.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eyn $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eyt $$0) {
      fbw.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fbw.a {
      private final Builder<fbw> a = ImmutableList.builder();

      protected a(fbw.a... $$0) {
         for (fbw.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fbw.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fbw build() {
         return this.a(this.a.build());
      }

      protected abstract fbw a(List<fbw> var1);
   }
}
