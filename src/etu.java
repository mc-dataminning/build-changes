import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class etu extends eub {
   protected final List<eub> d;
   private final ett a;

   protected etu(List<eub> $$0, List<eww> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(etr $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ett a(List<? extends ett> var1);

   @Override
   public final boolean expand(etl $$0, Consumer<eua> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends etu> MapCodec<T> a(etu.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(etz.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends etu> {
      T create(List<eub> var1, List<eww> var2);
   }
}
