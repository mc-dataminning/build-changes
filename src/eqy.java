import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqy extends eqv {
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axb.a(lq.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eqy::new)
   );
   private final axb<cuf> j;
   private final boolean k;

   private eqy(axb<cuf> $$0, boolean $$1, int $$2, int $$3, List<etn> $$4, List<erq> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public equ a() {
      return eqr.f;
   }

   @Override
   public void a(Consumer<cuk> $$0, eqd $$1) {
      lp.h.c(this.j).forEach($$1x -> $$0.accept(new cuk($$1x)));
   }

   private boolean a(eqd $$0, Consumer<eqs> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ji<cuf> $$2 : lp.h.c(this.j)) {
            $$1.accept(new eqv.c() {
               @Override
               public void a(Consumer<cuk> $$0, eqd $$1) {
                  $$0.accept(new cuk($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqd $$0, Consumer<eqs> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eqv.a<?> a(axb<cuf> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqy($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eqv.a<?> b(axb<cuf> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqy($$0, true, $$1, $$2, $$3, $$4));
   }
}
