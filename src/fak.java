import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fak implements fau {
   protected final List<fau> c;
   private final Predicate<exl> a;

   protected fak(List<fau> $$0, Predicate<exl> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fak> MapCodec<T> a(Function<List<fau>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fau.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fak> Codec<T> b(Function<List<fau>, T> $$0) {
      return fau.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(exl $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(exr $$0) {
      fau.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fau.a {
      private final Builder<fau> a = ImmutableList.builder();

      protected a(fau.a... $$0) {
         for (fau.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fau.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fau build() {
         return this.a(this.a.build());
      }

      protected abstract fau a(List<fau> var1);
   }
}
