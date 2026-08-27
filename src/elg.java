import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class elg extends eln {
   protected final List<eln> d;
   private final elf a;

   protected elg(List<eln> $$0, List<ent> $$1) {
      super($$1);
      this.d = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(eld $$0) {
      super.a($$0);
      if (this.d.isEmpty()) {
         $$0.b("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         this.d.get($$1).a($$0.a(".entry[" + $$1 + "]"));
      }
   }

   protected abstract elf a(List<? extends elf> var1);

   @Override
   public final boolean expand(eku $$0, Consumer<elm> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends elg> Codec<T> a(elg.a<T> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(awe.a(ell.a.listOf(), "children", List.of()).forGetter($$0xx -> $$0xx.d)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends elg> {
      T create(List<eln> var1, List<ent> var2);
   }
}
