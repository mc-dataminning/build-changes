import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fba extends faz {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(fam.a, fam.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fba::new)
   );
   private final Either<alh<fam>, fam> j;

   private fba(Either<alh<fam>, fam> $$0, int $$1, int $$2, List<fdq> $$3, List<fbv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fay a() {
      return fav.d;
   }

   @Override
   public void a(Consumer<czy> $$0, fah $$1) {
      ((fam)this.j.map($$1x -> $$1.a().c($$1x).map(jf::a).orElse(fam.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(fan $$0) {
      Optional<alh<fam>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alh<fam> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((fam)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static faz.a<?> a(alh<fam> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fba(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static faz.a<?> a(fam $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fba(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
