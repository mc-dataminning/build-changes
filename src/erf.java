import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class erf extends erm {
   protected final List<erm> d;
   private final ere a;

   protected erf(List<erm> $$0, List<euh> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ere a(List<? extends ere> var1);

   @Override
   public final boolean expand(eqw $$0, Consumer<erl> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends erf> MapCodec<T> a(erf.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(erk.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends erf> {
      T create(List<erm> var1, List<euh> var2);
   }
}
