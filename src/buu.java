import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class buu extends bug implements bjd {
   protected static final adx<Byte> c = aea.a(buu.class, adz.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bfz bU = ask.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public buu(bik<? extends buu> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqc(this, 1.0, true));
      this.bO.a(2, new bqh(this, 0.9, 32.0F));
      this.bO.a(2, new bqd(this, 0.6, false));
      this.bO.a(4, new bpu(this, 0.6));
      this.bO.a(5, new bqj(this));
      this.bO.a(7, new bqa(this, cbl.class, 6.0F));
      this.bO.a(8, new bqn(this));
      this.bP.a(1, new brj(this));
      this.bP.a(2, new brk(this));
      this.bP.a(3, new brl<>(this, cbl.class, 10, true, false, this::a_));
      this.bP.a(3, new brl<>(this, biy.class, 5, false, false, $$0 -> $$0 instanceof byr && !($$0 instanceof byl)));
      this.bP.a(4, new brr<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 100.0).a(bkd.d, 0.25).a(bkd.c, 1.0).a(bkd.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(big $$0) {
      if ($$0 instanceof byr && !($$0 instanceof byl) && this.ee().a(20) == 0) {
         this.h((biw)$$0);
      }

      super.D($$0);
   }

   @Override
   public void b_() {
      super.b_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bT > 0) {
         this.bT--;
      }

      if (!this.dK().B) {
         this.a((aki)this.dK(), true);
      }
   }

   @Override
   public boolean bj() {
      return this.dn().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bik<?> $$0) {
      if (this.ga() && $$0 == bik.bt) {
         return false;
      } else {
         return $$0 == bik.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.ga());
      this.c($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dK(), $$0);
   }

   @Override
   public void c() {
      this.a(bU.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.bV = $$0;
   }

   @Override
   public int a() {
      return this.bV;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bW = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bW;
   }

   private float gb() {
      return (float)this.b(bkd.f);
   }

   @Override
   public boolean C(big $$0) {
      this.e = 10;
      this.dK().a(this, (byte)4);
      float $$1 = this.gb();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dL().b((biw)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof biw $$4 ? $$4.b(bkd.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.dn().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aou.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      buu.a $$2 = this.q();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.q() != $$2) {
         this.a(aou.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public buu.a q() {
      return buu.a.a(this.et() / this.eK());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aou.lM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bT = 400;
      } else if ($$0 == 34) {
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   public int t() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bT = 400;
         this.dK().a(this, (byte)11);
      } else {
         this.bT = 0;
         this.dK().a(this, (byte)34);
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.lP;
   }

   @Override
   protected aot h_() {
      return aou.lO;
   }

   @Override
   protected bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (!$$2.a(ciz.nQ)) {
         return bgo.d;
      } else {
         float $$3 = this.et();
         this.b(25.0F);
         if (this.et() == $$3) {
            return bgo.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aou.lQ, 1.0F, $$4);
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            return bgo.a(this.dK().B);
         }
      }
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.lR, 1.0F, 1.0F);
   }

   public int fZ() {
      return this.bT;
   }

   public boolean ga() {
      return (this.an.b(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(c);
      if ($$0) {
         this.an.b(c, (byte)($$1 | 1));
      } else {
         this.an.b(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bhe $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cpn $$0) {
      gv $$1 = this.dk();
      gv $$2 = $$1.d();
      dey $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gv $$5 = $$1.b($$4);
            dey $$6 = $$0.a_($$5);
            if (!cpv.a($$0, $$5, $$6, $$6.u(), bik.ac)) {
               return false;
            }
         }

         return cpv.a($$0, $$1, $$0.a_($$1), eac.a.g(), bik.ac) && $$0.f(this);
      }
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.875F * this.cH()), (double)(this.df() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<buu.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static buu.a a(float $$0) {
         for (buu.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
