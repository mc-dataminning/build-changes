import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmw extends dmd {
   public static final MapCodec<dmw> a = b(dmw::new);
   public static final ebk[] b = new ebk[]{ebj.n, ebj.o, ebj.p};
   private static final ffw c = fft.a(dmr.b(2.0, 2.0, 14.0), dmr.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dxv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? null : a($$2, dxt.m, dxv::a);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxv $$5) {
         $$3.a($$5);
         $$3.a(awx.aa);
      }

      return bug.a;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
