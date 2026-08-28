import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class euz extends euy {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alk.a(ma.bd), eul.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, euz::new)
   );
   private final Either<alk<eul>, eul> j;

   private euz(Either<alk<eul>, eul> $$0, int $$1, int $$2, List<exr> $$3, List<evu> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eux a() {
      return euu.d;
   }

   @Override
   public void a(Consumer<cwf> $$0, eug $$1) {
      ((eul)this.j.map($$1x -> $$1.a().c($$1x).map(jq::a).orElse(eul.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(eum $$0) {
      Optional<alk<eul>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alk<eul> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((eul)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static euy.a<?> a(alk<eul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euz(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static euy.a<?> a(eul $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euz(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
