import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyp implements eyz {
   protected final List<eyz> c;
   private final Predicate<evq> a;

   protected eyp(List<eyz> $$0, Predicate<evq> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eyp> MapCodec<T> a(Function<List<eyz>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eyz.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eyp> Codec<T> b(Function<List<eyz>, T> $$0) {
      return eyz.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(evq $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(evw $$0) {
      eyz.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eyz.a {
      private final Builder<eyz> a = ImmutableList.builder();

      protected a(eyz.a... $$0) {
         for (eyz.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eyz.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eyz build() {
         return this.a(this.a.build());
      }

      protected abstract eyz a(List<eyz> var1);
   }
}
