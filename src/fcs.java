import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fcs implements fdc {
   protected final List<fdc> c;
   private final Predicate<ezt> a;

   protected fcs(List<fdc> $$0, Predicate<ezt> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fcs> MapCodec<T> a(Function<List<fdc>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fdc.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fcs> Codec<T> b(Function<List<fdc>, T> $$0) {
      return fdc.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ezt $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ezz $$0) {
      fdc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fdc.a {
      private final Builder<fdc> a = ImmutableList.builder();

      protected a(fdc.a... $$0) {
         for (fdc.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fdc.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fdc build() {
         return this.a(this.a.build());
      }

      protected abstract fdc a(List<fdc> var1);
   }
}
