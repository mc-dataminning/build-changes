import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eka extends ejx {
   public static final Codec<eka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aup.a(kg.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eka::new)
   );
   private final aup<coy> j;
   private final boolean k;

   private eka(aup<coy> $$0, boolean $$1, int $$2, int $$3, List<emb> $$4, List<ekp> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ejw a() {
      return ejt.f;
   }

   @Override
   public void a(Consumer<cpd> $$0, ejc $$1) {
      kf.h.c(this.j).forEach($$1x -> $$0.accept(new cpd($$1x)));
   }

   private boolean a(ejc $$0, Consumer<eju> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ij<coy> $$2 : kf.h.c(this.j)) {
            $$1.accept(new ejx.c() {
               @Override
               public void a(Consumer<cpd> $$0, ejc $$1) {
                  $$0.accept(new cpd($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ejc $$0, Consumer<eju> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ejx.a<?> a(aup<coy> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eka($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ejx.a<?> b(aup<coy> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eka($$0, true, $$1, $$2, $$3, $$4));
   }
}
