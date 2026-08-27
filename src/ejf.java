import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejf implements ejo {
   protected final List<ejo> c;
   private final Predicate<egp> a;

   protected ejf(List<ejo> $$0, Predicate<egp> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ejf> Codec<T> a(Function<List<ejo>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ejq.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ejf> Codec<T> b(Function<List<ejo>, T> $$0) {
      return ejq.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(egp $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(egy $$0) {
      ejo.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ejo.a {
      private final Builder<ejo> a = ImmutableList.builder();

      protected a(ejo.a... $$0) {
         for (ejo.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ejo.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ejo build() {
         return this.a(this.a.build());
      }

      protected abstract ejo a(List<ejo> var1);
   }
}
