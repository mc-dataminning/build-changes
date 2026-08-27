import java.util.UUID;
import javax.annotation.Nullable;

public class ceb extends cdn implements bsg {
   protected static final ajm<Byte> c = ajq.a(ceb.class, ajo.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final box bZ = ayy.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public ceb(brn<? extends ceb> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzh(this, 1.0, true));
      this.bS.a(2, new bzm(this, 0.9, 32.0F));
      this.bS.a(2, new bzi(this, 0.6, false));
      this.bS.a(4, new byz(this, 0.6));
      this.bS.a(5, new bzo(this));
      this.bS.a(7, new bzf(this, clh.class, 6.0F));
      this.bS.a(8, new bzs(this));
      this.bT.a(1, new cao(this));
      this.bT.a(2, new cap(this));
      this.bT.a(3, new caq<>(this, clh.class, 10, true, false, this::a_));
      this.bT.a(3, new caq<>(this, bsc.class, 5, false, false, $$0 -> $$0 instanceof cif && !($$0 instanceof chz)));
      this.bT.a(4, new caw<>(this, false));
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 100.0).a(bth.r, 0.25).a(bth.n, 1.0).a(bth.c, 15.0).a(bth.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(brh $$0) {
      if ($$0 instanceof cif && !($$0 instanceof chz) && this.ej().a(20) == 0) {
         this.h((bsa)$$0);
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
         this.a((aqh)this.dN(), true);
      }
   }

   @Override
   public boolean bo() {
      return this.dq().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(brn<?> $$0) {
      if (this.gq() && $$0 == brn.bx) {
         return false;
      } else {
         return $$0 == brn.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gq());
      this.c($$0);
   }

   @Override
   public void a(ua $$0) {
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
      return (float)this.g(bth.c);
   }

   @Override
   public boolean C(brh $$0) {
      this.e = 10;
      this.dN().a(this, (byte)4);
      float $$1 = this.gr();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dO().b((bsa)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bsa $$4 ? $$4.g(bth.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dq().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(avc.ne, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      brf.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avc.nf, 1.0F, 1.0F);
      }

      return $$3;
   }

   public brf.a u() {
      return brf.a.a(this.ey() / this.eP());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avc.ne, 1.0F, 1.0F);
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
   protected avb d(bqf $$0) {
      return avc.nh;
   }

   @Override
   protected avb o_() {
      return avc.ng;
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (!$$2.a(ctc.oE)) {
         return bpm.d;
      } else {
         float $$3 = this.ey();
         this.c(25.0F);
         if (this.ey() == $$3) {
            return bpm.d;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avc.ni, 1.0F, $$4);
            $$2.a(1, $$0);
            return bpm.a(this.dN().B);
         }
      }
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.nj, 1.0F, 1.0F);
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
   public void a(bqf $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dag $$0) {
      in $$1 = this.dn();
      in $$2 = $$1.d();
      dqh $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            in $$5 = $$1.b($$4);
            dqh $$6 = $$0.a_($$5);
            if (!dao.a($$0, $$5, $$6, $$6.u(), brn.af)) {
               return false;
            }
         }

         return dao.a($$0, $$1, $$0.a_($$1), emb.a.g(), brn.af) && $$0.f(this);
      }
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.875F * this.cJ()), (double)(this.dh() * 0.4F));
   }
}
