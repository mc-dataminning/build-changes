import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enx extends enw {
   public static final Codec<enx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.either(ajt.a, enj.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, enx::new)
   );
   private final Either<ajt, enj> j;

   private enx(Either<ajt, enj> $$0, int $$1, int $$2, List<eqc> $$3, List<eop> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public env a() {
      return ens.d;
   }

   @Override
   public void a(Consumer<crj> $$0, enb $$1) {
      ((enj)this.j.map($$1x -> $$1.a().getLootTable($$1x), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(enk $$0) {
      Optional<ajt> $$1 = this.j.left();
      if ($$1.isPresent()) {
         end<enj> $$2 = new end<>(eng.c, $$1.get());
         if ($$0.a($$2)) {
            $$0.b("Table " + $$1.get() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j.ifLeft($$1x -> {
         end<enj> $$2x = new end<>(eng.c, $$1x);
         $$0.a().getElementOptional($$2x).ifPresentOrElse($$3 -> $$3.a($$0.a("->{" + $$1x + "}", $$2x)), () -> $$0.b("Unknown loot table called " + $$1x));
      }).ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static enw.a<?> a(ajt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enx(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static enw.a<?> a(enj $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enx(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
