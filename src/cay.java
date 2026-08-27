import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cay extends cak implements bpd {
   protected static final aii<Byte> c = ail.a(cay.class, aik.a);
   private static final int d = 25;
   private int e;
   private int bV;
   private static final blw bW = axl.a(20, 39);
   private int bX;
   @Nullable
   private UUID bY;

   public cay(bol<? extends cay> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bwe(this, 1.0, true));
      this.bP.a(2, new bwj(this, 0.9, 32.0F));
      this.bP.a(2, new bwf(this, 0.6, false));
      this.bP.a(4, new bvw(this, 0.6));
      this.bP.a(5, new bwl(this));
      this.bP.a(7, new bwc(this, cia.class, 6.0F));
      this.bP.a(8, new bwp(this));
      this.bQ.a(1, new bxl(this));
      this.bQ.a(2, new bxm(this));
      this.bQ.a(3, new bxn<>(this, cia.class, 10, true, false, this::a_));
      this.bQ.a(3, new bxn<>(this, boz.class, 5, false, false, $$0 -> $$0 instanceof cey && !($$0 instanceof ces)));
      this.bQ.a(4, new bxt<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, (byte)0);
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 100.0).a(bqe.o, 0.25).a(bqe.k, 1.0).a(bqe.c, 15.0).a(bqe.r, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void C(bof $$0) {
      if ($$0 instanceof cey && !($$0 instanceof ces) && this.ef().a(20) == 0) {
         this.h((box)$$0);
      }

      super.C($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bV > 0) {
         this.bV--;
      }

      if (!this.dJ().B) {
         this.a((apa)this.dJ(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dm().i() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bol<?> $$0) {
      if (this.gm() && $$0 == bol.bw) {
         return false;
      } else {
         return $$0 == bol.w ? false : super.a($$0);
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gm());
      this.c($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dJ(), $$0);
   }

   @Override
   public void c() {
      this.a(bW.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.bX = $$0;
   }

   @Override
   public int a() {
      return this.bX;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bY = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bY;
   }

   private float gn() {
      return (float)this.g(bqe.c);
   }

   @Override
   public boolean B(bof $$0) {
      this.e = 10;
      this.dJ().a(this, (byte)4);
      float $$1 = this.gn();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dK().b((box)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof box $$4 ? $$4.g(bqe.k) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dm().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(atp.mQ, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      cay.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(atp.mR, 1.0F, 1.0F);
      }

      return $$3;
   }

   public cay.a w() {
      return cay.a.a(this.eu() / this.eL());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(atp.mQ, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bV = 400;
      } else if ($$0 == 34) {
         this.bV = 0;
      } else {
         super.b($$0);
      }
   }

   public int A() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bV = 400;
         this.dJ().a(this, (byte)11);
      } else {
         this.bV = 0;
         this.dJ().a(this, (byte)34);
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.mT;
   }

   @Override
   protected ato n_() {
      return atp.mS;
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (!$$2.a(cpt.oD)) {
         return bml.d;
      } else {
         float $$3 = this.eu();
         this.c(25.0F);
         if (this.eu() == $$3) {
            return bml.d;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(atp.mU, 1.0F, $$4);
            if (!$$0.fW().d) {
               $$2.h(1);
            }

            return bml.a(this.dJ().B);
         }
      }
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.mV, 1.0F, 1.0F);
   }

   public int gl() {
      return this.bV;
   }

   public boolean gm() {
      return (this.am.b(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.b(c);
      if ($$0) {
         this.am.b(c, (byte)($$1 | 1));
      } else {
         this.am.b(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bne $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cwh $$0) {
      ib $$1 = this.dj();
      ib $$2 = $$1.d();
      dme $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            ib $$5 = $$1.b($$4);
            dme $$6 = $$0.a_($$5);
            if (!cwp.a($$0, $$5, $$6, $$6.u(), bol.ae)) {
               return false;
            }
         }

         return cwp.a($$0, $$1, $$0.a_($$1), ehs.a.g(), bol.ae) && $$0.f(this);
      }
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.875F * this.cF()), (double)(this.dd() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<cay.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static cay.a a(float $$0) {
         for (cay.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
