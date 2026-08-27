import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eid extends eia {
   public static final Codec<eid> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asx.a(ke.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eid::new)
   );
   private final asx<cnb> j;
   private final boolean k;

   private eid(asx<cnb> $$0, boolean $$1, int $$2, int $$3, List<eke> $$4, List<eis> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ehz a() {
      return ehw.f;
   }

   @Override
   public void a(Consumer<cng> $$0, ehf $$1) {
      kd.h.c(this.j).forEach($$1x -> $$0.accept(new cng($$1x)));
   }

   private boolean a(ehf $$0, Consumer<ehx> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ih<cnb> $$2 : kd.h.c(this.j)) {
            $$1.accept(new eia.c() {
               @Override
               public void a(Consumer<cng> $$0, ehf $$1) {
                  $$0.accept(new cng($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ehf $$0, Consumer<ehx> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eia.a<?> a(asx<cnb> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eid($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eia.a<?> b(asx<cnb> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eid($$0, true, $$1, $$2, $$3, $$4));
   }
}
