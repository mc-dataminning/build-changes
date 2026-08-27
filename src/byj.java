import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class byj extends bxv implements bmr {
   protected static final agm<Byte> c = agp.a(byj.class, ago.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bjl bU = avo.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public byj(bly<? extends byj> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btq(this, 1.0, true));
      this.bO.a(2, new btv(this, 0.9, 32.0F));
      this.bO.a(2, new btr(this, 0.6, false));
      this.bO.a(4, new bti(this, 0.6));
      this.bO.a(5, new btx(this));
      this.bO.a(7, new bto(this, cfh.class, 6.0F));
      this.bO.a(8, new bub(this));
      this.bP.a(1, new bux(this));
      this.bP.a(2, new buy(this));
      this.bP.a(3, new buz<>(this, cfh.class, 10, true, false, this::a_));
      this.bP.a(3, new buz<>(this, bmm.class, 5, false, false, $$0 -> $$0 instanceof ccg && !($$0 instanceof cca)));
      this.bP.a(4, new bvf<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, (byte)0);
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 100.0).a(bnq.m, 0.25).a(bnq.i, 1.0).a(bnq.c, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(blu $$0) {
      if ($$0 instanceof ccg && !($$0 instanceof cca) && this.eg().a(20) == 0) {
         this.h((bmk)$$0);
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
         this.a((and)this.dM(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dp().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bly<?> $$0) {
      if (this.gf() && $$0 == bly.bv) {
         return false;
      } else {
         return $$0 == bly.v ? false : super.a($$0);
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gf());
      this.c($$0);
   }

   @Override
   public void a(sn $$0) {
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
      return (float)this.b(bnq.c);
   }

   @Override
   public boolean C(blu $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gg();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((bmk)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bmk $$4 ? $$4.b(bnq.i) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(arr.mA, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      byj.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(arr.mB, 1.0F, 1.0F);
      }

      return $$3;
   }

   public byj.a w() {
      return byj.a.a(this.ev() / this.eM());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(arr.mA, 1.0F, 1.0F);
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
   protected arq d(bks $$0) {
      return arr.mD;
   }

   @Override
   protected arq n_() {
      return arr.mC;
   }

   @Override
   protected bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (!$$2.a(cna.oB)) {
         return bka.d;
      } else {
         float $$3 = this.ev();
         this.b(25.0F);
         if (this.ev() == $$3) {
            return bka.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(arr.mE, 1.0F, $$4);
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            return bka.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.mF, 1.0F, 1.0F);
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
   public void a(bks $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(ctr $$0) {
      hx $$1 = this.dm();
      hx $$2 = $$1.d();
      djg $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hx $$5 = $$1.b($$4);
            djg $$6 = $$0.a_($$5);
            if (!ctz.a($$0, $$5, $$6, $$6.u(), bly.ad)) {
               return false;
            }
         }

         return ctz.a($$0, $$1, $$0.a_($$1), eer.a.g(), bly.ad) && $$0.f(this);
      }
   }

   @Override
   public els cJ() {
      return new els(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<byj.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static byj.a a(float $$0) {
         for (byj.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
