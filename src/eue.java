import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eue extends eud {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ald.a(lw.be), etq.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eue::new)
   );
   private final Either<ald<etq>, etq> j;

   private eue(Either<ald<etq>, etq> $$0, int $$1, int $$2, List<eww> $$3, List<euz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public euc a() {
      return etz.d;
   }

   @Override
   public void a(Consumer<cvs> $$0, etl $$1) {
      ((etq)this.j.map($$1x -> $$1.a().c($$1x).map(jo::a).orElse(etq.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(etr $$0) {
      Optional<ald<etq>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ald<etq> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((etq)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eud.a<?> a(ald<etq> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eue(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eud.a<?> a(etq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eue(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
