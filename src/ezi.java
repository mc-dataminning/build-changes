import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ezi implements ezs {
   protected final List<ezs> c;
   private final Predicate<ewh> a;

   protected ezi(List<ezs> $$0, Predicate<ewh> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ezi> MapCodec<T> a(Function<List<ezs>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ezs.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ezi> Codec<T> b(Function<List<ezs>, T> $$0) {
      return ezs.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ewh $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ewn $$0) {
      ezs.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ezs.a {
      private final Builder<ezs> a = ImmutableList.builder();

      protected a(ezs.a... $$0) {
         for (ezs.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ezs.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ezs build() {
         return this.a(this.a.build());
      }

      protected abstract ezs a(List<ezs> var1);
   }
}
