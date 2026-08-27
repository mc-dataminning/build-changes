import java.util.UUID;
import javax.annotation.Nullable;

public class ceq extends cec implements bsu {
   protected static final ajr<Byte> c = ajv.a(ceq.class, ajt.a);
   private static final int d = 25;
   private int e;
   private int bY;
   private static final bpf bZ = azc.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public ceq(bsa<? extends ceq> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzw(this, 1.0, true));
      this.bS.a(2, new cab(this, 0.9, 32.0F));
      this.bS.a(2, new bzx(this, 0.6, false));
      this.bS.a(4, new bzo(this, 0.6));
      this.bS.a(5, new cad(this));
      this.bS.a(7, new bzu(this, clw.class, 6.0F));
      this.bS.a(8, new cah(this));
      this.bT.a(1, new cbd(this));
      this.bT.a(2, new cbe(this));
      this.bT.a(3, new cbf<>(this, clw.class, 10, true, false, this::a_));
      this.bT.a(3, new cbf<>(this, bsq.class, 5, false, false, $$0 -> $$0 instanceof ciu && !($$0 instanceof cio)));
      this.bT.a(4, new cbl<>(this, false));
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 100.0).a(btw.r, 0.25).a(btw.n, 1.0).a(btw.c, 15.0).a(btw.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bru $$0) {
      if ($$0 instanceof ciu && !($$0 instanceof cio) && this.el().a(20) == 0) {
         this.h((bso)$$0);
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

      if (!this.dP().B) {
         this.a((aqm)this.dP(), true);
      }
   }

   @Override
   public boolean bq() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsa<?> $$0) {
      if (this.gq() && $$0 == bsa.by) {
         return false;
      } else {
         return $$0 == bsa.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gq());
      this.c($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dP(), $$0);
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
      return (float)this.g(btw.c);
   }

   @Override
   public boolean C(bru $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gr();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dQ().b((bso)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bso $$4 ? $$4.g(btw.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.ds().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(avh.no, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      brs.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avh.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public brs.a u() {
      return brs.a.a(this.eA() / this.eR());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avh.no, 1.0F, 1.0F);
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
         this.dP().a(this, (byte)11);
      } else {
         this.bY = 0;
         this.dP().a(this, (byte)34);
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.nr;
   }

   @Override
   protected avg o_() {
      return avh.nq;
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if (!$$2.a(ctr.oE)) {
         return bpu.d;
      } else {
         float $$3 = this.eA();
         this.c(25.0F);
         if (this.eA() == $$3) {
            return bpu.d;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avh.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bpu.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.nt, 1.0F, 1.0F);
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
   public void a(bqn $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dba $$0) {
      io $$1 = this.dp();
      io $$2 = $$1.d();
      drb $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            io $$5 = $$1.b($$4);
            drb $$6 = $$0.a_($$5);
            if (!dbi.a($$0, $$5, $$6, $$6.u(), bsa.af)) {
               return false;
            }
         }

         return dbi.a($$0, $$1, $$0.a_($$1), emv.a.g(), bsa.af) && $$0.f(this);
      }
   }

   @Override
   public euk cM() {
      return new euk(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
