import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehl extends ehk {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahd.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehl::new)
   );
   private final ahd j;

   private ehl(ahd $$0, int $$1, int $$2, List<ejo> $$3, List<eic> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehj a() {
      return ehg.d;
   }

   @Override
   public void a(Consumer<cmr> $$0, egp $$1) {
      egx $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(egy $$0) {
      egr<egx> $$1 = new egr<>(egu.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ehk.a<?> a(ahd $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehl($$0, $$1, $$2, $$3, $$4));
   }
}
