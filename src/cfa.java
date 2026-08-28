import java.util.UUID;
import javax.annotation.Nullable;

public class cfa extends cem implements bte {
   protected static final ajp<Byte> c = ajt.a(cfa.class, ajr.a);
   private static final int d = 25;
   private int e;
   private int ca;
   private static final bpo cb = aze.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cfa(bsj<? extends cfa> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cag(this, 1.0, true));
      this.bU.a(2, new cal(this, 0.9, 32.0F));
      this.bU.a(2, new cah(this, 0.6, false));
      this.bU.a(4, new bzy(this, 0.6));
      this.bU.a(5, new can(this));
      this.bU.a(7, new cae(this, cmh.class, 6.0F));
      this.bU.a(8, new car(this));
      this.bV.a(1, new cbn(this));
      this.bV.a(2, new cbo(this));
      this.bV.a(3, new cbp<>(this, cmh.class, 10, true, false, this::a_));
      this.bV.a(3, new cbp<>(this, bta.class, 5, false, false, $$0 -> $$0 instanceof cjf && !($$0 instanceof ciz)));
      this.bV.a(4, new cbv<>(this, false));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 100.0).a(bug.v, 0.25).a(bug.p, 1.0).a(bug.c, 15.0).a(bug.B, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void E(bsd $$0) {
      if ($$0 instanceof cjf && !($$0 instanceof ciz) && this.dS().a(20) == 0) {
         this.h((bsy)$$0);
      }

      super.E($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.ca > 0) {
         this.ca--;
      }

      if (!this.dP().B) {
         this.a((aqk)this.dP(), true);
      }
   }

   @Override
   public boolean bq() {
      return this.ds().i() > 2.5000003E-7F && this.ah.a(5) == 0;
   }

   @Override
   public boolean a(bsj<?> $$0) {
      if (this.go() && $$0 == bsj.by) {
         return false;
      } else {
         return $$0 == bsj.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dP(), $$0);
   }

   @Override
   public void c() {
      this.a(cb.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   private float gp() {
      return (float)this.g(bug.c);
   }

   @Override
   public boolean D(bsd $$0) {
      this.e = 10;
      this.dP().a(this, (byte)4);
      float $$1 = this.gp();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ah.a((int)$$1) : $$1;
      bqw $$3 = this.dQ().b((bsy)this);
      boolean $$4 = $$0.a($$3, $$2);
      if ($$4) {
         double $$6 = $$0 instanceof bsy $$5 ? $$5.g(bug.p) : 0.0;
         double $$7 = Math.max(0.0, 1.0 - $$6);
         $$0.h($$0.ds().b(0.0, 0.4F * $$7, 0.0));
         if (this.dP() instanceof aqk $$8) {
            czl.a($$8, $$0, $$3);
         }
      }

      this.a(avf.no, 1.0F, 1.0F);
      return $$4;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      bsb.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(avf.np, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bsb.a u() {
      return bsb.a.a(this.ew() / this.eN());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(avf.no, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.ca = 400;
      } else if ($$0 == 34) {
         this.ca = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.ca = 400;
         this.dP().a(this, (byte)11);
      } else {
         this.ca = 0;
         this.dP().a(this, (byte)34);
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.nr;
   }

   @Override
   protected ave o_() {
      return avf.nq;
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if (!$$2.a(cud.oE)) {
         return bqd.e;
      } else {
         float $$3 = this.ew();
         this.c(25.0F);
         if (this.ew() == $$3) {
            return bqd.e;
         } else {
            float $$4 = 1.0F + (this.ah.i() - this.ah.i()) * 0.2F;
            this.a(avf.ns, 1.0F, $$4);
            $$2.a(1, $$0);
            return bqd.a(this.dP().B);
         }
      }
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.nt, 1.0F, 1.0F);
   }

   public int gn() {
      return this.ca;
   }

   public boolean go() {
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
   public void a(bqw $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(dcg $$0) {
      ja $$1 = this.dp();
      ja $$2 = $$1.d();
      dsh $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ja $$5 = $$1.b($$4);
            dsh $$6 = $$0.a_($$5);
            if (!dco.a($$0, $$5, $$6, $$6.u(), bsj.af)) {
               return false;
            }
         }

         return dco.a($$0, $$1, $$0.a_($$1), eoc.a.g(), bsj.af) && $$0.f(this);
      }
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.875F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
