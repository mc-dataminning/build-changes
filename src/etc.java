import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class etc extends etj {
   protected final List<etj> d;
   private final etb a;

   protected etc(List<etj> $$0, List<ewe> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(esz $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract etb a(List<? extends etb> var1);

   @Override
   public final boolean expand(est $$0, Consumer<eti> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends etc> MapCodec<T> a(etc.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(eth.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends etc> {
      T create(List<etj> var1, List<ewe> var2);
   }
}
