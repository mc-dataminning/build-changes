import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efy extends efx {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agm.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efy::new)
   );
   private final agm j;

   private efy(agm $$0, int $$1, int $$2, List<eib> $$3, List<egp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public efw a() {
      return eft.d;
   }

   @Override
   public void a(Consumer<clo> $$0, efc $$1) {
      efk $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(efl $$0) {
      efe<efk> $$1 = new efe<>(efh.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static efx.a<?> a(agm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efy($$0, $$1, $$2, $$3, $$4));
   }
}
