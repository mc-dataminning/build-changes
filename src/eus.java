import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eus implements evc {
   protected final List<evc> c;
   private final Predicate<err> a;

   protected eus(List<evc> $$0, Predicate<err> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eus> MapCodec<T> a(Function<List<evc>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(evc.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eus> Codec<T> b(Function<List<evc>, T> $$0) {
      return evc.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(err $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(erx $$0) {
      evc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements evc.a {
      private final Builder<evc> a = ImmutableList.builder();

      protected a(evc.a... $$0) {
         for (evc.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(evc.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public evc build() {
         return this.a(this.a.build());
      }

      protected abstract evc a(List<evc> var1);
   }
}
