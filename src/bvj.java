import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvj extends buv implements bjt {
   protected static final aef<Byte> c = aei.a(bvj.class, aeh.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bgp bU = asz.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public bvj(bja<? extends bvj> $$0, cqb $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqr(this, 1.0, true));
      this.bO.a(2, new bqw(this, 0.9, 32.0F));
      this.bO.a(2, new bqs(this, 0.6, false));
      this.bO.a(4, new bqj(this, 0.6));
      this.bO.a(5, new bqy(this));
      this.bO.a(7, new bqp(this, cca.class, 6.0F));
      this.bO.a(8, new brc(this));
      this.bP.a(1, new bry(this));
      this.bP.a(2, new brz(this));
      this.bP.a(3, new bsa<>(this, cca.class, 10, true, false, this::a_));
      this.bP.a(3, new bsa<>(this, bjo.class, 5, false, false, $$0 -> $$0 instanceof bzg && !($$0 instanceof bza)));
      this.bP.a(4, new bsg<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 100.0).a(bks.m, 0.25).a(bks.i, 1.0).a(bks.c, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(biw $$0) {
      if ($$0 instanceof bzg && !($$0 instanceof bza) && this.ef().a(20) == 0) {
         this.h((bjm)$$0);
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

      if (!this.dL().B) {
         this.a((akt)this.dL(), true);
      }
   }

   @Override
   public boolean bj() {
      return this.do().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bja<?> $$0) {
      if (this.gf() && $$0 == bja.bt) {
         return false;
      } else {
         return $$0 == bja.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gf());
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dL(), $$0);
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

   private float gg() {
      return (float)this.b(bks.c);
   }

   @Override
   public boolean C(biw $$0) {
      this.e = 10;
      this.dL().a(this, (byte)4);
      float $$1 = this.gg();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dM().b((bjm)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bjm $$4 ? $$4.b(bks.i) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.do().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(apg.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      bvj.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(apg.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bvj.a t() {
      return bvj.a.a(this.eu() / this.eL());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(apg.lM, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bT = 400;
      } else if ($$0 == 34) {
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bT = 400;
         this.dL().a(this, (byte)11);
      } else {
         this.bT = 0;
         this.dL().a(this, (byte)34);
      }
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.lP;
   }

   @Override
   protected apf l_() {
      return apg.lO;
   }

   @Override
   protected bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if (!$$2.a(cjo.nQ)) {
         return bhe.d;
      } else {
         float $$3 = this.eu();
         this.b(25.0F);
         if (this.eu() == $$3) {
            return bhe.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(apg.lQ, 1.0F, $$4);
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            return bhe.a(this.dL().B);
         }
      }
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.lR, 1.0F, 1.0F);
   }

   public int ge() {
      return this.bT;
   }

   public boolean gf() {
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
   public void a(bhu $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cqe $$0) {
      gw $$1 = this.dl();
      gw $$2 = $$1.d();
      dfd $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gw $$5 = $$1.b($$4);
            dfd $$6 = $$0.a_($$5);
            if (!cqm.a($$0, $$5, $$6, $$6.u(), bja.ac)) {
               return false;
            }
         }

         return cqm.a($$0, $$1, $$0.a_($$1), eah.a.g(), bja.ac) && $$0.f(this);
      }
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.875F * this.cH()), (double)(this.df() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bvj.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bvj.a a(float $$0) {
         for (bvj.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
