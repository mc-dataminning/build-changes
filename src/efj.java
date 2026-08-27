import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class efj extends efg {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arr.a(jz.E).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, efj::new)
   );
   private final arr<ckw> j;
   private final boolean k;

   private efj(arr<ckw> $$0, boolean $$1, int $$2, int $$3, List<ehk> $$4, List<efy> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eff a() {
      return efc.f;
   }

   @Override
   public void a(Consumer<clb> $$0, eel $$1) {
      jy.i.c(this.j).forEach($$1x -> $$0.accept(new clb($$1x)));
   }

   private boolean a(eel $$0, Consumer<efd> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ib<ckw> $$2 : jy.i.c(this.j)) {
            $$1.accept(new efg.c() {
               @Override
               public void a(Consumer<clb> $$0, eel $$1) {
                  $$0.accept(new clb($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eel $$0, Consumer<efd> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static efg.a<?> a(arr<ckw> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static efg.a<?> b(arr<ckw> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new efj($$0, true, $$1, $$2, $$3, $$4));
   }
}
