import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exi extends exh {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(aly.a(mb.bg), ewu.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exi::new)
   );
   private final Either<aly<ewu>, ewu> j;

   private exi(Either<aly<ewu>, ewu> $$0, int $$1, int $$2, List<ezy> $$3, List<eyd> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public exg a() {
      return exd.d;
   }

   @Override
   public void a(Consumer<cxp> $$0, ewp $$1) {
      ((ewu)this.j.map($$1x -> $$1.a().c($$1x).map(jq::a).orElse(ewu.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ewv $$0) {
      Optional<aly<ewu>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         aly<ewu> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ewu)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static exh.a<?> a(aly<ewu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exi(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static exh.a<?> a(ewu $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exi(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
