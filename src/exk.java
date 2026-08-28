import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exk extends exh {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayk.a(mb.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, exk::new)
   );
   private final ayk<cxl> j;
   private final boolean k;

   private exk(ayk<cxl> $$0, boolean $$1, int $$2, int $$3, List<ezy> $$4, List<eyd> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public exg a() {
      return exd.f;
   }

   @Override
   public void a(Consumer<cxp> $$0, ewp $$1) {
      ma.g.c(this.j).forEach($$1x -> $$0.accept(new cxp($$1x)));
   }

   private boolean a(ewp $$0, Consumer<exe> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cxl> $$2 : ma.g.c(this.j)) {
            $$1.accept(new exh.c() {
               @Override
               public void a(Consumer<cxp> $$0, ewp $$1) {
                  $$0.accept(new cxp($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ewp $$0, Consumer<exe> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static exh.a<?> a(ayk<cxl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exk($$0, false, $$1, $$2, $$3, $$4));
   }

   public static exh.a<?> b(ayk<cxl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exk($$0, true, $$1, $$2, $$3, $$4));
   }
}
