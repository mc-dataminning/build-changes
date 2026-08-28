import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erc extends erb {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ale.a(lq.aU), eqo.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erc::new)
   );
   private final Either<ale<eqo>, eqo> j;

   private erc(Either<ale<eqo>, eqo> $$0, int $$1, int $$2, List<ett> $$3, List<erw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public era a() {
      return eqx.d;
   }

   @Override
   public void a(Consumer<cuq> $$0, eqj $$1) {
      ((eqo)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eqo.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqp $$0) {
      Optional<ale<eqo>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ale<eqo> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eqo)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static erb.a<?> a(ale<eqo> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erc(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static erb.a<?> a(eqo $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erc(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
