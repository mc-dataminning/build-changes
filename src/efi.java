import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efi implements efr {
   protected final List<efr> c;
   private final Predicate<ecs> a;

   protected efi(List<efr> $$0, Predicate<ecs> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends efi> Codec<T> a(Function<List<efr>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(eft.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends efi> Codec<T> b(Function<List<efr>, T> $$0) {
      return eft.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ecs $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(edb $$0) {
      efr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efr.a {
      private final Builder<efr> a = ImmutableList.builder();

      protected a(efr.a... $$0) {
         for (efr.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efr.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efr build() {
         return this.a(this.a.build());
      }

      protected abstract efr a(List<efr> var1);
   }
}
