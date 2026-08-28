import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fao extends fal {
   public static final MapCodec<fao> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a(mh.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, fao::new)
   );
   private final axr<czj> j;
   private final boolean k;

   private fao(axr<czj> $$0, boolean $$1, int $$2, int $$3, List<fdc> $$4, List<fbh> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public fak a() {
      return fah.f;
   }

   @Override
   public void a(Consumer<czn> $$0, ezt $$1) {
      mg.g.c(this.j).forEach($$1x -> $$0.accept(new czn($$1x)));
   }

   private boolean a(ezt $$0, Consumer<fai> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jf<czj> $$2 : mg.g.c(this.j)) {
            $$1.accept(new fal.c() {
               @Override
               public void a(Consumer<czn> $$0, ezt $$1) {
                  $$0.accept(new czn($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ezt $$0, Consumer<fai> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static fal.a<?> a(axr<czj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fao($$0, false, $$1, $$2, $$3, $$4));
   }

   public static fal.a<?> b(axr<czj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fao($$0, true, $$1, $$2, $$3, $$4));
   }
}
