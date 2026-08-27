import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejl implements eju {
   protected final List<eju> c;
   private final Predicate<egv> a;

   protected ejl(List<eju> $$0, Predicate<egv> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ejl> Codec<T> a(Function<List<eju>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ejw.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ejl> Codec<T> b(Function<List<eju>, T> $$0) {
      return ejw.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(egv $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ehe $$0) {
      eju.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eju.a {
      private final Builder<eju> a = ImmutableList.builder();

      protected a(eju.a... $$0) {
         for (eju.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eju.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eju build() {
         return this.a(this.a.build());
      }

      protected abstract eju a(List<eju> var1);
   }
}
