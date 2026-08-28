import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fcg implements fcq {
   protected final List<fcq> c;
   private final Predicate<ezh> a;

   protected fcg(List<fcq> $$0, Predicate<ezh> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fcg> MapCodec<T> a(Function<List<fcq>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fcq.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fcg> Codec<T> b(Function<List<fcq>, T> $$0) {
      return fcq.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ezh $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ezn $$0) {
      fcq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fcq.a {
      private final Builder<fcq> a = ImmutableList.builder();

      protected a(fcq.a... $$0) {
         for (fcq.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fcq.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fcq build() {
         return this.a(this.a.build());
      }

      protected abstract fcq a(List<fcq> var1);
   }
}
