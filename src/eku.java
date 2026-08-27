import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eku extends ekt {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajc.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eku::new)
   );
   private final ajc j;

   private eku(ajc $$0, int $$1, int $$2, List<emx> $$3, List<ell> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eks a() {
      return ekp.d;
   }

   @Override
   public void a(Consumer<cpq> $$0, ejy $$1) {
      ekg $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ekh $$0) {
      eka<ekg> $$1 = new eka<>(ekd.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ekt.a<?> a(ajc $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eku($$0, $$1, $$2, $$3, $$4));
   }
}
