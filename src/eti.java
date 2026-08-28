import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eti implements etr {
   protected final List<etr> c;
   private final Predicate<eqh> a;

   protected eti(List<etr> $$0, Predicate<eqh> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eti> MapCodec<T> a(Function<List<etr>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ett.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eti> Codec<T> b(Function<List<etr>, T> $$0) {
      return ett.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqh $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqn $$0) {
      etr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements etr.a {
      private final Builder<etr> a = ImmutableList.builder();

      protected a(etr.a... $$0) {
         for (etr.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(etr.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public etr build() {
         return this.a(this.a.build());
      }

      protected abstract etr a(List<etr> var1);
   }
}
