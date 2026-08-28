import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erd extends erc {
   public static final MapCodec<erd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ale.a(lq.aU), eqp.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erd::new)
   );
   private final Either<ale<eqp>, eqp> j;

   private erd(Either<ale<eqp>, eqp> $$0, int $$1, int $$2, List<etu> $$3, List<erx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erb a() {
      return eqy.d;
   }

   @Override
   public void a(Consumer<cur> $$0, eqk $$1) {
      ((eqp)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eqp.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqq $$0) {
      Optional<ale<eqp>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ale<eqp> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eqp)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static erc.a<?> a(ale<eqp> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erd(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static erc.a<?> a(eqp $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erd(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
