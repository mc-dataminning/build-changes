import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exj extends exg {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axf.a(mc.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, exj::new)
   );
   private final axf<cxd> j;
   private final boolean k;

   private exj(axf<cxd> $$0, boolean $$1, int $$2, int $$3, List<ezx> $$4, List<eyc> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public exf a() {
      return exc.f;
   }

   @Override
   public void a(Consumer<cxh> $$0, ewo $$1) {
      mb.g.c(this.j).forEach($$1x -> $$0.accept(new cxh($$1x)));
   }

   private boolean a(ewo $$0, Consumer<exd> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jr<cxd> $$2 : mb.g.c(this.j)) {
            $$1.accept(new exg.c() {
               @Override
               public void a(Consumer<cxh> $$0, ewo $$1) {
                  $$0.accept(new cxh($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ewo $$0, Consumer<exd> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static exg.a<?> a(axf<cxd> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static exg.a<?> b(axf<cxd> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exj($$0, true, $$1, $$2, $$3, $$4));
   }
}
