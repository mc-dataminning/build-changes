import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eqs extends eqz {
   protected final List<eqz> d;
   private final eqr a;

   protected eqs(List<eqz> $$0, List<ett> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eqp $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eqr a(List<? extends eqr> var1);

   @Override
   public final boolean expand(eqj $$0, Consumer<eqy> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eqs> MapCodec<T> a(eqs.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(eqx.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eqs> {
      T create(List<eqz> var1, List<ett> var2);
   }
}
