import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehs extends ehr {
   public static final Codec<ehs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ehs::new)
   );
   private final ahg j;

   private ehs(ahg $$0, int $$1, int $$2, List<ejv> $$3, List<eij> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ehq a() {
      return ehn.d;
   }

   @Override
   public void a(Consumer<cmy> $$0, egw $$1) {
      ehe $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(ehf $$0) {
      egy<ehe> $$1 = new egy<>(ehb.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ehr.a<?> a(ahg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehs($$0, $$1, $$2, $$3, $$4));
   }
}
