import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ezs extends ezr {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alf.a(mg.bp), eze.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezs::new)
   );
   private final Either<alf<eze>, eze> j;

   private ezs(Either<alf<eze>, eze> $$0, int $$1, int $$2, List<fci> $$3, List<fan> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezq a() {
      return ezn.d;
   }

   @Override
   public void a(Consumer<cyy> $$0, eyz $$1) {
      ((eze)this.j.map($$1x -> $$1.a().c($$1x).map(je::a).orElse(eze.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(ezf $$0) {
      Optional<alf<eze>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alf<eze> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eze)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ezr.a<?> a(alf<eze> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezs(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ezr.a<?> a(eze $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezs(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
