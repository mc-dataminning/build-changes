import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class evi extends evf {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axs.a(ma.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, evi::new)
   );
   private final axs<cwi> j;
   private final boolean k;

   private evi(axs<cwi> $$0, boolean $$1, int $$2, int $$3, List<exy> $$4, List<ewb> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eve a() {
      return evb.f;
   }

   @Override
   public void a(Consumer<cwm> $$0, eun $$1) {
      lz.g.c(this.j).forEach($$1x -> $$0.accept(new cwm($$1x)));
   }

   private boolean a(eun $$0, Consumer<evc> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cwi> $$2 : lz.g.c(this.j)) {
            $$1.accept(new evf.c() {
               @Override
               public void a(Consumer<cwm> $$0, eun $$1) {
                  $$0.accept(new cwm($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eun $$0, Consumer<evc> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static evf.a<?> a(axs<cwi> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new evi($$0, false, $$1, $$2, $$3, $$4));
   }

   public static evf.a<?> b(axs<cwi> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new evi($$0, true, $$1, $$2, $$3, $$4));
   }
}
