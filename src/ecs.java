import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ecs extends ecz {
   protected final List<ecz> d;
   private final ecr a;

   protected ecs(List<ecz> $$0, List<eff> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ecp $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ecr a(List<? extends ecr> var1);

   @Override
   public final boolean expand(ecg $$0, Consumer<ecy> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ecs> Codec<T> a(ecs.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aqy.a(ecx.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ecs> {
      T create(List<ecz> var1, List<eff> var2);
   }
}
