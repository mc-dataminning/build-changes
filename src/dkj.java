import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkj extends djq {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dyh[] b = new dyh[]{dyg.n, dyg.o, dyg.p};
   private static final fcr c = fco.a(dke.b(2.0, 2.0, 14.0), dke.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new duv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? null : a($$2, duu.m, duv::a);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duv $$5) {
         $$3.a($$5);
         $$3.a(awk.aa);
      }

      return bsy.a;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lt.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
