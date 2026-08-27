import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ecx extends ede {
   protected final List<ede> d;
   private final ecw a;

   protected ecx(List<ede> $$0, List<efk> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ecu $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ecw a(List<? extends ecw> var1);

   @Override
   public final boolean expand(ecl $$0, Consumer<edd> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ecx> Codec<T> a(ecx.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(arb.a(edc.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ecx> {
      T create(List<ede> var1, List<efk> var2);
   }
}
