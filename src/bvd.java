import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvd extends bup implements bjn {
   protected static final aef<Byte> c = aei.a(bvd.class, aeh.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bgj bU = asu.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public bvd(biu<? extends bvd> $$0, cpv $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bql(this, 1.0, true));
      this.bO.a(2, new bqq(this, 0.9, 32.0F));
      this.bO.a(2, new bqm(this, 0.6, false));
      this.bO.a(4, new bqd(this, 0.6));
      this.bO.a(5, new bqs(this));
      this.bO.a(7, new bqj(this, cbu.class, 6.0F));
      this.bO.a(8, new bqw(this));
      this.bP.a(1, new brs(this));
      this.bP.a(2, new brt(this));
      this.bP.a(3, new bru<>(this, cbu.class, 10, true, false, this::a_));
      this.bP.a(3, new bru<>(this, bji.class, 5, false, false, $$0 -> $$0 instanceof bza && !($$0 instanceof byu)));
      this.bP.a(4, new bsa<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 100.0).a(bkm.d, 0.25).a(bkm.c, 1.0).a(bkm.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(biq $$0) {
      if ($$0 instanceof bza && !($$0 instanceof byu) && this.ef().a(20) == 0) {
         this.h((bjg)$$0);
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
         this.a((akr)this.dL(), true);
      }
   }

   @Override
   public boolean bk() {
      return this.do().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(biu<?> $$0) {
      if (this.ge() && $$0 == biu.bt) {
         return false;
      } else {
         return $$0 == biu.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.ge());
      this.c($$0);
   }

   @Override
   public void a(qx $$0) {
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

   private float gf() {
      return (float)this.b(bkm.f);
   }

   @Override
   public boolean C(biq $$0) {
      this.e = 10;
      this.dL().a(this, (byte)4);
      float $$1 = this.gf();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dM().b((bjg)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bjg $$4 ? $$4.b(bkm.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.do().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(ape.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      bvd.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(ape.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bvd.a t() {
      return bvd.a.a(this.eu() / this.eL());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(ape.lM, 1.0F, 1.0F);
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
   protected apd d(bho $$0) {
      return ape.lP;
   }

   @Override
   protected apd l_() {
      return ape.lO;
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (!$$2.a(cji.nQ)) {
         return bgy.d;
      } else {
         float $$3 = this.eu();
         this.b(25.0F);
         if (this.eu() == $$3) {
            return bgy.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(ape.lQ, 1.0F, $$4);
            if (!$$0.fS().d) {
               $$2.h(1);
            }

            return bgy.a(this.dL().B);
         }
      }
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.lR, 1.0F, 1.0F);
   }

   public int gd() {
      return this.bT;
   }

   public boolean ge() {
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
   public void a(bho $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cpy $$0) {
      gw $$1 = this.dl();
      gw $$2 = $$1.d();
      dfj $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gw $$5 = $$1.b($$4);
            dfj $$6 = $$0.a_($$5);
            if (!cqg.a($$0, $$5, $$6, $$6.u(), biu.ac)) {
               return false;
            }
         }

         return cqg.a($$0, $$1, $$0.a_($$1), ean.a.g(), biu.ac) && $$0.f(this);
      }
   }

   @Override
   public ehn cJ() {
      return new ehn(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bvd.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bvd.a a(float $$0) {
         for (bvd.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
