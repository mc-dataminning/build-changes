import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbc extends faz {
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axt.a(mh.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, fbc::new)
   );
   private final axt<czu> j;
   private final boolean k;

   private fbc(axt<czu> $$0, boolean $$1, int $$2, int $$3, List<fdq> $$4, List<fbv> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public fay a() {
      return fav.f;
   }

   @Override
   public void a(Consumer<czy> $$0, fah $$1) {
      mg.g.c(this.j).forEach($$1x -> $$0.accept(new czy($$1x)));
   }

   private boolean a(fah $$0, Consumer<faw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jf<czu> $$2 : mg.g.c(this.j)) {
            $$1.accept(new faz.c() {
               @Override
               public void a(Consumer<czy> $$0, fah $$1) {
                  $$0.accept(new czy($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(fah $$0, Consumer<faw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static faz.a<?> a(axt<czu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static faz.a<?> b(axt<czu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbc($$0, true, $$1, $$2, $$3, $$4));
   }
}
