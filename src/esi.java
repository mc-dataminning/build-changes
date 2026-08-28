import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esi extends esh {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akq.a(lu.bc), eru.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, esi::new)
   );
   private final Either<akq<eru>, eru> j;

   private esi(Either<akq<eru>, eru> $$0, int $$1, int $$2, List<eva> $$3, List<etd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esg a() {
      return esd.d;
   }

   @Override
   public void a(Consumer<cuq> $$0, erp $$1) {
      ((eru)this.j.map($$1x -> $$1.a().a(lu.bc, $$1x).map(jm::a).orElse(eru.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(erv $$0) {
      Optional<akq<eru>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akq<eru> $$2 = $$1.get();
         if (!$$0.b()) {
            $$0.b("Uses reference to " + $$2.a() + ", but references are not allowed");
            return;
         }

         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lu.bc, $$1x)
                  .ifPresentOrElse($$2x -> ((eru)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static esh.a<?> a(akq<eru> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esi(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static esh.a<?> a(eru $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esi(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
