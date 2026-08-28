import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eur extends euo {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axp.a(ly.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eur::new)
   );
   private final axp<cvt> j;
   private final boolean k;

   private eur(axp<cvt> $$0, boolean $$1, int $$2, int $$3, List<exh> $$4, List<evk> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eun a() {
      return euk.f;
   }

   @Override
   public void a(Consumer<cvx> $$0, etw $$1) {
      lx.g.c(this.j).forEach($$1x -> $$0.accept(new cvx($$1x)));
   }

   private boolean a(etw $$0, Consumer<eul> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jp<cvt> $$2 : lx.g.c(this.j)) {
            $$1.accept(new euo.c() {
               @Override
               public void a(Consumer<cvx> $$0, etw $$1) {
                  $$0.accept(new cvx($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(etw $$0, Consumer<eul> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static euo.a<?> a(axp<cvt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eur($$0, false, $$1, $$2, $$3, $$4));
   }

   public static euo.a<?> b(axp<cvt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eur($$0, true, $$1, $$2, $$3, $$4));
   }
}
