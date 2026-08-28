import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezi extends ezf {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axp.a(mg.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ezi::new)
   );
   private final axp<cyo> j;
   private final boolean k;

   private ezi(axp<cyo> $$0, boolean $$1, int $$2, int $$3, List<fbw> $$4, List<fab> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eze a() {
      return ezb.f;
   }

   @Override
   public void a(Consumer<cys> $$0, eyn $$1) {
      mf.g.c(this.j).forEach($$1x -> $$0.accept(new cys($$1x)));
   }

   private boolean a(eyn $$0, Consumer<ezc> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final je<cyo> $$2 : mf.g.c(this.j)) {
            $$1.accept(new ezf.c() {
               @Override
               public void a(Consumer<cys> $$0, eyn $$1) {
                  $$0.accept(new cys($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eyn $$0, Consumer<ezc> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ezf.a<?> a(axp<cyo> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezi($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ezf.a<?> b(axp<cyo> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezi($$0, true, $$1, $$2, $$3, $$4));
   }
}
