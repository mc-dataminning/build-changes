import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dmq implements dup {
   public static final MapCodec<dos> a = b(dos::new);
   public static final ebx b = ebw.I;
   private static final fgm c = dne.a(6.0);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.A, $$0.C ? dyr::a : dyr::b);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axl.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
