import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzn extends bys implements byx, cbh {
   private static final aeg<Boolean> b = aej.a(bzn.class, aei.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bhh bV = new bhh(5);

   public bzn(biw<? extends bzn> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(2, new cde.a(this, 10.0F));
      this.bO.a(3, new bre<>(this, 1.0, 8.0F));
      this.bO.a(8, new bra(this, 0.6));
      this.bO.a(9, new bql(this, cbw.class, 15.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 15.0F));
      this.bP.a(1, new brv(this, cde.class).a());
      this.bP.a(2, new brw<>(this, cbw.class, true));
      this.bP.a(3, new brw<>(this, cbe.class, false));
      this.bP.a(3, new brw<>(this, bvf.class, true));
   }

   public static bkn.a t() {
      return bzk.gj().a(bko.d, 0.35F).a(bko.a, 24.0).a(bko.f, 5.0).a(bko.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjx $$0) {
      return $$0 == cjk.uZ;
   }

   public boolean gd() {
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
   public void b(qy $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public bys.a s() {
      if (this.gd()) {
         return bys.a.f;
      } else if (this.b(cjk.uZ)) {
         return bys.a.e;
      } else {
         return this.fV() ? bys.a.b : bys.a.h;
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return 0.0F;
   }

   @Override
   public int fH() {
      return 1;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      this.a(bix.a, new cjh(cjk.uZ));
   }

   @Override
   protected void a(ase $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cjh $$2 = this.eS();
         if ($$2.a(cjk.uZ)) {
            Map<cnq, Integer> $$3 = cns.a($$2);
            $$3.putIfAbsent(cnu.K, 1);
            cns.a($$3, $$2);
            this.a(bix.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bis $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bji && ((bji)$$0).eR() == bjn.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected ape w() {
      return apf.sj;
   }

   @Override
   protected ape l_() {
      return apf.sl;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.sm;
   }

   @Override
   public void a(bji $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bji $$0, cjh $$1, cco $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bhh y() {
      return this.bV;
   }

   @Override
   protected void b(byp $$0) {
      cjh $$1 = $$0.q();
      if ($$1.d() instanceof cgx) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cjh $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cjh $$0) {
      return this.gs() && $$0.a(cjk.tV);
   }

   @Override
   public bka a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bka.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cdd $$2 = this.gr();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cjh $$4 = new cjh(cjk.uZ);
         Map<cnq, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgx.c)) {
            $$5.put(cnu.J, 2);
         } else if ($$0 > $$2.a(bgx.b)) {
            $$5.put(cnu.J, 1);
         }

         $$5.put(cnu.I, 1);
         cns.a($$5, $$4);
         this.a(bix.a, $$4);
      }
   }

   @Override
   public ape ac_() {
      return apf.sk;
   }
}
