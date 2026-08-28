import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class euw extends evd {
   protected final List<evd> d;
   private final euv a;

   protected euw(List<evd> $$0, List<exy> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract euv a(List<? extends euv> var1);

   @Override
   public final boolean expand(eun $$0, Consumer<evc> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends euw> MapCodec<T> a(euw.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(evb.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends euw> {
      T create(List<evd> var1, List<exy> var2);
   }
}
