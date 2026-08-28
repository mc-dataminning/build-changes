import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esk extends esh {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awu.a(lu.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, esk::new)
   );
   private final awu<cul> j;
   private final boolean k;

   private esk(awu<cul> $$0, boolean $$1, int $$2, int $$3, List<eva> $$4, List<etd> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public esg a() {
      return esd.f;
   }

   @Override
   public void a(Consumer<cuq> $$0, erp $$1) {
      lt.g.c(this.j).forEach($$1x -> $$0.accept(new cuq($$1x)));
   }

   private boolean a(erp $$0, Consumer<ese> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jm<cul> $$2 : lt.g.c(this.j)) {
            $$1.accept(new esh.c() {
               @Override
               public void a(Consumer<cuq> $$0, erp $$1) {
                  $$0.accept(new cuq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(erp $$0, Consumer<ese> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static esh.a<?> a(awu<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esk($$0, false, $$1, $$2, $$3, $$4));
   }

   public static esh.a<?> b(awu<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esk($$0, true, $$1, $$2, $$3, $$4));
   }
}
