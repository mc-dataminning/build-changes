import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ehs implements eib {
   protected final List<eib> c;
   private final Predicate<efc> a;

   protected ehs(List<eib> $$0, Predicate<efc> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ehs> Codec<T> a(Function<List<eib>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(eid.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ehs> Codec<T> b(Function<List<eib>, T> $$0) {
      return eid.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(efc $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(efl $$0) {
      eib.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eib.a {
      private final Builder<eib> a = ImmutableList.builder();

      protected a(eib.a... $$0) {
         for (eib.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eib.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eib build() {
         return this.a(this.a.build());
      }

      protected abstract eib a(List<eib> var1);
   }
}
