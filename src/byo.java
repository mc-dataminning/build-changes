import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class byo extends bya implements bmv {
   protected static final agn<Byte> c = agq.a(byo.class, agp.a);
   private static final int d = 25;
   private int e;
   private int bU;
   private static final bjn bV = avq.a(20, 39);
   private int bW;
   @Nullable
   private UUID bX;

   public byo(bmc<? extends byo> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new btu(this, 1.0, true));
      this.bP.a(2, new btz(this, 0.9, 32.0F));
      this.bP.a(2, new btv(this, 0.6, false));
      this.bP.a(4, new btm(this, 0.6));
      this.bP.a(5, new bub(this));
      this.bP.a(7, new bts(this, cfq.class, 6.0F));
      this.bP.a(8, new buf(this));
      this.bQ.a(1, new bvb(this));
      this.bQ.a(2, new bvc(this));
      this.bQ.a(3, new bvd<>(this, cfq.class, 10, true, false, this::a_));
      this.bQ.a(3, new bvd<>(this, bmq.class, 5, false, false, $$0 -> $$0 instanceof cco && !($$0 instanceof cci)));
      this.bQ.a(4, new bvj<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, (byte)0);
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 100.0).a(bnu.o, 0.25).a(bnu.k, 1.0).a(bnu.c, 15.0).a(bnu.r, 1.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void C(blw $$0) {
      if ($$0 instanceof cco && !($$0 instanceof cci) && this.eg().a(20) == 0) {
         this.h((bmo)$$0);
      }

      super.C($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bU > 0) {
         this.bU--;
      }

      if (!this.dL().B) {
         this.a((ane)this.dL(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.do().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bmc<?> $$0) {
      if (this.gg() && $$0 == bmc.bw) {
         return false;
      } else {
         return $$0 == bmc.w ? false : super.a($$0);
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gg());
      this.c($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dL(), $$0);
   }

   @Override
   public void c() {
      this.a(bV.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.bW = $$0;
   }

   @Override
   public int a() {
      return this.bW;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bX = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bX;
   }

   private float gh() {
      return (float)this.g(bnu.c);
   }

   @Override
   public boolean B(blw $$0) {
      this.e = 10;
      this.dL().a(this, (byte)4);
      float $$1 = this.gh();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dM().b((bmo)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bmo $$4 ? $$4.g(bnu.k) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.do().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(art.mP, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      byo.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(art.mQ, 1.0F, 1.0F);
      }

      return $$3;
   }

   public byo.a w() {
      return byo.a.a(this.ev() / this.eM());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(art.mP, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bU = 400;
      } else if ($$0 == 34) {
         this.bU = 0;
      } else {
         super.b($$0);
      }
   }

   public int A() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bU = 400;
         this.dL().a(this, (byte)11);
      } else {
         this.bU = 0;
         this.dL().a(this, (byte)34);
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.mS;
   }

   @Override
   protected ars n_() {
      return art.mR;
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (!$$2.a(cnj.oD)) {
         return bkc.d;
      } else {
         float $$3 = this.ev();
         this.b(25.0F);
         if (this.ev() == $$3) {
            return bkc.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(art.mT, 1.0F, $$4);
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            return bkc.a(this.dL().B);
         }
      }
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.mU, 1.0F, 1.0F);
   }

   public int gf() {
      return this.bU;
   }

   public boolean gg() {
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
   public void a(bkv $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cua $$0) {
      hx $$1 = this.dl();
      hx $$2 = $$1.d();
      djp $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hx $$5 = $$1.b($$4);
            djp $$6 = $$0.a_($$5);
            if (!cui.a($$0, $$5, $$6, $$6.u(), bmc.ae)) {
               return false;
            }
         }

         return cui.a($$0, $$1, $$0.a_($$1), efa.a.g(), bmc.ae) && $$0.f(this);
      }
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<byo.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static byo.a a(float $$0) {
         for (byo.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
