import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eib extends eia {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eib::new)
   );
   private final ahh j;

   private eib(ahh $$0, int $$1, int $$2, List<eke> $$3, List<eis> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehz a() {
      return ehw.d;
   }

   @Override
   public void a(Consumer<cng> $$0, ehf $$1) {
      ehn $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(eho $$0) {
      ehh<ehn> $$1 = new ehh<>(ehk.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static eia.a<?> a(ahh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eib($$0, $$1, $$2, $$3, $$4));
   }
}
