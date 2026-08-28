import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ern extends erm {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akj.a(lr.bb), eqz.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ern::new)
   );
   private final Either<akj<eqz>, eqz> j;

   private ern(Either<akj<eqz>, eqz> $$0, int $$1, int $$2, List<euf> $$3, List<esi> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public erl a() {
      return eri.d;
   }

   @Override
   public void a(Consumer<cuc> $$0, equ $$1) {
      ((eqz)this.j.map($$1x -> $$1.a().a(lr.bb, $$1x).map(jj::a).orElse(eqz.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(era $$0) {
      Optional<akj<eqz>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akj<eqz> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eqz)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static erm.a<?> a(akj<eqz> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ern(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static erm.a<?> a(eqz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ern(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
