import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class enn extends enu {
   protected final List<enu> d;
   private final enm a;

   protected enn(List<enu> $$0, List<eqc> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(enk $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract enm a(List<? extends enm> var1);

   @Override
   public final boolean expand(enb $$0, Consumer<ent> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends enn> Codec<T> a(enn.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(aws.a(ens.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends enn> {
      T create(List<enu> var1, List<eqc> var2);
   }
}
