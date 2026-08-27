import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eqy implements erh {
   protected final List<erh> c;
   private final Predicate<eoa> a;

   protected eqy(List<erh> $$0, Predicate<eoa> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eqy> Codec<T> a(Function<List<erh>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(erj.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eqy> Codec<T> b(Function<List<erh>, T> $$0) {
      return erj.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eoa $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eoj $$0) {
      erh.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements erh.a {
      private final Builder<erh> a = ImmutableList.builder();

      protected a(erh.a... $$0) {
         for (erh.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(erh.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public erh build() {
         return this.a(this.a.build());
      }

      protected abstract erh a(List<erh> var1);
   }
}
