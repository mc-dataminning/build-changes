import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ewk extends ewj {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(akt.a(mc.bg), evw.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewk::new)
   );
   private final Either<akt<evw>, evw> j;

   private ewk(Either<akt<evw>, evw> $$0, int $$1, int $$2, List<eza> $$3, List<exf> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewi a() {
      return ewf.d;
   }

   @Override
   public void a(Consumer<cwp> $$0, evr $$1) {
      ((evw)this.j.map($$1x -> $$1.a().c($$1x).map(jr::a).orElse(evw.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(evx $$0) {
      Optional<akt<evw>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         akt<evw> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((evw)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ewj.a<?> a(akt<evw> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewk(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ewj.a<?> a(evw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewk(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
