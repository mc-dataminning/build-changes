import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ehh extends eho {
   protected final List<eho> d;
   private final ehg a;

   protected ehh(List<eho> $$0, List<eju> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ehe $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ehg a(List<? extends ehg> var1);

   @Override
   public final boolean expand(egv $$0, Consumer<ehn> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ehh> Codec<T> a(ehh.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(atv.a(ehm.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ehh> {
      T create(List<eho> var1, List<eju> var2);
   }
}
