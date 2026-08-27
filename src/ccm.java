import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ccm extends cbr implements cbw, cem {
   private static final agj<Boolean> b = agm.a(ccm.class, agl.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bkd bV = new bkd(5);

   public ccm(blt<? extends ccm> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(2, new cgk.a(this, 10.0F));
      this.bO.a(3, new buc<>(this, 1.0, 8.0F));
      this.bO.a(8, new bty(this, 0.6));
      this.bO.a(9, new btj(this, cfb.class, 15.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 15.0F));
      this.bP.a(1, new but(this, cgk.class).a());
      this.bP.a(2, new buu<>(this, cfb.class, true));
      this.bP.a(3, new buu<>(this, cej.class, false));
      this.bP.a(3, new buu<>(this, bye.class, true));
   }

   public static bnk.a w() {
      return ccj.gk().a(bnl.m, 0.35F).a(bnl.l, 24.0).a(bnl.c, 5.0).a(bnl.g, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cnh $$0) {
      return $$0 == cmu.vM;
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
   public void b(sl $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cbr.a u() {
      if (this.ge()) {
         return cbr.a.f;
      } else if (this.b(cmu.vM)) {
         return cbr.a.e;
      } else {
         return this.fW() ? cbr.a.b : cbr.a.h;
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      this.a(blu.a, new cmr(cmu.vM));
   }

   @Override
   protected void a(aup $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cmr $$2 = this.eT();
         if ($$2.a(cmu.vM)) {
            Map<crc, Integer> $$3 = cre.a($$2);
            $$3.putIfAbsent(crg.K, 1);
            cre.a($$3, $$2);
            this.a(blu.a, $$2);
         }
      }
   }

   @Override
   public boolean s(blp $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmf && ((bmf)$$0).eS() == bmk.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arl y() {
      return arm.sY;
   }

   @Override
   protected arl n_() {
      return arm.ta;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.tb;
   }

   @Override
   public void a(bmf $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmf $$0, cmr $$1, cft $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bkd A() {
      return this.bV;
   }

   @Override
   protected void b(cbo $$0) {
      cmr $$1 = $$0.q();
      if ($$1.d() instanceof ckh) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cmr $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cmr $$0) {
      return this.gt() && $$0.a(cmu.uI);
   }

   @Override
   public bmx a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bmx.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cgj $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cmr $$4 = new cmr(cmu.vM);
         Map<crc, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bjs.c)) {
            $$5.put(crg.J, 2);
         } else if ($$0 > $$2.a(bjs.b)) {
            $$5.put(crg.J, 1);
         }

         $$5.put(crg.I, 1);
         cre.a($$5, $$4);
         this.a(blu.a, $$4);
      }
   }

   @Override
   public arl af_() {
      return arm.sZ;
   }
}
