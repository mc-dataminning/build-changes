import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eha extends egz {
   public static final Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(agt.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eha::new)
   );
   private final agt j;

   private eha(agt $$0, int $$1, int $$2, List<ejd> $$3, List<ehr> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public egy a() {
      return egv.d;
   }

   @Override
   public void a(Consumer<cmh> $$0, ege $$1) {
      egm $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(egn $$0) {
      egg<egm> $$1 = new egg<>(egj.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static egz.a<?> a(agt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eha($$0, $$1, $$2, $$3, $$4));
   }
}
