import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eye extends eyd {
   public static final MapCodec<eye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(alc.a(me.bn), exq.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eye::new)
   );
   private final Either<alc<exq>, exq> j;

   private eye(Either<alc<exq>, exq> $$0, int $$1, int $$2, List<fau> $$3, List<eyz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eyc a() {
      return exz.d;
   }

   @Override
   public void a(Consumer<cxy> $$0, exl $$1) {
      ((exq)this.j.map($$1x -> $$1.a().c($$1x).map(js::a).orElse(exq.a), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(exr $$0) {
      Optional<alc<exq>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alc<exq> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((exq)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static eyd.a<?> a(alc<exq> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eye(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static eyd.a<?> a(exq $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eye(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
