import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwf extends bvk implements bvp, bxz {
   private static final aby<Boolean> b = acb.a(bwf.class, aca.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bee bV = new bee(5);

   public bwf(bfn<? extends bwf> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(0, new bmp(this));
      this.bO.a(2, new bzw.a(this, 10.0F));
      this.bO.a(3, new bnw<>(this, 1.0, 8.0F));
      this.bO.a(8, new bns(this, 0.6));
      this.bO.a(9, new bnd(this, byo.class, 15.0F, 1.0F));
      this.bO.a(10, new bnd(this, bgb.class, 15.0F));
      this.bP.a(1, new bon(this, bzw.class).a());
      this.bP.a(2, new boo<>(this, byo.class, true));
      this.bP.a(3, new boo<>(this, bxw.class, false));
      this.bP.a(3, new boo<>(this, brx.class, true));
   }

   public static bhf.a r() {
      return bwc.ge().a(bhg.d, 0.35F).a(bhg.a, 24.0).a(bhg.f, 5.0).a(bhg.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(b, false);
   }

   @Override
   public boolean a(cgp $$0) {
      return $$0 == cgc.uZ;
   }

   public boolean fY() {
      return this.am.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public bvk.a q() {
      if (this.fY()) {
         return bvk.a.f;
      } else if (this.b(cgc.uZ)) {
         return bvk.a.e;
      } else {
         return this.fS() ? bvk.a.b : bvk.a.h;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return 0.0F;
   }

   @Override
   public int fE() {
      return 1;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      this.a(bfo.a, new cfz(cgc.uZ));
   }

   @Override
   protected void a(apf $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cfz $$2 = this.eO();
         if ($$2.a(cgc.uZ)) {
            Map<ckg, Integer> $$3 = cki.a($$2);
            $$3.putIfAbsent(ckk.K, 1);
            cki.a($$3, $$2);
            this.a(bfo.a, $$2);
         }
      }
   }

   @Override
   public boolean p(bfj $$0) {
      if (super.p($$0)) {
         return true;
      } else {
         return $$0 instanceof bfz && ((bfz)$$0).eN() == bge.d ? this.cd() == null && $$0.cd() == null : false;
      }
   }

   @Override
   protected amg s() {
      return amh.sj;
   }

   @Override
   protected amg g_() {
      return amh.sl;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.sm;
   }

   @Override
   public void a(bfz $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bfz $$0, cfz $$1, bzg $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bee w() {
      return this.bV;
   }

   @Override
   protected void b(bvh $$0) {
      cfz $$1 = $$0.j();
      if ($$1.d() instanceof cdp) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cfz $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ai();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cfz $$0) {
      return this.gn() && $$0.a(cgc.tV);
   }

   @Override
   public bgs a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bgs.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      bzv $$2 = this.gm();
      boolean $$3 = this.af.i() <= $$2.w();
      if ($$3) {
         cfz $$4 = new cfz(cgc.uZ);
         Map<ckg, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bdu.c)) {
            $$5.put(ckk.J, 2);
         } else if ($$0 > $$2.a(bdu.b)) {
            $$5.put(ckk.J, 1);
         }

         $$5.put(ckk.I, 1);
         cki.a($$5, $$4);
         this.a(bfo.a, $$4);
      }
   }

   @Override
   public amg Y_() {
      return amh.sk;
   }
}
