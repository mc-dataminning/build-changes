import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exb extends exa {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alo.a(mb.bg), ewn.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exb::new)
   );
   private final Either<alo<ewn>, ewn> j;

   private exb(Either<alo<ewn>, ewn> $$0, int $$1, int $$2, List<ezr> $$3, List<exw> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewz a() {
      return eww.d;
   }

   @Override
   public void a(Consumer<cxg> $$0, ewi $$1) {
      ((ewn)this.j.map($$1x -> $$1.a().c($$1x).map(jq::a).orElse(ewn.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ewo $$0) {
      Optional<alo<ewn>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alo<ewn> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((ewn)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static exa.a<?> a(alo<ewn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exb(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static exa.a<?> a(ewn $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exb(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
