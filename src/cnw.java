import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnw extends cho implements cmg, cny {
   private static final aks<Boolean> cd = akw.a(cnw.class, aku.k);
   private static final int ce = 40;
   private static final float cf = 0.3F;
   private static final int cg = 1;
   private static final float ch = 0.6F;
   private static final int ci = 6;
   private static final float cj = 0.5F;
   public static final int bZ = 300;
   private int ck;
   private int cl;
   private boolean cm;
   protected static final ImmutableList<? extends cgi<? extends cgh<? super cnw>>> ca = ImmutableList.of(cgi.c, cgi.d, cgi.o, cgi.n);
   protected static final ImmutableList<? extends cfb<?>> cb = ImmutableList.of(
      cfb.r,
      cfb.g,
      cfb.h,
      cfb.k,
      cfb.l,
      cfb.n,
      cfb.m,
      cfb.E,
      cfb.t,
      cfb.o,
      cfb.p,
      cfb.aq,
      new cfb[]{cfb.z, cfb.as, cfb.at, cfb.ap, cfb.K, cfb.aw, cfb.ax, cfb.Z}
   );

   public cnw(bvi<? extends cnw> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.cl = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bxe.a p() {
      return cmo.gt().a(bxf.s, 40.0).a(bxf.v, 0.3F).a(bxf.p, 0.6F).a(bxf.d, 1.0).a(bxf.c, 6.0);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      if ($$1 instanceof bvx $$2) {
         this.ck = 10;
         this.dW().a(this, (byte)4);
         this.b(awv.mO);
         cnx.a(this, $$2);
         return cny.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvx $$0) {
      if (this.t()) {
         cny.a(this, $$0);
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvx $$4) {
         cnx.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwz.b<cnw> ed() {
      return bwz.a(cb, ca);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cnx.a(this.ed().a($$0));
   }

   @Override
   public bwz<cnw> ec() {
      return (bwz<cnw>)super.ec();
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cnx.a(this);
      if (this.go()) {
         this.cl++;
         if (this.cl > 300) {
            this.b(awv.mP);
            this.gq();
         }
      } else {
         this.cl = 0;
      }
   }

   @Override
   public void d_() {
      if (this.ck > 0) {
         this.ck--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bO = 3;
         this.g(bxf.c).a(0.5);
      } else {
         this.bO = 5;
         this.g(bxf.c).a(6.0);
      }
   }

   public static boolean c(bvi<cnw> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return !$$1.a_($$3.e()).a(dkf.lm);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.aj();
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      if (cnx.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dkf.oY) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      bta $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ai();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 10;
         this.b(awv.mO);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int x() {
      return this.ck;
   }

   @Override
   public boolean en() {
      return true;
   }

   @Override
   protected int e(arx $$0) {
      return this.bO;
   }

   private void gq() {
      this.a(bvi.bN, buw.a(this, true, false), $$0 -> $$0.a(new bug(bui.i, 200, 0)));
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ar);
   }

   public boolean t() {
      return !this.e_();
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.gr()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cl);
      if (this.cm) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.cl = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cd, $$0);
   }

   private boolean gr() {
      return this.au().a(cd);
   }

   public boolean go() {
      return !this.dW().G_().b() && !this.gr() && !this.gb();
   }

   private void y(boolean $$0) {
      this.cm = $$0;
   }

   public boolean gp() {
      return this.t() && !this.cm;
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      cnw $$2 = bvi.ak.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean gv() {
      return !cnx.c(this) && super.gv();
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   protected awu u() {
      return this.dW().C ? null : cnx.b(this).orElse(null);
   }

   @Override
   protected awu e(btr $$0) {
      return awv.mR;
   }

   @Override
   protected awu o_() {
      return awv.mQ;
   }

   @Override
   protected awu aV() {
      return awv.nw;
   }

   @Override
   protected awu aW() {
      return awv.nv;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.mT, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }
}
