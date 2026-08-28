import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class fac extends ezz {
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axr.a(mg.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, fac::new)
   );
   private final axr<cyz> j;
   private final boolean k;

   private fac(axr<cyz> $$0, boolean $$1, int $$2, int $$3, List<fcq> $$4, List<fav> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ezy a() {
      return ezv.f;
   }

   @Override
   public void a(Consumer<czd> $$0, ezh $$1) {
      mf.g.c(this.j).forEach($$1x -> $$0.accept(new czd($$1x)));
   }

   private boolean a(ezh $$0, Consumer<ezw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final je<cyz> $$2 : mf.g.c(this.j)) {
            $$1.accept(new ezz.c() {
               @Override
               public void a(Consumer<czd> $$0, ezh $$1) {
                  $$0.accept(new czd($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ezh $$0, Consumer<ezw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ezz.a<?> a(axr<cyz> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fac($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ezz.a<?> b(axr<cyz> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fac($$0, true, $$1, $$2, $$3, $$4));
   }
}
