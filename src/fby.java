import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fby implements fci {
   protected final List<fci> c;
   private final Predicate<eyz> a;

   protected fby(List<fci> $$0, Predicate<eyz> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fby> MapCodec<T> a(Function<List<fci>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fci.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fby> Codec<T> b(Function<List<fci>, T> $$0) {
      return fci.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eyz $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ezf $$0) {
      fci.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fci.a {
      private final Builder<fci> a = ImmutableList.builder();

      protected a(fci.a... $$0) {
         for (fci.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fci.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fci build() {
         return this.a(this.a.build());
      }

      protected abstract fci a(List<fci> var1);
   }
}
