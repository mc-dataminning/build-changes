import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dxk extends dxc {
   @Override
   public dxd d() {
      return dxf.b;
   }

   @Override
   public dxd e() {
      return dxf.c;
   }

   @Override
   public cfu a() {
      return cgc.pL;
   }

   @Override
   public void a(cmm $$0, gu $$1, dxe $$2, apf $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, amh.zK, ami.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(iv.af, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public it h() {
      return iv.m;
   }

   @Override
   protected boolean a(cmm $$0) {
      return $$0.X().b(cmi.Q);
   }

   @Override
   protected void a(cmn $$0, gu $$1, dcb $$2) {
      czn $$3 = $$2.t() ? $$0.c_($$1) : null;
      cpn.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cmp $$0) {
      return 4;
   }

   @Override
   public dcb b(dxe $$0) {
      return cpo.G.n().a(cua.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(dxd $$0) {
      return $$0 == dxf.c || $$0 == dxf.b;
   }

   @Override
   public int c(cmp $$0) {
      return 1;
   }

   @Override
   public int a(cmp $$0) {
      return 5;
   }

   @Override
   public boolean a(dxe $$0, cls $$1, gu $$2, dxd $$3, ha $$4) {
      return $$4 == ha.a && !$$3.a(anb.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<amg> j() {
      return Optional.of(amh.cB);
   }

   public static class a extends dxk {
      @Override
      protected void a(dcc.a<dxd, dxe> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(dxe $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(dxe $$0) {
         return false;
      }
   }

   public static class b extends dxk {
      @Override
      public int d(dxe $$0) {
         return 8;
      }

      @Override
      public boolean c(dxe $$0) {
         return true;
      }
   }
}
