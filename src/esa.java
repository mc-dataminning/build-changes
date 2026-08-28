import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class esa extends esh {
   protected final List<esh> d;
   private final erz a;

   protected esa(List<esh> $$0, List<evc> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract erz a(List<? extends erz> var1);

   @Override
   public final boolean expand(err $$0, Consumer<esg> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends esa> MapCodec<T> a(esa.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(esf.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends esa> {
      T create(List<esh> var1, List<evc> var2);
   }
}
