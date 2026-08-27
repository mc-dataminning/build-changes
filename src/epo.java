import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class epo extends epv {
   protected final List<epv> d;
   private final epn a;

   protected epo(List<epv> $$0, List<esl> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(epl $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract epn a(List<? extends epn> var1);

   @Override
   public final boolean expand(epf $$0, Consumer<epu> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends epo> MapCodec<T> a(epo.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(ept.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends epo> {
      T create(List<epv> var1, List<esl> var2);
   }
}
