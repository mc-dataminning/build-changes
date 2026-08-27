import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejy extends ejx {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ejy::new)
   );
   private final aiy j;

   private ejy(aiy $$0, int $$1, int $$2, List<emb> $$3, List<ekp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejw a() {
      return ejt.d;
   }

   @Override
   public void a(Consumer<cpd> $$0, ejc $$1) {
      ejk $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ejl $$0) {
      eje<ejk> $$1 = new eje<>(ejh.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ejx.a<?> a(aiy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejy($$0, $$1, $$2, $$3, $$4));
   }
}
