import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewm extends ewj {
   public static final MapCodec<ewm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(mc.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ewm::new)
   );
   private final axf<cwl> j;
   private final boolean k;

   private ewm(axf<cwl> $$0, boolean $$1, int $$2, int $$3, List<eza> $$4, List<exf> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewi a() {
      return ewf.f;
   }

   @Override
   public void a(Consumer<cwp> $$0, evr $$1) {
      mb.g.c(this.j).forEach($$1x -> $$0.accept(new cwp($$1x)));
   }

   private boolean a(evr $$0, Consumer<ewg> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jr<cwl> $$2 : mb.g.c(this.j)) {
            $$1.accept(new ewj.c() {
               @Override
               public void a(Consumer<cwp> $$0, evr $$1) {
                  $$0.accept(new cwp($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(evr $$0, Consumer<ewg> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ewj.a<?> a(axf<cwl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewm($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ewj.a<?> b(axf<cwl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewm($$0, true, $$1, $$2, $$3, $$4));
   }
}
