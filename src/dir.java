import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends dix {
   public static final MapCodec<dir> a = b(dir::new);
   public static final dxt<jn> b = dxm.S;
   public static final dxn c = dxm.z;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1 instanceof ard $$5 && $$1.c_($$2) instanceof dtr $$6) {
         $$3.a($$6);
         $$3.a(awk.ar);
         cnl.a($$5, $$3, true);
      }

      return bsj.a;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      dty $$4 = $$1.c_($$2);
      if ($$4 instanceof dtr) {
         ((dtr)$$4).k();
      }
   }

   @Nullable
   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtr($$0, $$1);
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return csb.a($$1.c_($$2));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
