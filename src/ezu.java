import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezu extends ezr {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a(mg.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ezu::new)
   );
   private final axr<cyu> j;
   private final boolean k;

   private ezu(axr<cyu> $$0, boolean $$1, int $$2, int $$3, List<fci> $$4, List<fan> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ezq a() {
      return ezn.f;
   }

   @Override
   public void a(Consumer<cyy> $$0, eyz $$1) {
      mf.g.c(this.j).forEach($$1x -> $$0.accept(new cyy($$1x)));
   }

   private boolean a(eyz $$0, Consumer<ezo> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final je<cyu> $$2 : mf.g.c(this.j)) {
            $$1.accept(new ezr.c() {
               @Override
               public void a(Consumer<cyy> $$0, eyz $$1) {
                  $$0.accept(new cyy($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eyz $$0, Consumer<ezo> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ezr.a<?> a(axr<cyu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezu($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ezr.a<?> b(axr<cyu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezu($$0, true, $$1, $$2, $$3, $$4));
   }
}
