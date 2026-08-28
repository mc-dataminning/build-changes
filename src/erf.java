import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erf extends erc {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(lq.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, erf::new)
   );
   private final axf<cum> j;
   private final boolean k;

   private erf(axf<cum> $$0, boolean $$1, int $$2, int $$3, List<etu> $$4, List<erx> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public erb a() {
      return eqy.f;
   }

   @Override
   public void a(Consumer<cur> $$0, eqk $$1) {
      lp.h.c(this.j).forEach($$1x -> $$0.accept(new cur($$1x)));
   }

   private boolean a(eqk $$0, Consumer<eqz> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ji<cum> $$2 : lp.h.c(this.j)) {
            $$1.accept(new erc.c() {
               @Override
               public void a(Consumer<cur> $$0, eqk $$1) {
                  $$0.accept(new cur($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqk $$0, Consumer<eqz> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static erc.a<?> a(axf<cum> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erf($$0, false, $$1, $$2, $$3, $$4));
   }

   public static erc.a<?> b(axf<cum> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erf($$0, true, $$1, $$2, $$3, $$4));
   }
}
