import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class efj extends efq {
   protected final List<efq> d;
   private final efi a;

   protected efj(List<efq> $$0, List<ehw> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(efg $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract efi a(List<? extends efi> var1);

   @Override
   public final boolean expand(eex $$0, Consumer<efp> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends efj> Codec<T> a(efj.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(asu.a(efo.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends efj> {
      T create(List<efq> var1, List<ehw> var2);
   }
}
