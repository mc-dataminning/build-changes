import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fbe extends fbb {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axv.a(mi.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, fbe::new)
   );
   private final axv<czw> j;
   private final boolean k;

   private fbe(axv<czw> $$0, boolean $$1, int $$2, int $$3, List<fds> $$4, List<fbx> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public fba a() {
      return fax.f;
   }

   @Override
   public void a(Consumer<daa> $$0, faj $$1) {
      mh.g.c(this.j).forEach($$1x -> $$0.accept(new daa($$1x)));
   }

   private boolean a(faj $$0, Consumer<fay> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jg<czw> $$2 : mh.g.c(this.j)) {
            $$1.accept(new fbb.c() {
               @Override
               public void a(Consumer<daa> $$0, faj $$1) {
                  $$0.accept(new daa($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(faj $$0, Consumer<fay> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static fbb.a<?> a(axv<czw> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbe($$0, false, $$1, $$2, $$3, $$4));
   }

   public static fbb.a<?> b(axv<czw> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fbe($$0, true, $$1, $$2, $$3, $$4));
   }
}
