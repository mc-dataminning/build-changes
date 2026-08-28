import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ese extends esd {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akp.a(lu.bc), erq.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ese::new)
   );
   private final Either<akp<erq>, erq> j;

   private ese(Either<akp<erq>, erq> $$0, int $$1, int $$2, List<euw> $$3, List<esz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public esc a() {
      return erz.d;
   }

   @Override
   public void a(Consumer<cuo> $$0, erl $$1) {
      ((erq)this.j.map($$1x -> $$1.a().a(lu.bc, $$1x).map(jm::a).orElse(erq.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(err $$0) {
      Optional<akp<erq>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akp<erq> $$2 = $$1.get();
         if ($$0.a($$2)) {
            $$0.b("Table " + $$2.a() + " is recursively called");
            return;
         }
      }

      super.a($$0);
      this.j
         .ifLeft(
            $$1x -> $$0.a()
                  .a(lu.bc, $$1x)
                  .ifPresentOrElse($$2x -> ((erq)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static esd.a<?> a(akp<erq> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ese(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static esd.a<?> a(erq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ese(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
