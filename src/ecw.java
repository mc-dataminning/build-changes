import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ecw extends edd {
   protected final List<edd> d;
   private final ecv a;

   protected ecw(List<edd> $$0, List<efj> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ect $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ecv a(List<? extends ecv> var1);

   @Override
   public final boolean expand(eck $$0, Consumer<edc> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ecw> Codec<T> a(ecw.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(arj.a(edb.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ecw> {
      T create(List<edd> var1, List<efj> var2);
   }
}
