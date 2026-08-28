import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eup extends euw {
   protected final List<euw> d;
   private final euo a;

   protected eup(List<euw> $$0, List<exr> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract euo a(List<? extends euo> var1);

   @Override
   public final boolean expand(eug $$0, Consumer<euv> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eup> MapCodec<T> a(eup.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(euu.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eup> {
      T create(List<euw> var1, List<exr> var2);
   }
}
