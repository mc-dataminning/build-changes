import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class evb extends euy {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a(ma.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, evb::new)
   );
   private final axt<cwb> j;
   private final boolean k;

   private evb(axt<cwb> $$0, boolean $$1, int $$2, int $$3, List<exr> $$4, List<evu> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eux a() {
      return euu.f;
   }

   @Override
   public void a(Consumer<cwf> $$0, eug $$1) {
      lz.g.c(this.j).forEach($$1x -> $$0.accept(new cwf($$1x)));
   }

   private boolean a(eug $$0, Consumer<euv> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cwb> $$2 : lz.g.c(this.j)) {
            $$1.accept(new euy.c() {
               @Override
               public void a(Consumer<cwf> $$0, eug $$1) {
                  $$0.accept(new cwf($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eug $$0, Consumer<euv> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static euy.a<?> a(axt<cwb> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new evb($$0, false, $$1, $$2, $$3, $$4));
   }

   public static euy.a<?> b(axt<cwb> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new evb($$0, true, $$1, $$2, $$3, $$4));
   }
}
