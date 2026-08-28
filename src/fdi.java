import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fdi implements fds {
   protected final List<fds> c;
   private final Predicate<faj> a;

   protected fdi(List<fds> $$0, Predicate<faj> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fdi> MapCodec<T> a(Function<List<fds>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fds.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fdi> Codec<T> b(Function<List<fds>, T> $$0) {
      return fds.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(faj $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(fap $$0) {
      fds.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fds.a {
      private final Builder<fds> a = ImmutableList.builder();

      protected a(fds.a... $$0) {
         for (fds.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fds.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fds build() {
         return this.a(this.a.build());
      }

      protected abstract fds a(List<fds> var1);
   }
}
