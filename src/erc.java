import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erc extends eqz {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axe.a(lq.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, erc::new)
   );
   private final axe<cuj> j;
   private final boolean k;

   private erc(axe<cuj> $$0, boolean $$1, int $$2, int $$3, List<etr> $$4, List<eru> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eqy a() {
      return eqv.f;
   }

   @Override
   public void a(Consumer<cuo> $$0, eqh $$1) {
      lp.h.c(this.j).forEach($$1x -> $$0.accept(new cuo($$1x)));
   }

   private boolean a(eqh $$0, Consumer<eqw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ji<cuj> $$2 : lp.h.c(this.j)) {
            $$1.accept(new eqz.c() {
               @Override
               public void a(Consumer<cuo> $$0, eqh $$1) {
                  $$0.accept(new cuo($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqh $$0, Consumer<eqw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eqz.a<?> a(axe<cuj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eqz.a<?> b(axe<cuj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erc($$0, true, $$1, $$2, $$3, $$4));
   }
}
