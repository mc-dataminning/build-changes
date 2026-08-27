import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esi extends esh {
   public static final Codec<esi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.either(aks.a(li.aU), eru.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, esi::new)
   );
   private final Either<aks<eru>, eru> j;

   private esi(Either<aks<eru>, eru> $$0, int $$1, int $$2, List<euu> $$3, List<etb> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.d;
   }

   @Override
   public void a(Consumer<cuh> $$0, erp $$1) {
      ((eru)this.j.map($$1x -> $$1.a().a(li.aU, $$1x).map(ja::a).orElse(eru.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(erv $$0) {
      Optional<aks<eru>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         aks<eru> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(li.aU, $$1x)
                  .ifPresentOrElse($$2x -> ((eru)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static esh.a<?> a(aks<eru> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esi(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static esh.a<?> a(eru $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esi(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
