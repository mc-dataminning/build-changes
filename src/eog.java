import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eog extends eof {
   public static final Codec<eog> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.either(ajv.a, ens.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eog::new)
   );
   private final Either<ajv, ens> j;

   private eog(Either<ajv, ens> $$0, int $$1, int $$2, List<eql> $$3, List<eoy> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eoe a() {
      return eob.d;
   }

   @Override
   public void a(Consumer<crs> $$0, enk $$1) {
      ((ens)this.j.map($$1x -> $$1.a().getLootTable($$1x), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ent $$0) {
      Optional<ajv> $$1 = this.j.left();
      if ($$1.isPresent()) {
         enm<ens> $$2 = new enm<>(enp.c, $$1.get());
         if ($$0.a($$2)) {
            $$0.b("Table " + $$1.get() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j.ifLeft($$1x -> {
         enm<ens> $$2x = new enm<>(enp.c, $$1x);
         $$0.a().getElementOptional($$2x).ifPresentOrElse($$3 -> $$3.a($$0.a("->{" + $$1x + "}", $$2x)), () -> $$0.b("Unknown loot table called " + $$1x));
      }).ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eof.a<?> a(ajv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eog(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eof.a<?> a(ens $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eog(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
