import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eua extends etz {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alb.a(lv.bd), etm.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eua::new)
   );
   private final Either<alb<etm>, etm> j;

   private eua(Either<alb<etm>, etm> $$0, int $$1, int $$2, List<ews> $$3, List<euv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ety a() {
      return etv.d;
   }

   @Override
   public void a(Consumer<cvp> $$0, eth $$1) {
      ((etm)this.j.map($$1x -> $$1.a().a(lv.bd, $$1x).map(jn::a).orElse(etm.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(etn $$0) {
      Optional<alb<etm>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alb<etm> $$2 = $$1.get();
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
                  .a(lv.bd, $$1x)
                  .ifPresentOrElse($$2x -> ((etm)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static etz.a<?> a(alb<etm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eua(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static etz.a<?> a(etm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eua(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
