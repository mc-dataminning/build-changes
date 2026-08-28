import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eux extends euu {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axq.a(lz.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eux::new)
   );
   private final axq<cvx> j;
   private final boolean k;

   private eux(axq<cvx> $$0, boolean $$1, int $$2, int $$3, List<exn> $$4, List<evq> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eut a() {
      return euq.f;
   }

   @Override
   public void a(Consumer<cwb> $$0, euc $$1) {
      ly.g.c(this.j).forEach($$1x -> $$0.accept(new cwb($$1x)));
   }

   private boolean a(euc $$0, Consumer<eur> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cvx> $$2 : ly.g.c(this.j)) {
            $$1.accept(new euu.c() {
               @Override
               public void a(Consumer<cwb> $$0, euc $$1) {
                  $$0.accept(new cwb($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(euc $$0, Consumer<eur> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static euu.a<?> a(axq<cvx> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eux($$0, false, $$1, $$2, $$3, $$4));
   }

   public static euu.a<?> b(axq<cvx> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eux($$0, true, $$1, $$2, $$3, $$4));
   }
}
