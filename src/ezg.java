import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ezg extends ezf {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(ald.a(mg.bo), eys.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezg::new)
   );
   private final Either<ald<eys>, eys> j;

   private ezg(Either<ald<eys>, eys> $$0, int $$1, int $$2, List<fbw> $$3, List<fab> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eze a() {
      return ezb.d;
   }

   @Override
   public void a(Consumer<cys> $$0, eyn $$1) {
      ((eys)this.j.map($$1x -> $$1.a().c($$1x).map(je::a).orElse(eys.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eyt $$0) {
      Optional<ald<eys>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         ald<eys> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eys)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static ezf.a<?> a(ald<eys> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezg(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static ezf.a<?> a(eys $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezg(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
