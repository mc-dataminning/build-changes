import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewk extends ewh {
   public static final MapCodec<ewk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axe.a(mc.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ewk::new)
   );
   private final axe<cwj> j;
   private final boolean k;

   private ewk(axe<cwj> $$0, boolean $$1, int $$2, int $$3, List<eyy> $$4, List<exd> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewg a() {
      return ewd.f;
   }

   @Override
   public void a(Consumer<cwn> $$0, evp $$1) {
      mb.g.c(this.j).forEach($$1x -> $$0.accept(new cwn($$1x)));
   }

   private boolean a(evp $$0, Consumer<ewe> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jr<cwj> $$2 : mb.g.c(this.j)) {
            $$1.accept(new ewh.c() {
               @Override
               public void a(Consumer<cwn> $$0, evp $$1) {
                  $$0.accept(new cwn($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(evp $$0, Consumer<ewe> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ewh.a<?> a(axe<cwj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewk($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ewh.a<?> b(axe<cwj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewk($$0, true, $$1, $$2, $$3, $$4));
   }
}
