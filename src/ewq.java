import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ewq extends ewx {
   protected final List<ewx> d;
   private final ewp a;

   protected ewq(List<ewx> $$0, List<ezs> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ewn $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ewp a(List<? extends ewp> var1);

   @Override
   public final boolean expand(ewh $$0, Consumer<eww> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ewq> MapCodec<T> a(ewq.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(ewv.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ewq> {
      T create(List<ewx> var1, List<ezs> var2);
   }
}
