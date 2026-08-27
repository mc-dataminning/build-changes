import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eee extends eed {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(afw.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eee::new)
   );
   private final afw j;

   private eee(afw $$0, int $$1, int $$2, List<egh> $$3, List<eev> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eec a() {
      return edz.d;
   }

   @Override
   public void a(Consumer<ckj> $$0, edi $$1) {
      edq $$2 = $$1.a().getLootTable(this.j);
      $$2.a($$1, $$0);
   }

   @Override
   public void a(edr $$0) {
      edk<edq> $$1 = new edk<>(edn.c, this.j);
      if ($$0.a($$1)) {
         $$0.a("Table " + this.j + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a("->{" + this.j + "}", $$1)), () -> $$0.a("Unknown loot table called " + this.j));
      }
   }

   public static eed.a<?> a(afw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eee($$0, $$1, $$2, $$3, $$4));
   }
}
