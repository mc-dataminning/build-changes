import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cbq extends cbc implements bpv {
   protected static final aim<Byte> c = aiq.a(cbq.class, aio.a);
   private static final int d = 25;
   private int e;
   private int bX;
   private static final bmo bY = axv.a(20, 39);
   private int bZ;
   @Nullable
   private UUID ca;

   public cbq(bpd<? extends cbq> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bww(this, 1.0, true));
      this.bR.a(2, new bxb(this, 0.9, 32.0F));
      this.bR.a(2, new bwx(this, 0.6, false));
      this.bR.a(4, new bwo(this, 0.6));
      this.bR.a(5, new bxd(this));
      this.bR.a(7, new bwu(this, ciu.class, 6.0F));
      this.bR.a(8, new bxh(this));
      this.bS.a(1, new byd(this));
      this.bS.a(2, new bye(this));
      this.bS.a(3, new byf<>(this, ciu.class, 10, true, false, this::a_));
      this.bS.a(3, new byf<>(this, bpr.class, 5, false, false, $$0 -> $$0 instanceof cfs && !($$0 instanceof cfm)));
      this.bS.a(4, new byl<>(this, false));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 100.0).a(bqw.r, 0.25).a(bqw.n, 1.0).a(bqw.c, 15.0).a(bqw.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(box $$0) {
      if ($$0 instanceof cfs && !($$0 instanceof cfm) && this.ei().a(20) == 0) {
         this.h((bpp)$$0);
      }

      super.D($$0);
   }

   @Override
   public void m_() {
      super.m_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (!this.dM().B) {
         this.a((apf)this.dM(), true);
      }
   }

   @Override
   public boolean bo() {
      return this.dp().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bpd<?> $$0) {
      if (this.go() && $$0 == bpd.by) {
         return false;
      } else {
         return $$0 == bpd.y ? false : super.a($$0);
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.c($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dM(), $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public int a() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ca = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ca;
   }

   private float gp() {
      return (float)this.g(bqw.c);
   }

   @Override
   public boolean C(box $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gp();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((bpp)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bpp $$4 ? $$4.g(bqw.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aty.mX, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      cbq.a $$2 = this.s();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.s() != $$2) {
         this.a(aty.mY, 1.0F, 1.0F);
      }

      return $$3;
   }

   public cbq.a s() {
      return cbq.a.a(this.ex() / this.eO());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aty.mX, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bX = 400;
      } else if ($$0 == 34) {
         this.bX = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bX = 400;
         this.dM().a(this, (byte)11);
      } else {
         this.bX = 0;
         this.dM().a(this, (byte)34);
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.na;
   }

   @Override
   protected atx n_() {
      return aty.mZ;
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (!$$2.a(cqp.oD)) {
         return bnd.d;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return bnd.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aty.nb, 1.0F, $$4);
            $$2.a(1, $$0);
            return bnd.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.nc, 1.0F, 1.0F);
   }

   public int gn() {
      return this.bX;
   }

   public boolean go() {
      return (this.an.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.a(c);
      if ($$0) {
         this.an.a(c, (byte)($$1 | 1));
      } else {
         this.an.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bnw $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cxe $$0) {
      ib $$1 = this.dm();
      ib $$2 = $$1.d();
      dnb $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ib $$5 = $$1.b($$4);
            dnb $$6 = $$0.a_($$5);
            if (!cxm.a($$0, $$5, $$6, $$6.u(), bpd.ag)) {
               return false;
            }
         }

         return cxm.a($$0, $$1, $$0.a_($$1), eiq.a.g(), bpd.ag) && $$0.f(this);
      }
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<cbq.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static cbq.a a(float $$0) {
         for (cbq.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
