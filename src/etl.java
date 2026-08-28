import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etl implements etu {
   protected final List<etu> c;
   private final Predicate<eqk> a;

   protected etl(List<etu> $$0, Predicate<eqk> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends etl> MapCodec<T> a(Function<List<etu>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(etw.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends etl> Codec<T> b(Function<List<etu>, T> $$0) {
      return etw.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqk $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqq $$0) {
      etu.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements etu.a {
      private final Builder<etu> a = ImmutableList.builder();

      protected a(etu.a... $$0) {
         for (etu.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(etu.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public etu build() {
         return this.a(this.a.build());
      }

      protected abstract etu a(List<etu> var1);
   }
}
