import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class faj extends fag {
   public static final MapCodec<faj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a(mh.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, faj::new)
   );
   private final axr<czg> j;
   private final boolean k;

   private faj(axr<czg> $$0, boolean $$1, int $$2, int $$3, List<fcx> $$4, List<fbc> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public faf a() {
      return fac.f;
   }

   @Override
   public void a(Consumer<czk> $$0, ezo $$1) {
      mg.g.c(this.j).forEach($$1x -> $$0.accept(new czk($$1x)));
   }

   private boolean a(ezo $$0, Consumer<fad> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jf<czg> $$2 : mg.g.c(this.j)) {
            $$1.accept(new fag.c() {
               @Override
               public void a(Consumer<czk> $$0, ezo $$1) {
                  $$0.accept(new czk($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ezo $$0, Consumer<fad> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static fag.a<?> a(axr<czg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new faj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static fag.a<?> b(axr<czg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new faj($$0, true, $$1, $$2, $$3, $$4));
   }
}
