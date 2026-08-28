import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyr implements ezb {
   protected final List<ezb> c;
   private final Predicate<evs> a;

   protected eyr(List<ezb> $$0, Predicate<evs> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eyr> MapCodec<T> a(Function<List<ezb>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ezb.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eyr> Codec<T> b(Function<List<ezb>, T> $$0) {
      return ezb.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(evs $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(evy $$0) {
      ezb.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ezb.a {
      private final Builder<ezb> a = ImmutableList.builder();

      protected a(ezb.a... $$0) {
         for (ezb.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ezb.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ezb build() {
         return this.a(this.a.build());
      }

      protected abstract ezb a(List<ezb> var1);
   }
}
