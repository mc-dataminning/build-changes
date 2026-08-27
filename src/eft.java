import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eft extends efs {
   public static final Codec<eft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agi.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eft::new)
   );
   private final agi j;

   private eft(agi $$0, int $$1, int $$2, List<ehw> $$3, List<egk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efr a() {
      return efo.d;
   }

   @Override
   public void a(Consumer<clj> $$0, eex $$1) {
      eff $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(efg $$0) {
      eez<eff> $$1 = new eez<>(efc.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static efs.a<?> a(agi $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eft($$0, $$1, $$2, $$3, $$4));
   }
}
