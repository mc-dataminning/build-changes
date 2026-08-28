import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fbc extends fbb {
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(fao.a, fao.d).fieldOf("value").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, fbc::new)
   );
   private final Either<alj<fao>, fao> j;

   private fbc(Either<alj<fao>, fao> $$0, int $$1, int $$2, List<fds> $$3, List<fbx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public fba a() {
      return fax.d;
   }

   @Override
   public void a(Consumer<daa> $$0, faj $$1) {
      ((fao)this.j.map($$1x -> $$1.a().c($$1x).map(jg::a).orElse(fao.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(fap $$0) {
      Optional<alj<fao>> $$1 = this.j.left();
      if ($$1.isPresent()) {
         alj<fao> $$2 = $$1.get();
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
                  .ifPresentOrElse($$2x -> ((fao)$$2x.a()).a($$0.a("->{" + $$1x.a() + "}", $$1x)), () -> $$0.b("Unknown loot table called " + $$1x.a()))
         )
         .ifRight($$1x -> $$1x.a($$0.a("->{inline}")));
   }

   public static fbb.a<?> a(alj<fao> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbc(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static fbb.a<?> a(fao $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbc(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
