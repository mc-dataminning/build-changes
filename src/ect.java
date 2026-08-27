import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ect extends eda {
   protected final List<eda> d;
   private final ecs a;

   protected ect(List<eda> $$0, List<efg> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ecq $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ecs a(List<? extends ecs> var1);

   @Override
   public final boolean expand(ech $$0, Consumer<ecz> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ect> Codec<T> a(ect.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aqy.a(ecy.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ect> {
      T create(List<eda> var1, List<efg> var2);
   }
}
