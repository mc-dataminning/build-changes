import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bze extends byj implements byo, cay {
   private static final adz<Boolean> b = aec.a(bze.class, aeb.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bgx bV = new bgx(5);

   public bze(bim<? extends bze> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpo(this));
      this.bO.a(2, new ccv.a(this, 10.0F));
      this.bO.a(3, new bqv<>(this, 1.0, 8.0F));
      this.bO.a(8, new bqr(this, 0.6));
      this.bO.a(9, new bqc(this, cbn.class, 15.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 15.0F));
      this.bP.a(1, new brm(this, ccv.class).a());
      this.bP.a(2, new brn<>(this, cbn.class, true));
      this.bP.a(3, new brn<>(this, cav.class, false));
      this.bP.a(3, new brn<>(this, buw.class, true));
   }

   public static bke.a q() {
      return bzb.gf().a(bkf.d, 0.35F).a(bkf.a, 24.0).a(bkf.f, 5.0).a(bkf.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjo $$0) {
      return $$0 == cjb.uZ;
   }

   public boolean fZ() {
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
   public byj.a p() {
      if (this.fZ()) {
         return byj.a.f;
      } else if (this.b(cjb.uZ)) {
         return byj.a.e;
      } else {
         return this.fS() ? byj.a.b : byj.a.h;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      return 0.0F;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new ciy(cjb.uZ));
   }

   @Override
   protected void a(aru $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         ciy $$2 = this.eR();
         if ($$2.a(cjb.uZ)) {
            Map<cnf, Integer> $$3 = cnh.a($$2);
            $$3.putIfAbsent(cnj.K, 1);
            cnh.a($$3, $$2);
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
   public void a(biy $$0, ciy $$1, ccf $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bgx t() {
      return this.bV;
   }

   @Override
   protected void b(byg $$0) {
      ciy $$1 = $$0.j();
      if ($$1.d() instanceof cgo) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         ciy $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(ciy $$0) {
      return this.go() && $$0.a(cjb.tV);
   }

   @Override
   public bjr a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bjr.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ccu $$2 = this.gn();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         ciy $$4 = new ciy(cjb.uZ);
         Map<cnf, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgn.c)) {
            $$5.put(cnj.J, 2);
         } else if ($$0 > $$2.a(bgn.b)) {
            $$5.put(cnj.J, 1);
         }

         $$5.put(cnj.I, 1);
         cnh.a($$5, $$4);
         this.a(bin.a, $$4);
      }
   }

   @Override
   public aov Y_() {
      return aow.sk;
   }
}
