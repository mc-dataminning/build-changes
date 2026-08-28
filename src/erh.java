import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erh extends erg {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akj.a(lr.bb), eqt.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erh::new)
   );
   private final Either<akj<eqt>, eqt> j;

   private erh(Either<akj<eqt>, eqt> $$0, int $$1, int $$2, List<etz> $$3, List<esc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erf a() {
      return erc.d;
   }

   @Override
   public void a(Consumer<cua> $$0, eqo $$1) {
      ((eqt)this.j.map($$1x -> $$1.a().a(lr.bb, $$1x).map(jj::a).orElse(eqt.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(equ $$0) {
      Optional<akj<eqt>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akj<eqt> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lr.bb, $$1x)
                  .ifPresentOrElse($$2x -> ((eqt)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static erg.a<?> a(akj<eqt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erh(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static erg.a<?> a(eqt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erh(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
