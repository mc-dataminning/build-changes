import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fcn implements fcx {
   protected final List<fcx> c;
   private final Predicate<ezo> a;

   protected fcn(List<fcx> $$0, Predicate<ezo> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fcn> MapCodec<T> a(Function<List<fcx>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fcx.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fcn> Codec<T> b(Function<List<fcx>, T> $$0) {
      return fcx.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ezo $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ezu $$0) {
      fcx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fcx.a {
      private final Builder<fcx> a = ImmutableList.builder();

      protected a(fcx.a... $$0) {
         for (fcx.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fcx.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fcx build() {
         return this.a(this.a.build());
      }

      protected abstract fcx a(List<fcx> var1);
   }
}
