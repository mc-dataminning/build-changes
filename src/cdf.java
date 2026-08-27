import java.util.UUID;
import javax.annotation.Nullable;

public class cdf extends ccr implements brk {
   protected static final ajk<Byte> c = ajo.a(cdf.class, ajm.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bob bZ = ayv.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cdf(bqr<? extends cdf> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byl(this, 1.0, true));
      this.bS.a(2, new byq(this, 0.9, 32.0F));
      this.bS.a(2, new bym(this, 0.6, false));
      this.bS.a(4, new byd(this, 0.6));
      this.bS.a(5, new bys(this));
      this.bS.a(7, new byj(this, ckl.class, 6.0F));
      this.bS.a(8, new byw(this));
      this.bT.a(1, new bzs(this));
      this.bT.a(2, new bzt(this));
      this.bT.a(3, new bzu<>(this, ckl.class, 10, true, false, this::a_));
      this.bT.a(3, new bzu<>(this, brg.class, 5, false, false, $$0 -> $$0 instanceof chj && !($$0 instanceof chd)));
      this.bT.a(4, new caa<>(this, false));
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 100.0).a(bsl.r, 0.25).a(bsl.n, 1.0).a(bsl.c, 15.0).a(bsl.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bql $$0) {
      if ($$0 instanceof chj && !($$0 instanceof chd) && this.ej().a(20) == 0) {
         this.h((bre)$$0);
      }

      super.D($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dN().B) {
         this.a((aqe)this.dN(), true);
      }
   }

   @Override
   public boolean bo() {
      return this.dq().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bqr<?> $$0) {
      if (this.gq() && $$0 == bqr.bx) {
         return false;
      } else {
         return $$0 == bqr.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gq());
      this.c($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dN(), $$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   private float gr() {
      return (float)this.g(bsl.c);
   }

   @Override
   public boolean C(bql $$0) {
      this.e = 10;
      this.dN().a(this, (byte)4);
      float $$1 = this.gr();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dO().b((bre)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bre $$4 ? $$4.g(bsl.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dq().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(auz.ne, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      bqj.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(auz.nf, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bqj.a u() {
      return bqj.a.a(this.ey() / this.eP());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(auz.ne, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bY = 400;
      } else if ($$0 == 34) {
         this.bY = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bY = 400;
         this.dN().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dN().a(this, (byte)34);
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.nh;
   }

   @Override
   protected auy o_() {
      return auz.ng;
   }

   @Override
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if (!$$2.a(csg.oE)) {
         return boq.d;
      } else {
         float $$3 = this.ey();
         this.c(25.0F);
         if (this.ey() == $$3) {
            return boq.d;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(auz.ni, 1.0F, $$4);
            $$2.a(1, $$0);
            return boq.a(this.dN().B);
         }
      }
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.nj, 1.0F, 1.0F);
   }

   public int gp() {
      return this.bY;
   }

   public boolean gq() {
      return (this.ao.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.ao.a(c);
      if ($$0) {
         this.ao.a(c, (byte)($$1 | 1));
      } else {
         this.ao.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bpj $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(czx $$0) {
      im $$1 = this.dn();
      im $$2 = $$1.d();
      dpy $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            im $$5 = $$1.b($$4);
            dpy $$6 = $$0.a_($$5);
            if (!daf.a($$0, $$5, $$6, $$6.u(), bqr.af)) {
               return false;
            }
         }

         return daf.a($$0, $$1, $$0.a_($$1), els.a.g(), bqr.af) && $$0.f(this);
      }
   }

   @Override
   public etf cK() {
      return new etf(0.0, (double)(0.875F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
