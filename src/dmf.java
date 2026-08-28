import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dlm {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final eaq[] b = new eaq[]{eap.n, eap.o, eap.p};
   private static final ffc c = fez.a(dma.b(2.0, 2.0, 14.0), dma.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? null : a($$2, dwz.m, dxb::a);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxb $$5) {
         $$3.a($$5);
         $$3.a(awx.aa);
      }

      return bub.a;
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lx.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
