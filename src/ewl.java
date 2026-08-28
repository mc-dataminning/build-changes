import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ewl extends ewk {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(aku.a(mc.bg), evx.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewl::new)
   );
   private final Either<aku<evx>, evx> j;

   private ewl(Either<aku<evx>, evx> $$0, int $$1, int $$2, List<ezb> $$3, List<exg> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewj a() {
      return ewg.d;
   }

   @Override
   public void a(Consumer<cwq> $$0, evs $$1) {
      ((evx)this.j.map($$1x -> $$1.a().c($$1x).map(jr::a).orElse(evx.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(evy $$0) {
      Optional<aku<evx>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         aku<evx> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((evx)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ewk.a<?> a(aku<evx> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewl(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ewk.a<?> a(evx $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewl(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
