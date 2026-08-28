import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ezx extends fae {
   protected final List<fae> d;
   private final ezw a;

   protected ezx(List<fae> $$0, List<fcx> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ezu $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ezw a(List<? extends ezw> var1);

   @Override
   public final boolean expand(ezo $$0, Consumer<fad> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ezx> MapCodec<T> a(ezx.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(fac.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ezx> {
      T create(List<fae> var1, List<fcx> var2);
   }
}
