import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etm extends etl {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ala.a(lv.bc), esy.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, etm::new)
   );
   private final Either<ala<esy>, esy> j;

   private etm(Either<ala<esy>, esy> $$0, int $$1, int $$2, List<ewe> $$3, List<euh> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public etk a() {
      return eth.d;
   }

   @Override
   public void a(Consumer<cvl> $$0, est $$1) {
      ((esy)this.j.map($$1x -> $$1.a().a(lv.bc, $$1x).map(jn::a).orElse(esy.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(esz $$0) {
      Optional<ala<esy>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ala<esy> $$2 = $$1.get();
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
                  .a(lv.bc, $$1x)
                  .ifPresentOrElse($$2x -> ((esy)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static etl.a<?> a(ala<esy> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etm(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static etl.a<?> a(esy $$0) {
      return a(($$1, $$2, $$3, $$4) -> new etm(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
