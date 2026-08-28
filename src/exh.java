import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exh extends exg {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akt.a(mc.bi), ewt.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exh::new)
   );
   private final Either<akt<ewt>, ewt> j;

   private exh(Either<akt<ewt>, ewt> $$0, int $$1, int $$2, List<ezx> $$3, List<eyc> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exf a() {
      return exc.d;
   }

   @Override
   public void a(Consumer<cxh> $$0, ewo $$1) {
      ((ewt)this.j.map($$1x -> $$1.a().c($$1x).map(jr::a).orElse(ewt.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ewu $$0) {
      Optional<akt<ewt>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akt<ewt> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ewt)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static exg.a<?> a(akt<ewt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exh(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static exg.a<?> a(ewt $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exh(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
