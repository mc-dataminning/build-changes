import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ejo extends ejv {
   protected final List<ejv> d;
   private final ejn a;

   protected ejo(List<ejv> $$0, List<emb> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(ejl $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ejn a(List<? extends ejn> var1);

   @Override
   public final boolean expand(ejc $$0, Consumer<eju> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ejo> Codec<T> a(ejo.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(avq.a(ejt.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ejo> {
      T create(List<ejv> var1, List<emb> var2);
   }
}
