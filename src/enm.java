import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class enm implements env {
   protected final List<env> c;
   private final Predicate<ekw> a;

   protected enm(List<env> $$0, Predicate<ekw> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends enm> Codec<T> a(Function<List<env>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(enx.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends enm> Codec<T> b(Function<List<env>, T> $$0) {
      return enx.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ekw $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(elf $$0) {
      env.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements env.a {
      private final Builder<env> a = ImmutableList.builder();

      protected a(env.a... $$0) {
         for (env.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(env.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public env build() {
         return this.a(this.a.build());
      }

      protected abstract env a(List<env> var1);
   }
}
