import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class esm extends esj {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awu.a(lu.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, esm::new)
   );
   private final awu<cul> j;
   private final boolean k;

   private esm(awu<cul> $$0, boolean $$1, int $$2, int $$3, List<evc> $$4, List<etf> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public esi a() {
      return esf.f;
   }

   @Override
   public void a(Consumer<cuq> $$0, err $$1) {
      lt.g.c(this.j).forEach($$1x -> $$0.accept(new cuq($$1x)));
   }

   private boolean a(err $$0, Consumer<esg> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jm<cul> $$2 : lt.g.c(this.j)) {
            $$1.accept(new esj.c() {
               @Override
               public void a(Consumer<cuq> $$0, err $$1) {
                  $$0.accept(new cuq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(err $$0, Consumer<esg> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static esj.a<?> a(awu<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esm($$0, false, $$1, $$2, $$3, $$4));
   }

   public static esj.a<?> b(awu<cul> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new esm($$0, true, $$1, $$2, $$3, $$4));
   }
}
