import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class els implements emb {
   protected final List<emb> c;
   private final Predicate<ejc> a;

   protected els(List<emb> $$0, Predicate<ejc> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends els> Codec<T> a(Function<List<emb>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(emd.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends els> Codec<T> b(Function<List<emb>, T> $$0) {
      return emd.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ejc $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ejl $$0) {
      emb.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements emb.a {
      private final Builder<emb> a = ImmutableList.builder();

      protected a(emb.a... $$0) {
         for (emb.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(emb.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public emb build() {
         return this.a(this.a.build());
      }

      protected abstract emb a(List<emb> var1);
   }
}
