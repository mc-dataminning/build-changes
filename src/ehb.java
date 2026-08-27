import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ehb implements ehk {
   protected final List<ehk> c;
   private final Predicate<eel> a;

   protected ehb(List<ehk> $$0, Predicate<eel> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ehb> Codec<T> a(Function<List<ehk>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ehm.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ehb> Codec<T> b(Function<List<ehk>, T> $$0) {
      return ehm.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eel $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eeu $$0) {
      ehk.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ehk.a {
      private final Builder<ehk> a = ImmutableList.builder();

      protected a(ehk.a... $$0) {
         for (ehk.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ehk.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ehk build() {
         return this.a(this.a.build());
      }

      protected abstract ehk a(List<ehk> var1);
   }
}
