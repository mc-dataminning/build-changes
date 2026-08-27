import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class enk implements ent {
   protected final List<ent> c;
   private final Predicate<eku> a;

   protected enk(List<ent> $$0, Predicate<eku> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends enk> Codec<T> a(Function<List<ent>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(env.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends enk> Codec<T> b(Function<List<ent>, T> $$0) {
      return env.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eku $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eld $$0) {
      ent.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ent.a {
      private final Builder<ent> a = ImmutableList.builder();

      protected a(ent.a... $$0) {
         for (ent.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ent.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ent build() {
         return this.a(this.a.build());
      }

      protected abstract ent a(List<ent> var1);
   }
}
