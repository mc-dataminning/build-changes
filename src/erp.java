import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class erp extends ero {
   public static final MapCodec<erp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akj.a(lr.bb), erb.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, erp::new)
   );
   private final Either<akj<erb>, erb> j;

   private erp(Either<akj<erb>, erb> $$0, int $$1, int $$2, List<euh> $$3, List<esk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ern a() {
      return erk.d;
   }

   @Override
   public void a(Consumer<cud> $$0, eqw $$1) {
      ((erb)this.j.map($$1x -> $$1.a().a(lr.bb, $$1x).map(jj::a).orElse(erb.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(erc $$0) {
      Optional<akj<erb>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akj<erb> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((erb)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ero.a<?> a(akj<erb> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erp(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ero.a<?> a(erb $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erp(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
