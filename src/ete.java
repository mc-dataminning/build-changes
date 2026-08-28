import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ete implements etn {
   protected final List<etn> c;
   private final Predicate<eqd> a;

   protected ete(List<etn> $$0, Predicate<eqd> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ete> MapCodec<T> a(Function<List<etn>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(etp.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ete> Codec<T> b(Function<List<etn>, T> $$0) {
      return etp.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqd $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqj $$0) {
      etn.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements etn.a {
      private final Builder<etn> a = ImmutableList.builder();

      protected a(etn.a... $$0) {
         for (etn.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(etn.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public etn build() {
         return this.a(this.a.build());
      }

      protected abstract etn a(List<etn> var1);
   }
}
