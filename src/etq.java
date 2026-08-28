import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class etq extends etx {
   protected final List<etx> d;
   private final etp a;

   protected etq(List<etx> $$0, List<ews> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(etn $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract etp a(List<? extends etp> var1);

   @Override
   public final boolean expand(eth $$0, Consumer<etw> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends etq> MapCodec<T> a(etq.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(etv.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends etq> {
      T create(List<etx> var1, List<ews> var2);
   }
}
