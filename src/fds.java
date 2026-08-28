import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fds implements fec {
   protected final List<fec> c;
   private final Predicate<fat> a;

   protected fds(List<fec> $$0, Predicate<fat> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fds> MapCodec<T> a(Function<List<fec>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fec.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fds> Codec<T> b(Function<List<fec>, T> $$0) {
      return fec.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(fat $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(faz $$0) {
      fec.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fec.a {
      private final Builder<fec> a = ImmutableList.builder();

      protected a(fec.a... $$0) {
         for (fec.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fec.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fec build() {
         return this.a(this.a.build());
      }

      protected abstract fec a(List<fec> var1);
   }
}
