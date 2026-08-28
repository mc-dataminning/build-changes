import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eru extends esb {
   protected final List<esb> d;
   private final ert a;

   protected eru(List<esb> $$0, List<euw> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(err $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ert a(List<? extends ert> var1);

   @Override
   public final boolean expand(erl $$0, Consumer<esa> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eru> MapCodec<T> a(eru.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(erz.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eru> {
      T create(List<esb> var1, List<euw> var2);
   }
}
