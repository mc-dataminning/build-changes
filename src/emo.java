import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class emo implements emx {
   protected final List<emx> c;
   private final Predicate<ejy> a;

   protected emo(List<emx> $$0, Predicate<ejy> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends emo> Codec<T> a(Function<List<emx>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(emz.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends emo> Codec<T> b(Function<List<emx>, T> $$0) {
      return emz.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ejy $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ekh $$0) {
      emx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements emx.a {
      private final Builder<emx> a = ImmutableList.builder();

      protected a(emx.a... $$0) {
         for (emx.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(emx.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public emx build() {
         return this.a(this.a.build());
      }

      protected abstract emx a(List<emx> var1);
   }
}
