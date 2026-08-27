import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ehr extends ehy {
   protected final List<ehy> d;
   private final ehq a;

   protected ehr(List<ehy> $$0, List<eke> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eho $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ehq a(List<? extends ehq> var1);

   @Override
   public final boolean expand(ehf $$0, Consumer<ehx> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ehr> Codec<T> a(ehr.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(atx.a(ehw.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ehr> {
      T create(List<ehy> var1, List<eke> var2);
   }
}
