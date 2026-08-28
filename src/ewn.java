import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewn extends ewk {
   public static final MapCodec<ewn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(mc.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ewn::new)
   );
   private final axf<cwm> j;
   private final boolean k;

   private ewn(axf<cwm> $$0, boolean $$1, int $$2, int $$3, List<ezb> $$4, List<exg> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewj a() {
      return ewg.f;
   }

   @Override
   public void a(Consumer<cwq> $$0, evs $$1) {
      mb.g.c(this.j).forEach($$1x -> $$0.accept(new cwq($$1x)));
   }

   private boolean a(evs $$0, Consumer<ewh> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jr<cwm> $$2 : mb.g.c(this.j)) {
            $$1.accept(new ewk.c() {
               @Override
               public void a(Consumer<cwq> $$0, evs $$1) {
                  $$0.accept(new cwq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(evs $$0, Consumer<ewh> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ewk.a<?> a(axf<cwm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewn($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ewk.a<?> b(axf<cwm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewn($$0, true, $$1, $$2, $$3, $$4));
   }
}
