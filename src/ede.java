import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ede extends edl {
   protected final List<edl> d;
   private final edd a;

   protected ede(List<edl> $$0, List<efr> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(edb $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract edd a(List<? extends edd> var1);

   @Override
   public final boolean expand(ecs $$0, Consumer<edk> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ede> Codec<T> a(ede.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(arh.a(edj.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ede> {
      T create(List<edl> var1, List<efr> var2);
   }
}
