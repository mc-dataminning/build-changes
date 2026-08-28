import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eqm extends eqt {
   protected final List<eqt> d;
   private final eql a;

   protected eqm(List<eqt> $$0, List<etn> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eqj $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eql a(List<? extends eql> var1);

   @Override
   public final boolean expand(eqd $$0, Consumer<eqs> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eqm> MapCodec<T> a(eqm.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(eqr.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eqm> {
      T create(List<eqt> var1, List<etn> var2);
   }
}
