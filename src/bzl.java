import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzl extends byq implements byv, cbf {
   private static final aef<Boolean> b = aei.a(bzl.class, aeh.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bhf bV = new bhf(5);

   public bzl(biu<? extends bzl> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(2, new cdc.a(this, 10.0F));
      this.bO.a(3, new brc<>(this, 1.0, 8.0F));
      this.bO.a(8, new bqy(this, 0.6));
      this.bO.a(9, new bqj(this, cbu.class, 15.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 15.0F));
      this.bP.a(1, new brt(this, cdc.class).a());
      this.bP.a(2, new bru<>(this, cbu.class, true));
      this.bP.a(3, new bru<>(this, cbc.class, false));
      this.bP.a(3, new bru<>(this, bvd.class, true));
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.d, 0.35F).a(bkm.a, 24.0).a(bkm.f, 5.0).a(bkm.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjv $$0) {
      return $$0 == cji.uZ;
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
   public void b(qx $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public byq.a s() {
      if (this.gd()) {
         return byq.a.f;
      } else if (this.b(cji.uZ)) {
         return byq.a.e;
      } else {
         return this.fV() ? byq.a.b : byq.a.h;
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      return 0.0F;
   }

   @Override
   public int fH() {
      return 1;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      asc $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(asc $$0, bgw $$1) {
      this.a(biv.a, new cjf(cji.uZ));
   }

   @Override
   protected void a(asc $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cjf $$2 = this.eS();
         if ($$2.a(cji.uZ)) {
            Map<cno, Integer> $$3 = cnq.a($$2);
            $$3.putIfAbsent(cns.K, 1);
            cnq.a($$3, $$2);
            this.a(biv.a, $$2);
         }
      }
   }

   @Override
   public boolean s(biq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjg && ((bjg)$$0).eR() == bjl.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected apd w() {
      return ape.sj;
   }

   @Override
   protected apd l_() {
      return ape.sl;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.sm;
   }

   @Override
   public void a(bjg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjg $$0, cjf $$1, ccm $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bhf y() {
      return this.bV;
   }

   @Override
   protected void b(byn $$0) {
      cjf $$1 = $$0.q();
      if ($$1.d() instanceof cgv) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cjf $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.al();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cjf $$0) {
      return this.gs() && $$0.a(cji.tV);
   }

   @Override
   public bjy a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bjy.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cdb $$2 = this.gr();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cjf $$4 = new cjf(cji.uZ);
         Map<cno, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgv.c)) {
            $$5.put(cns.J, 2);
         } else if ($$0 > $$2.a(bgv.b)) {
            $$5.put(cns.J, 1);
         }

         $$5.put(cns.I, 1);
         cnq.a($$5, $$4);
         this.a(biv.a, $$4);
      }
   }

   @Override
   public apd ac_() {
      return ape.sk;
   }
}
