import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class elq extends elp {
   public static final Codec<elq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, elq::new)
   );
   private final ajh j;

   private elq(ajh $$0, int $$1, int $$2, List<ent> $$3, List<emh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public elo a() {
      return ell.d;
   }

   @Override
   public void a(Consumer<cqk> $$0, eku $$1) {
      elc $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(eld $$0) {
      ekw<elc> $$1 = new ekw<>(ekz.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static elp.a<?> a(ajh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new elq($$0, $$1, $$2, $$3, $$4));
   }
}
