import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exd extends exa {
   public static final MapCodec<exd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aya.a(mb.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, exd::new)
   );
   private final aya<cxc> j;
   private final boolean k;

   private exd(aya<cxc> $$0, boolean $$1, int $$2, int $$3, List<ezr> $$4, List<exw> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewz a() {
      return eww.f;
   }

   @Override
   public void a(Consumer<cxg> $$0, ewi $$1) {
      ma.g.c(this.j).forEach($$1x -> $$0.accept(new cxg($$1x)));
   }

   private boolean a(ewi $$0, Consumer<ewx> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cxc> $$2 : ma.g.c(this.j)) {
            $$1.accept(new exa.c() {
               @Override
               public void a(Consumer<cxg> $$0, ewi $$1) {
                  $$0.accept(new cxg($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ewi $$0, Consumer<ewx> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static exa.a<?> a(aya<cxc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exd($$0, false, $$1, $$2, $$3, $$4));
   }

   public static exa.a<?> b(aya<cxc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exd($$0, true, $$1, $$2, $$3, $$4));
   }
}
