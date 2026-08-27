import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eow extends eov {
   public static final Codec<eow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.either(akf.a, eoi.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eow::new)
   );
   private final Either<akf, eoi> j;

   private eow(Either<akf, eoi> $$0, int $$1, int $$2, List<erh> $$3, List<epp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eou a() {
      return eor.d;
   }

   @Override
   public void a(Consumer<csd> $$0, eoa $$1) {
      ((eoi)this.j.map($$1x -> $$1.a().getLootTable($$1x), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eoj $$0) {
      Optional<akf> $$1 = this.j.left();
      if ($$1.isPresent()) {
         eoc<eoi> $$2 = new eoc<>(eof.c, $$1.get());
         if ($$0.a($$2)) {
            $$0.b("Table " + $$1.get() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j.ifLeft($$1x -> {
         eoc<eoi> $$2x = new eoc<>(eof.c, $$1x);
         $$0.a().getElementOptional($$2x).ifPresentOrElse($$3 -> $$3.a($$0.a("->{" + $$1x + "}", $$2x)), () -> $$0.b("Unknown loot table called " + $$1x));
      }).ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eov.a<?> a(akf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eow(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eov.a<?> a(eoi $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eow(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
