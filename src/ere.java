import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ere extends erb {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(lq.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ere::new)
   );
   private final axf<cul> j;
   private final boolean k;

   private ere(axf<cul> $$0, boolean $$1, int $$2, int $$3, List<ett> $$4, List<erw> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public era a() {
      return eqx.f;
   }

   @Override
   public void a(Consumer<cuq> $$0, eqj $$1) {
      lp.h.c(this.j).forEach($$1x -> $$0.accept(new cuq($$1x)));
   }

   private boolean a(eqj $$0, Consumer<eqy> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ji<cul> $$2 : lp.h.c(this.j)) {
            $$1.accept(new erb.c() {
               @Override
               public void a(Consumer<cuq> $$0, eqj $$1) {
                  $$0.accept(new cuq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqj $$0, Consumer<eqy> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static erb.a<?> a(axf<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ere($$0, false, $$1, $$2, $$3, $$4));
   }

   public static erb.a<?> b(axf<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ere($$0, true, $$1, $$2, $$3, $$4));
   }
}
