import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ceu extends cdz implements cee, cgw {
   private static final aie<Boolean> b = aih.a(ceu.class, aig.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bmf bV = new bmf(5);

   public ceu(bnw<? extends ceu> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(2, new civ.a(this, 10.0F));
      this.bO.a(3, new bwg<>(this, 1.0, 8.0F));
      this.bO.a(8, new bwc(this, 0.6));
      this.bO.a(9, new bvn(this, chl.class, 15.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 15.0F));
      this.bP.a(1, new bwx(this, civ.class).a());
      this.bP.a(2, new bwy<>(this, chl.class, true));
      this.bP.a(3, new bwy<>(this, cgt.class, false));
      this.bP.a(3, new bwy<>(this, caj.class, true));
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.o, 0.35F).a(bpp.n, 24.0).a(bpp.c, 5.0).a(bpp.i, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, false);
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0 == cpg.vP;
   }

   public boolean gg() {
      return this.am.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cdz.a u() {
      if (this.gg()) {
         return cdz.a.f;
      } else if (this.b(cpg.vP)) {
         return cdz.a.e;
      } else {
         return this.fY() ? cdz.a.b : cdz.a.h;
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hz $$0, cvu $$1) {
      return 0.0F;
   }

   @Override
   public int fK() {
      return 1;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(awp $$0, blu $$1) {
      this.a(bnx.a, new cpd(cpg.vP));
   }

   @Override
   protected void a(awp $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cpd $$2 = this.eT();
         if ($$2.a(cpg.vP)) {
            Map<ctm, Integer> $$3 = ctn.a($$2);
            $$3.putIfAbsent(ctp.K, 1);
            ctn.a($$3, $$2);
            this.a(bnx.a, $$2);
         }
      }
   }

   @Override
   protected atk y() {
      return atl.to;
   }

   @Override
   protected atk n_() {
      return atl.tq;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.tr;
   }

   @Override
   public void a(boi $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(boi $$0, cpd $$1, cid $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bmf A() {
      return this.bV;
   }

   @Override
   protected void b(cdw $$0) {
      cpd $$1 = $$0.q();
      if ($$1.d() instanceof cmt) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cpd $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.M());
         }
      }
   }

   private boolean l(cpd $$0) {
      return this.gv() && $$0.a(cpg.uL);
   }

   @Override
   public boz a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? boz.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ciu $$2 = this.gu();
      boolean $$3 = this.af.i() <= $$2.w();
      if ($$3) {
         cpd $$4 = new cpd(cpg.vP);
         Map<ctm, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(blt.c)) {
            $$5.put(ctp.J, 2);
         } else if ($$0 > $$2.a(blt.b)) {
            $$5.put(ctp.J, 1);
         }

         $$5.put(ctp.I, 1);
         ctn.a($$5, $$4);
         this.a(bnx.a, $$4);
      }
   }

   @Override
   public atk ag_() {
      return atl.tp;
   }
}
