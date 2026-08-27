import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class edu extends eeb {
   protected final List<eeb> d;
   private final edt a;

   protected edu(List<eeb> $$0, List<egh> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(edr $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract edt a(List<? extends edt> var1);

   @Override
   public final boolean expand(edi $$0, Consumer<eea> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends edu> Codec<T> a(edu.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(asg.a(edz.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends edu> {
      T create(List<eeb> var1, List<egh> var2);
   }
}
