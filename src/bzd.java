import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzd extends byi implements byn, cax {
   private static final adz<Boolean> b = aec.a(bzd.class, aeb.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bgx bV = new bgx(5);

   public bzd(bim<? extends bzd> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(2, new ccu.a(this, 10.0F));
      this.bO.a(3, new bqu<>(this, 1.0, 8.0F));
      this.bO.a(8, new bqq(this, 0.6));
      this.bO.a(9, new bqb(this, cbm.class, 15.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 15.0F));
      this.bP.a(1, new brl(this, ccu.class).a());
      this.bP.a(2, new brm<>(this, cbm.class, true));
      this.bP.a(3, new brm<>(this, cau.class, false));
      this.bP.a(3, new brm<>(this, buv.class, true));
   }

   public static bkd.a q() {
      return bza.gg().a(bke.d, 0.35F).a(bke.a, 24.0).a(bke.f, 5.0).a(bke.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjn $$0) {
      return $$0 == cja.uZ;
   }

   public boolean ga() {
      return this.an.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public byi.a p() {
      if (this.ga()) {
         return byi.a.f;
      } else if (this.b(cja.uZ)) {
         return byi.a.e;
      } else {
         return this.fS() ? byi.a.b : byi.a.h;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gu $$0, cpo $$1) {
      return 0.0F;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new cix(cja.uZ));
   }

   @Override
   protected void a(aru $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cix $$2 = this.eR();
         if ($$2.a(cja.uZ)) {
            Map<cne, Integer> $$3 = cng.a($$2);
            $$3.putIfAbsent(cni.K, 1);
            cng.a($$3, $$2);
            this.a(bin.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bii $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aov r() {
      return aow.sj;
   }

   @Override
   protected aov h_() {
      return aow.sl;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.sm;
   }

   @Override
   public void a(biy $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(biy $$0, cix $$1, cce $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bgx t() {
      return this.bV;
   }

   @Override
   protected void b(byf $$0) {
      cix $$1 = $$0.j();
      if ($$1.d() instanceof cgn) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cix $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cix $$0) {
      return this.gp() && $$0.a(cja.tV);
   }

   @Override
   public bjq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bjq.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cct $$2 = this.go();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cix $$4 = new cix(cja.uZ);
         Map<cne, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgn.c)) {
            $$5.put(cni.J, 2);
         } else if ($$0 > $$2.a(bgn.b)) {
            $$5.put(cni.J, 1);
         }

         $$5.put(cni.I, 1);
         cng.a($$5, $$4);
         this.a(bin.a, $$4);
      }
   }

   @Override
   public aov X_() {
      return aow.sk;
   }
}
