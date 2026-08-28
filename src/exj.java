import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exj extends exg {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayk.a(mb.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, exj::new)
   );
   private final ayk<cxk> j;
   private final boolean k;

   private exj(ayk<cxk> $$0, boolean $$1, int $$2, int $$3, List<ezx> $$4, List<eyc> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public exf a() {
      return exc.f;
   }

   @Override
   public void a(Consumer<cxo> $$0, ewo $$1) {
      ma.g.c(this.j).forEach($$1x -> $$0.accept(new cxo($$1x)));
   }

   private boolean a(ewo $$0, Consumer<exd> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jq<cxk> $$2 : ma.g.c(this.j)) {
            $$1.accept(new exg.c() {
               @Override
               public void a(Consumer<cxo> $$0, ewo $$1) {
                  $$0.accept(new cxo($$2));
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

   public static exg.a<?> a(ayk<cxk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static exg.a<?> b(ayk<cxk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exj($$0, true, $$1, $$2, $$3, $$4));
   }
}
