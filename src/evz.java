import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class evz extends ewg {
   protected final List<ewg> d;
   private final evy a;

   protected evz(List<ewg> $$0, List<eyz> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(evw $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract evy a(List<? extends evy> var1);

   @Override
   public final boolean expand(evq $$0, Consumer<ewf> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends evz> MapCodec<T> a(evz.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(ewe.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends evz> {
      T create(List<ewg> var1, List<eyz> var2);
   }
}
