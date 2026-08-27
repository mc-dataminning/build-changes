import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efv extends efs {
   public static final Codec<efv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arv.a(jz.E).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, efv::new)
   );
   private final arv<cle> j;
   private final boolean k;

   private efv(arv<cle> $$0, boolean $$1, int $$2, int $$3, List<ehw> $$4, List<egk> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public efr a() {
      return efo.f;
   }

   @Override
   public void a(Consumer<clj> $$0, eex $$1) {
      jy.i.c(this.j).forEach($$1x -> $$0.accept(new clj($$1x)));
   }

   private boolean a(eex $$0, Consumer<efp> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ib<cle> $$2 : jy.i.c(this.j)) {
            $$1.accept(new efs.c() {
               @Override
               public void a(Consumer<clj> $$0, eex $$1) {
                  $$0.accept(new clj($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eex $$0, Consumer<efp> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static efs.a<?> a(arv<cle> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efv($$0, false, $$1, $$2, $$3, $$4));
   }

   public static efs.a<?> b(arv<cle> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efv($$0, true, $$1, $$2, $$3, $$4));
   }
}
