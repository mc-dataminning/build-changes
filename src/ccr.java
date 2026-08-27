import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ccr extends cbw implements ccb, ces {
   private static final agm<Boolean> b = agp.a(ccr.class, ago.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bki bV = new bki(5);

   public ccr(bly<? extends ccr> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(2, new cgq.a(this, 10.0F));
      this.bO.a(3, new buh<>(this, 1.0, 8.0F));
      this.bO.a(8, new bud(this, 0.6));
      this.bO.a(9, new bto(this, cfh.class, 15.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 15.0F));
      this.bP.a(1, new buy(this, cgq.class).a());
      this.bP.a(2, new buz<>(this, cfh.class, true));
      this.bP.a(3, new buz<>(this, cep.class, false));
      this.bP.a(3, new buz<>(this, byj.class, true));
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.m, 0.35F).a(bnq.l, 24.0).a(bnq.c, 5.0).a(bnq.g, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cnn $$0) {
      return $$0 == cna.vM;
   }

   public boolean ge() {
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
   public void b(sn $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cbw.a u() {
      if (this.ge()) {
         return cbw.a.f;
      } else if (this.b(cna.vM)) {
         return cbw.a.e;
      } else {
         return this.fW() ? cbw.a.b : cbw.a.h;
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      this.a(blz.a, new cmx(cna.vM));
   }

   @Override
   protected void a(auu $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cmx $$2 = this.eT();
         if ($$2.a(cna.vM)) {
            Map<cri, Integer> $$3 = crk.a($$2);
            $$3.putIfAbsent(crm.K, 1);
            crk.a($$3, $$2);
            this.a(blz.a, $$2);
         }
      }
   }

   @Override
   public boolean s(blu $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmk && ((bmk)$$0).eS() == bmp.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arq y() {
      return arr.sY;
   }

   @Override
   protected arq n_() {
      return arr.ta;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.tb;
   }

   @Override
   public void a(bmk $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmk $$0, cmx $$1, cfz $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bki A() {
      return this.bV;
   }

   @Override
   protected void b(cbt $$0) {
      cmx $$1 = $$0.q();
      if ($$1.d() instanceof ckn) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cmx $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cmx $$0) {
      return this.gt() && $$0.a(cna.uI);
   }

   @Override
   public bnc a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bnc.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cgp $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cmx $$4 = new cmx(cna.vM);
         Map<cri, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bjx.c)) {
            $$5.put(crm.J, 2);
         } else if ($$0 > $$2.a(bjx.b)) {
            $$5.put(crm.J, 1);
         }

         $$5.put(crm.I, 1);
         crk.a($$5, $$4);
         this.a(blz.a, $$4);
      }
   }

   @Override
   public arq af_() {
      return arr.sZ;
   }
}
