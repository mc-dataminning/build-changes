import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbo extends fbl {
   public static final MapCodec<fbo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayc.a(mi.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, fbo::new)
   );
   private final ayc<dag> j;
   private final boolean k;

   private fbo(ayc<dag> $$0, boolean $$1, int $$2, int $$3, List<fec> $$4, List<fch> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public fbk a() {
      return fbh.f;
   }

   @Override
   public void a(Consumer<dak> $$0, fat $$1) {
      mh.g.c(this.j).forEach($$1x -> $$0.accept(new dak($$1x)));
   }

   private boolean a(fat $$0, Consumer<fbi> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jg<dag> $$2 : mh.g.c(this.j)) {
            $$1.accept(new fbl.c() {
               @Override
               public void a(Consumer<dak> $$0, fat $$1) {
                  $$0.accept(new dak($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(fat $$0, Consumer<fbi> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static fbl.a<?> a(ayc<dag> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbo($$0, false, $$1, $$2, $$3, $$4));
   }

   public static fbl.a<?> b(ayc<dag> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbo($$0, true, $$1, $$2, $$3, $$4));
   }
}
