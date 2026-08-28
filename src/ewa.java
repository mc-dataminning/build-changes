import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ewa extends ewh {
   protected final List<ewh> d;
   private final evz a;

   protected ewa(List<ewh> $$0, List<eza> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract evz a(List<? extends evz> var1);

   @Override
   public final boolean expand(evr $$0, Consumer<ewg> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ewa> MapCodec<T> a(ewa.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(ewf.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ewa> {
      T create(List<ewh> var1, List<eza> var2);
   }
}
