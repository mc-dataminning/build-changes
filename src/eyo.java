import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyo implements eyy {
   protected final List<eyy> c;
   private final Predicate<evp> a;

   protected eyo(List<eyy> $$0, Predicate<evp> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eyo> MapCodec<T> a(Function<List<eyy>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eyy.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eyo> Codec<T> b(Function<List<eyy>, T> $$0) {
      return eyy.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(evp $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(evv $$0) {
      eyy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eyy.a {
      private final Builder<eyy> a = ImmutableList.builder();

      protected a(eyy.a... $$0) {
         for (eyy.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eyy.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eyy build() {
         return this.a(this.a.build());
      }

      protected abstract eyy a(List<eyy> var1);
   }
}
