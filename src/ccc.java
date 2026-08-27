import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ccc extends cbh implements cbm, cec {
   private static final afz<Boolean> b = agc.a(ccc.class, agb.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bjt bV = new bjt(5);

   public ccc(blj<? extends ccc> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(2, new cga.a(this, 10.0F));
      this.bO.a(3, new bts<>(this, 1.0, 8.0F));
      this.bO.a(8, new bto(this, 0.6));
      this.bO.a(9, new bsz(this, cer.class, 15.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 15.0F));
      this.bP.a(1, new buj(this, cga.class).a());
      this.bP.a(2, new buk<>(this, cer.class, true));
      this.bP.a(3, new buk<>(this, cdz.class, false));
      this.bP.a(3, new buk<>(this, bxu.class, true));
   }

   public static bna.a w() {
      return cbz.gk().a(bnb.m, 0.35F).a(bnb.l, 24.0).a(bnb.c, 5.0).a(bnb.g, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cmx $$0) {
      return $$0 == cmk.vM;
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
   public void b(sj $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cbh.a u() {
      if (this.ge()) {
         return cbh.a.f;
      } else if (this.b(cmk.vM)) {
         return cbh.a.e;
      } else {
         return this.fW() ? cbh.a.b : cbh.a.h;
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      this.a(blk.a, new cmh(cmk.vM));
   }

   @Override
   protected void a(auf $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cmh $$2 = this.eT();
         if ($$2.a(cmk.vM)) {
            Map<cqs, Integer> $$3 = cqu.a($$2);
            $$3.putIfAbsent(cqw.K, 1);
            cqu.a($$3, $$2);
            this.a(blk.a, $$2);
         }
      }
   }

   @Override
   public boolean s(blf $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blv && ((blv)$$0).eS() == bma.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arb y() {
      return arc.sY;
   }

   @Override
   protected arb n_() {
      return arc.ta;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.tb;
   }

   @Override
   public void a(blv $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(blv $$0, cmh $$1, cfj $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bjt A() {
      return this.bV;
   }

   @Override
   protected void b(cbe $$0) {
      cmh $$1 = $$0.q();
      if ($$1.d() instanceof cjx) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cmh $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cmh $$0) {
      return this.gt() && $$0.a(cmk.uI);
   }

   @Override
   public bmn a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bmn.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cfz $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cmh $$4 = new cmh(cmk.vM);
         Map<cqs, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bji.c)) {
            $$5.put(cqw.J, 2);
         } else if ($$0 > $$2.a(bji.b)) {
            $$5.put(cqw.J, 1);
         }

         $$5.put(cqw.I, 1);
         cqu.a($$5, $$4);
         this.a(blk.a, $$4);
      }
   }

   @Override
   public arb af_() {
      return arc.sZ;
   }
}
