import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exc extends ewz {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayk.a(mb.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, exc::new)
   );
   private final ayk<cxg> j;
   private final boolean k;

   private exc(ayk<cxg> $$0, boolean $$1, int $$2, int $$3, List<ezs> $$4, List<exv> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ewy a() {
      return ewv.f;
   }

   @Override
   public void a(Consumer<cxk> $$0, ewh $$1) {
      ma.g.c(this.j).forEach($$1x -> $$0.accept(new cxk($$1x)));
   }

   private boolean a(ewh $$0, Consumer<eww> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cxg> $$2 : ma.g.c(this.j)) {
            $$1.accept(new ewz.c() {
               @Override
               public void a(Consumer<cxk> $$0, ewh $$1) {
                  $$0.accept(new cxk($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ewh $$0, Consumer<eww> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ewz.a<?> a(ayk<cxg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ewz.a<?> b(ayk<cxg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exc($$0, true, $$1, $$2, $$3, $$4));
   }
}
