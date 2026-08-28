import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class erd extends erk {
   protected final List<erk> d;
   private final erc a;

   protected erd(List<erk> $$0, List<euf> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(era $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract erc a(List<? extends erc> var1);

   @Override
   public final boolean expand(equ $$0, Consumer<erj> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends erd> MapCodec<T> a(erd.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(eri.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends erd> {
      T create(List<erk> var1, List<euf> var2);
   }
}
