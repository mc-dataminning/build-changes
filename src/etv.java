import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etv implements euf {
   protected final List<euf> c;
   private final Predicate<equ> a;

   protected etv(List<euf> $$0, Predicate<equ> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends etv> MapCodec<T> a(Function<List<euf>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(euf.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends etv> Codec<T> b(Function<List<euf>, T> $$0) {
      return euf.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(equ $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(era $$0) {
      euf.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements euf.a {
      private final Builder<euf> a = ImmutableList.builder();

      protected a(euf.a... $$0) {
         for (euf.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(euf.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public euf build() {
         return this.a(this.a.build());
      }

      protected abstract euf a(List<euf> var1);
   }
}
