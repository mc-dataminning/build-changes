import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends dmq {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final ece<jc> b = ebw.R;
   public static final ebx c = ebw.y;

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1 instanceof aru $$5 && $$1.c_($$2) instanceof dxw $$6) {
         $$3.a($$6);
         $$3.a(axb.ar);
         cqp.a($$5, $$3, true);
      }

      return but.a;
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dye $$4 = $$1.c_($$2);
      if ($$4 instanceof dxw) {
         ((dxw)$$4).k();
      }
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dxw($$0, $$1);
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
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
      $$0.a(b, c);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
