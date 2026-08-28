import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ewj extends ewi {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(aku.a(mc.bg), evv.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewj::new)
   );
   private final Either<aku<evv>, evv> j;

   private ewj(Either<aku<evv>, evv> $$0, int $$1, int $$2, List<eyz> $$3, List<exe> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewh a() {
      return ewe.d;
   }

   @Override
   public void a(Consumer<cwo> $$0, evq $$1) {
      ((evv)this.j.map($$1x -> $$1.a().c($$1x).map(jr::a).orElse(evv.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(evw $$0) {
      Optional<aku<evv>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         aku<evv> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((evv)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ewi.a<?> a(aku<evv> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewj(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ewi.a<?> a(evv $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewj(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
