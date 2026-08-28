import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ery extends esf {
   protected final List<esf> d;
   private final erx a;

   protected ery(List<esf> $$0, List<eva> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(erv $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract erx a(List<? extends erx> var1);

   @Override
   public final boolean expand(erp $$0, Consumer<ese> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ery> MapCodec<T> a(ery.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(esd.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ery> {
      T create(List<esf> var1, List<eva> var2);
   }
}
