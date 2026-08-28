import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euv extends euu {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alh.a(lz.bd), euh.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, euv::new)
   );
   private final Either<alh<euh>, euh> j;

   private euv(Either<alh<euh>, euh> $$0, int $$1, int $$2, List<exn> $$3, List<evq> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eut a() {
      return euq.d;
   }

   @Override
   public void a(Consumer<cwb> $$0, euc $$1) {
      ((euh)this.j.map($$1x -> $$1.a().c($$1x).map(jq::a).orElse(euh.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eui $$0) {
      Optional<alh<euh>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alh<euh> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((euh)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static euu.a<?> a(alh<euh> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euv(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static euu.a<?> a(euh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euv(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
