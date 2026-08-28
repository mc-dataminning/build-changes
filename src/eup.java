import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eup extends euo {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alg.a(ly.bd), eub.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eup::new)
   );
   private final Either<alg<eub>, eub> j;

   private eup(Either<alg<eub>, eub> $$0, int $$1, int $$2, List<exh> $$3, List<evk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eun a() {
      return euk.d;
   }

   @Override
   public void a(Consumer<cvx> $$0, etw $$1) {
      ((eub)this.j.map($$1x -> $$1.a().c($$1x).map(jp::a).orElse(eub.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(euc $$0) {
      Optional<alg<eub>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alg<eub> $$2 = $$1.get();
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
                  .c($$1x)
                  .ifPresentOrElse($$2x -> ((eub)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static euo.a<?> a(alg<eub> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eup(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static euo.a<?> a(eub $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eup(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
