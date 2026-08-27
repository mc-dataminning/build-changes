import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eew implements eff {
   protected final List<eff> c;
   private final Predicate<ecg> a;

   protected eew(List<eff> $$0, Predicate<ecg> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eew> Codec<T> a(Function<List<eff>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(efh.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eew> Codec<T> b(Function<List<eff>, T> $$0) {
      return efh.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ecg $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ecp $$0) {
      eff.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eff.a {
      private final Builder<eff> a = ImmutableList.builder();

      protected a(eff.a... $$0) {
         for (eff.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eff.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eff build() {
         return this.a(this.a.build());
      }

      protected abstract eff a(List<eff> var1);
   }
}
