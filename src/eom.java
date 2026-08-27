import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class eom extends eot {
   protected final List<eot> d;
   private final eol a;

   protected eom(List<eot> $$0, List<erh> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eoj $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eol a(List<? extends eol> var1);

   @Override
   public final boolean expand(eoa $$0, Consumer<eos> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends eom> Codec<T> a(eom.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(axe.a(eor.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends eom> {
      T create(List<eot> var1, List<erh> var2);
   }
}
