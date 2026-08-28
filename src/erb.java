import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erb extends eqy {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axe.a(lq.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, erb::new)
   );
   private final axe<cui> j;
   private final boolean k;

   private erb(axe<cui> $$0, boolean $$1, int $$2, int $$3, List<etq> $$4, List<ert> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eqx a() {
      return equ.f;
   }

   @Override
   public void a(Consumer<cun> $$0, eqg $$1) {
      lp.h.c(this.j).forEach($$1x -> $$0.accept(new cun($$1x)));
   }

   private boolean a(eqg $$0, Consumer<eqv> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ji<cui> $$2 : lp.h.c(this.j)) {
            $$1.accept(new eqy.c() {
               @Override
               public void a(Consumer<cun> $$0, eqg $$1) {
                  $$0.accept(new cun($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqg $$0, Consumer<eqv> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eqy.a<?> a(axe<cui> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erb($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eqy.a<?> b(axe<cui> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erb($$0, true, $$1, $$2, $$3, $$4));
   }
}
