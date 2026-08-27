import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edd extends edc {
   public static final Codec<edd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edd::new)
   );
   private final aer j;

   private edd(aer $$0, int $$1, int $$2, List<efg> $$3, List<edu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public edb a() {
      return ecy.d;
   }

   @Override
   public void a(Consumer<ciy> $$0, ech $$1) {
      ecp $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ecq $$0) {
      ecj<ecp> $$1 = new ecj<>(ecm.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static edc.a<?> a(aer $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edd($$0, $$1, $$2, $$3, $$4));
   }
}
