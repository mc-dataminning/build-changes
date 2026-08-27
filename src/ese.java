import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ese implements esn {
   protected final List<esn> c;
   private final Predicate<eph> a;

   protected ese(List<esn> $$0, Predicate<eph> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ese> MapCodec<T> a(Function<List<esn>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(esp.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ese> Codec<T> b(Function<List<esn>, T> $$0) {
      return esp.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eph $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(epn $$0) {
      esn.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements esn.a {
      private final Builder<esn> a = ImmutableList.builder();

      protected a(esn.a... $$0) {
         for (esn.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(esn.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public esn build() {
         return this.a(this.a.build());
      }

      protected abstract esn a(List<esn> var1);
   }
}
