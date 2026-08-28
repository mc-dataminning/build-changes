import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ezo implements ezy {
   protected final List<ezy> c;
   private final Predicate<ewp> a;

   protected ezo(List<ezy> $$0, Predicate<ewp> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ezo> MapCodec<T> a(Function<List<ezy>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ezy.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ezo> Codec<T> b(Function<List<ezy>, T> $$0) {
      return ezy.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ewp $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ewv $$0) {
      ezy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ezy.a {
      private final Builder<ezy> a = ImmutableList.builder();

      protected a(ezy.a... $$0) {
         for (ezy.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ezy.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ezy build() {
         return this.a(this.a.build());
      }

      protected abstract ezy a(List<ezy> var1);
   }
}
