import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ewi extends ewh {
   public static final MapCodec<ewi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akt.a(mc.bg), evu.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewi::new)
   );
   private final Either<akt<evu>, evu> j;

   private ewi(Either<akt<evu>, evu> $$0, int $$1, int $$2, List<eyy> $$3, List<exd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewg a() {
      return ewd.d;
   }

   @Override
   public void a(Consumer<cwn> $$0, evp $$1) {
      ((evu)this.j.map($$1x -> $$1.a().c($$1x).map(jr::a).orElse(evu.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(evv $$0) {
      Optional<akt<evu>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akt<evu> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((evu)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ewh.a<?> a(akt<evu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewi(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ewh.a<?> a(evu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewi(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
