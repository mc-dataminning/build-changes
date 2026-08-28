import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ewx extends exe {
   protected final List<exe> d;
   private final eww a;

   protected ewx(List<exe> $$0, List<ezx> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract eww a(List<? extends eww> var1);

   @Override
   public final boolean expand(ewo $$0, Consumer<exd> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ewx> MapCodec<T> a(ewx.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(exc.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ewx> {
      T create(List<exe> var1, List<ezx> var2);
   }
}
