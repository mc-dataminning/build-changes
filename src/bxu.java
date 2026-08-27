import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxu extends bxg implements bmc {
   protected static final afz<Byte> c = agc.a(bxu.class, agb.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final biw bU = auz.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public bxu(blj<? extends bxu> $$0, csy $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btb(this, 1.0, true));
      this.bO.a(2, new btg(this, 0.9, 32.0F));
      this.bO.a(2, new btc(this, 0.6, false));
      this.bO.a(4, new bst(this, 0.6));
      this.bO.a(5, new bti(this));
      this.bO.a(7, new bsz(this, cer.class, 6.0F));
      this.bO.a(8, new btm(this));
      this.bP.a(1, new bui(this));
      this.bP.a(2, new buj(this));
      this.bP.a(3, new buk<>(this, cer.class, 10, true, false, this::a_));
      this.bP.a(3, new buk<>(this, blx.class, 5, false, false, $$0 -> $$0 instanceof cbr && !($$0 instanceof cbl)));
      this.bP.a(4, new buq<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, (byte)0);
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 100.0).a(bnb.m, 0.25).a(bnb.i, 1.0).a(bnb.c, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(blf $$0) {
      if ($$0 instanceof cbr && !($$0 instanceof cbl) && this.eg().a(20) == 0) {
         this.h((blv)$$0);
      }

      super.D($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bT > 0) {
         this.bT--;
      }

      if (!this.dM().B) {
         this.a((amp)this.dM(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dp().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(blj<?> $$0) {
      if (this.gf() && $$0 == blj.bv) {
         return false;
      } else {
         return $$0 == blj.v ? false : super.a($$0);
      }
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gf());
      this.c($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dM(), $$0);
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
      return (float)this.b(bnb.c);
   }

   @Override
   public boolean C(blf $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gg();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((blv)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof blv $$4 ? $$4.b(bnb.i) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(arc.mA, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      bxu.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(arc.mB, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bxu.a w() {
      return bxu.a.a(this.ev() / this.eM());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(arc.mA, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bT = 400;
      } else if ($$0 == 34) {
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   public int A() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bT = 400;
         this.dM().a(this, (byte)11);
      } else {
         this.bT = 0;
         this.dM().a(this, (byte)34);
      }
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.mD;
   }

   @Override
   protected arb n_() {
      return arc.mC;
   }

   @Override
   protected bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (!$$2.a(cmk.oB)) {
         return bjl.d;
      } else {
         float $$3 = this.ev();
         this.b(25.0F);
         if (this.ev() == $$3) {
            return bjl.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(arc.mE, 1.0F, $$4);
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            return bjl.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.mF, 1.0F, 1.0F);
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
   public void a(bkd $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(ctb $$0) {
      hv $$1 = this.dm();
      hv $$2 = $$1.d();
      dip $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hv $$5 = $$1.b($$4);
            dip $$6 = $$0.a_($$5);
            if (!ctj.a($$0, $$5, $$6, $$6.u(), blj.ad)) {
               return false;
            }
         }

         return ctj.a($$0, $$1, $$0.a_($$1), eea.a.g(), blj.ad) && $$0.f(this);
      }
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bxu.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bxu.a a(float $$0) {
         for (bxu.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
