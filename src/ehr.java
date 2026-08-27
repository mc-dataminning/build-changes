import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehr extends ehq {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehr::new)
   );
   private final ahg j;

   private ehr(ahg $$0, int $$1, int $$2, List<eju> $$3, List<eii> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehp a() {
      return ehm.d;
   }

   @Override
   public void a(Consumer<cmx> $$0, egv $$1) {
      ehd $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ehe $$0) {
      egx<ehd> $$1 = new egx<>(eha.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ehq.a<?> a(ahg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehr($$0, $$1, $$2, $$3, $$4));
   }
}
