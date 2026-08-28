import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqz extends eqy {
   public static final MapCodec<eqz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ald.a(lq.aU), eql.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eqz::new)
   );
   private final Either<ald<eql>, eql> j;

   private eqz(Either<ald<eql>, eql> $$0, int $$1, int $$2, List<etq> $$3, List<ert> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eqx a() {
      return equ.d;
   }

   @Override
   public void a(Consumer<cun> $$0, eqg $$1) {
      ((eql)this.j.map($$1x -> $$1.a().a(lq.aU, $$1x).map(ji::a).orElse(eql.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eqm $$0) {
      Optional<ald<eql>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ald<eql> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eql)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eqy.a<?> a(ald<eql> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqz(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eqy.a<?> a(eql $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqz(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
