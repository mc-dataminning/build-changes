import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvl extends dne {
   public static final MapCodec<dvl> a = b(dvl::new);
   private static final xc c = xc.c("container.stonecutter");
   public static final ece<jc> b = drf.e;
   private static final fgm d = dne.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dvl> a() {
      return a;
   }

   public dvl(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axb.ay);
      }

      return but.a;
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      return new bvb(($$2x, $$3, $$4) -> new cxv($$2x, $$3, cwf.a($$1, $$2)), c);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
