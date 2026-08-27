import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epe extends epd {
   public static final Codec<epe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.either(akg.a(le.aU), eoq.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, epe::new)
   );
   private final Either<akg<eoq>, eoq> j;

   private epe(Either<akg<eoq>, eoq> $$0, int $$1, int $$2, List<erq> $$3, List<epx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public epc a() {
      return eoz.d;
   }

   @Override
   public void a(Consumer<csz> $$0, eol $$1) {
      ((eoq)this.j.map($$1x -> $$1.a().a(le.aU, $$1x).map(iw::a).orElse(eoq.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eor $$0) {
      Optional<akg<eoq>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akg<eoq> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(le.aU, $$1x)
                  .ifPresentOrElse($$2x -> ((eoq)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static epd.a<?> a(akg<eoq> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epe(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static epd.a<?> a(eoq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epe(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
