import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class evu implements ewe {
   protected final List<ewe> c;
   private final Predicate<est> a;

   protected evu(List<ewe> $$0, Predicate<est> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends evu> MapCodec<T> a(Function<List<ewe>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ewe.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends evu> Codec<T> b(Function<List<ewe>, T> $$0) {
      return ewe.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(est $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(esz $$0) {
      ewe.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ewe.a {
      private final Builder<ewe> a = ImmutableList.builder();

      protected a(ewe.a... $$0) {
         for (ewe.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ewe.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ewe build() {
         return this.a(this.a.build());
      }

      protected abstract ewe a(List<ewe> var1);
   }
}
