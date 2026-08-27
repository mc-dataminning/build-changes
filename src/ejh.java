import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class ejh extends ejo {
   protected final List<ejo> d;
   private final ejg a;

   protected ejh(List<ejo> $$0, List<elu> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eje $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ejg a(List<? extends ejg> var1);

   @Override
   public final boolean expand(eiv $$0, Consumer<ejn> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends ejh> Codec<T> a(ejh.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(avp.a(ejm.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends ejh> {
      T create(List<ejo> var1, List<elu> var2);
   }
}
