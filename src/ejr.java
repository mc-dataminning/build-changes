import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejr extends ejq {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ejr::new)
   );
   private final aiy j;

   private ejr(aiy $$0, int $$1, int $$2, List<elu> $$3, List<eki> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejp a() {
      return ejm.d;
   }

   @Override
   public void a(Consumer<coz> $$0, eiv $$1) {
      ejd $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(eje $$0) {
      eix<ejd> $$1 = new eix<>(eja.c, this.j);
      if ($$0.a($$1)) {
         $$0.b("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.b("Unknown loot table called " + this.j));
      }
   }

   public static ejq.a<?> a(aiy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejr($$0, $$1, $$2, $$3, $$4));
   }
}
