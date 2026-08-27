import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efy implements egh {
   protected final List<egh> c;
   private final Predicate<edi> a;

   protected efy(List<egh> $$0, Predicate<edi> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends efy> Codec<T> a(Function<List<egh>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(egj.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends efy> Codec<T> b(Function<List<egh>, T> $$0) {
      return egj.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(edi $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(edr $$0) {
      egh.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements egh.a {
      private final Builder<egh> a = ImmutableList.builder();

      protected a(egh.a... $$0) {
         for (egh.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(egh.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public egh build() {
         return this.a(this.a.build());
      }

      protected abstract egh a(List<egh> var1);
   }
}
