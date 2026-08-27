import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efh extends efg {
   public static final Codec<efh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, efh::new)
   );
   private final agg j;

   private efh(agg $$0, int $$1, int $$2, List<ehk> $$3, List<efy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eff a() {
      return efc.d;
   }

   @Override
   public void a(Consumer<clb> $$0, eel $$1) {
      eet $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(eeu $$0) {
      een<eet> $$1 = new een<>(eeq.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static efg.a<?> a(agg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efh($$0, $$1, $$2, $$3, $$4));
   }
}
