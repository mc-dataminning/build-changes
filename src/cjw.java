import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cjw extends cjd implements ciu, ckk {
   private static final ajy<Boolean> d = akc.a(cjw.class, aka.k);
   private static final int e = 40;
   private static final int ch = 1;
   private static final float ci = 0.6F;
   private static final int cj = 6;
   private static final float ck = 0.5F;
   private static final int cl = 40;
   private static final int cm = 15;
   private static final int cn = 200;
   private static final float co = 0.3F;
   private static final float cp = 0.4F;
   private int cq;
   protected static final ImmutableList<? extends ccy<? extends ccx<? super cjw>>> b = ImmutableList.of(ccy.c, ccy.d);
   protected static final ImmutableList<? extends cbr<?>> c = ImmutableList.of(cbr.g, cbr.h, cbr.k, cbr.l, cbr.n, cbr.m, cbr.E, cbr.t, cbr.o, cbr.p);

   public cjw(bsb<? extends cjw> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
   }

   @Override
   protected btp.b<cjw> ea() {
      return btp.a(c, b);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      btp<cjw> $$1 = this.ea().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cnq.a));
      $$1.b(cnq.b);
      $$1.f();
      return $$1;
   }

   private static void a(btp<cjw> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bvm(45, 90), new bvq()));
   }

   private static void b(btp<cjw> $$0) {
      $$0.a(
         cnq.b,
         10,
         ImmutableList.of(
            bws.a(cjw::gA),
            bwg.a(8.0F, bpl.a(30, 60)),
            new bwd(ImmutableList.of(Pair.of(bvy.a(0.4F), 2), Pair.of(bwn.a(0.4F, 3), 2), Pair.of(new buq(30, 60), 1)))
         )
      );
   }

   private static void c(btp<cjw> $$0) {
      $$0.a(cnq.k, 10, ImmutableList.of(bwl.a(1.0F), bxt.a(cjw::t, bvn.a(40)), bxt.a(cjw::o_, bvn.a(15)), bwv.a()), cbr.o);
   }

   private Optional<? extends bso> gA() {
      return this.dZ().c(cbr.h).orElse(cbt.a()).a(this::j);
   }

   private boolean j(bso $$0) {
      bsb<?> $$1 = $$0.ak();
      return $$1 != bsb.bx && $$1 != bsb.z && ccx.c(this, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.i_();
      }
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 40.0).a(btv.r, 0.3F).a(btv.n, 0.6F).a(btv.d, 1.0).a(btv.c, 6.0);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   public boolean C(brv $$0) {
      if (!($$0 instanceof bso)) {
         return false;
      } else {
         this.cq = 10;
         this.dU().a(this, (byte)4);
         this.b(avo.DJ);
         return ckk.a(this, (bso)$$0);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gl();
   }

   @Override
   protected void e(bso $$0) {
      if (!this.o_()) {
         ckk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dU().C) {
         return false;
      } else if ($$2 && $$0.d() instanceof bso) {
         bso $$3 = (bso)$$0.d();
         if (this.c($$3) && !bui.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(bso $$0) {
      this.bO.b(cbr.E);
      this.bO.a(cbr.o, $$0, 200L);
   }

   @Override
   public btp<cjw> dZ() {
      return (btp<cjw>)super.dZ();
   }

   protected void x() {
      cnq $$0 = this.bO.g().orElse(null);
      this.bO.a(ImmutableList.of(cnq.k, cnq.b));
      cnq $$1 = this.bO.g().orElse(null);
      if ($$1 == cnq.k && $$0 != cnq.k) {
         this.gz();
      }

      this.v(this.bO.a(cbr.o));
   }

   @Override
   protected void Y() {
      this.dU().ag().a("zoglinBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.x();
   }

   @Override
   public void a(boolean $$0) {
      this.ap().a(d, $$0);
      if (!this.dU().C && $$0) {
         this.f(btv.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.ap().a(d);
   }

   @Override
   public void m_() {
      if (this.cq > 0) {
         this.cq--;
      }

      super.m_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cq = 10;
         this.b(avo.DJ);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gy() {
      return this.cq;
   }

   @Override
   protected avn u() {
      if (this.dU().C) {
         return null;
      } else {
         return this.bO.a(cbr.o) ? avo.DI : avo.DH;
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.DL;
   }

   @Override
   protected avn n_() {
      return avo.DK;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.DM, 0.15F, 1.0F);
   }

   protected void gz() {
      this.b(avo.DI);
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
