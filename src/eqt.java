import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eqt extends era {
   protected final List<era> d;
   private final eqs a;

   protected eqt(List<era> $$0, List<etu> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eqq $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eqs a(List<? extends eqs> var1);

   @Override
   public final boolean expand(eqk $$0, Consumer<eqz> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eqt> MapCodec<T> a(eqt.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(eqy.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eqt> {
      T create(List<era> var1, List<etu> var2);
   }
}
