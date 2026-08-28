import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ezh implements ezr {
   protected final List<ezr> c;
   private final Predicate<ewi> a;

   protected ezh(List<ezr> $$0, Predicate<ewi> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ezh> MapCodec<T> a(Function<List<ezr>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ezr.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ezh> Codec<T> b(Function<List<ezr>, T> $$0) {
      return ezr.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ewi $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ewo $$0) {
      ezr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ezr.a {
      private final Builder<ezr> a = ImmutableList.builder();

      protected a(ezr.a... $$0) {
         for (ezr.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ezr.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ezr build() {
         return this.a(this.a.build());
      }

      protected abstract ezr a(List<ezr> var1);
   }
}
