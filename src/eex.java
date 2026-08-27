import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eex implements efg {
   protected final List<efg> c;
   private final Predicate<ech> a;

   protected eex(List<efg> $$0, Predicate<ech> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eex> Codec<T> a(Function<List<efg>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(efi.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eex> Codec<T> b(Function<List<efg>, T> $$0) {
      return efi.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ech $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ecq $$0) {
      efg.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efg.a {
      private final Builder<efg> a = ImmutableList.builder();

      protected a(efg.a... $$0) {
         for (efg.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efg.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efg build() {
         return this.a(this.a.build());
      }

      protected abstract efg a(List<efg> var1);
   }
}
