import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewl extends ewi {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(mc.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ewl::new)
   );
   private final axf<cwk> j;
   private final boolean k;

   private ewl(axf<cwk> $$0, boolean $$1, int $$2, int $$3, List<eyz> $$4, List<exe> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewh a() {
      return ewe.f;
   }

   @Override
   public void a(Consumer<cwo> $$0, evq $$1) {
      mb.g.c(this.j).forEach($$1x -> $$0.accept(new cwo($$1x)));
   }

   private boolean a(evq $$0, Consumer<ewf> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jr<cwk> $$2 : mb.g.c(this.j)) {
            $$1.accept(new ewi.c() {
               @Override
               public void a(Consumer<cwo> $$0, evq $$1) {
                  $$0.accept(new cwo($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(evq $$0, Consumer<ewf> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ewi.a<?> a(axf<cwk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewl($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ewi.a<?> b(axf<cwk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewl($$0, true, $$1, $$2, $$3, $$4));
   }
}
