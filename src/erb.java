import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erb extends era {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ale.a(lq.aU), eqn.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erb::new)
   );
   private final Either<ale<eqn>, eqn> j;

   private erb(Either<ale<eqn>, eqn> $$0, int $$1, int $$2, List<ets> $$3, List<erv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqz a() {
      return eqw.d;
   }

   @Override
   public void a(Consumer<cup> $$0, eqi $$1) {
      ((eqn)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eqn.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqo $$0) {
      Optional<ale<eqn>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ale<eqn> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lq.aU, $$1x)
                  .ifPresentOrElse($$2x -> ((eqn)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static era.a<?> a(ale<eqn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erb(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static era.a<?> a(eqn $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erb(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
