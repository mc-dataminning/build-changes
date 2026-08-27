import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class buy extends buk implements bji {
   protected static final aec<Byte> c = aef.a(buy.class, aee.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bge bU = asp.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public buy(bip<? extends buy> $$0, cpq $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqg(this, 1.0, true));
      this.bO.a(2, new bql(this, 0.9, 32.0F));
      this.bO.a(2, new bqh(this, 0.6, false));
      this.bO.a(4, new bpy(this, 0.6));
      this.bO.a(5, new bqn(this));
      this.bO.a(7, new bqe(this, cbp.class, 6.0F));
      this.bO.a(8, new bqr(this));
      this.bP.a(1, new brn(this));
      this.bP.a(2, new bro(this));
      this.bP.a(3, new brp<>(this, cbp.class, 10, true, false, this::a_));
      this.bP.a(3, new brp<>(this, bjd.class, 5, false, false, $$0 -> $$0 instanceof byv && !($$0 instanceof byp)));
      this.bP.a(4, new brv<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 100.0).a(bkh.d, 0.25).a(bkh.c, 1.0).a(bkh.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bil $$0) {
      if ($$0 instanceof byv && !($$0 instanceof byp) && this.ee().a(20) == 0) {
         this.h((bjb)$$0);
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
         this.a((akn)this.dK(), true);
      }
   }

   @Override
   public boolean bj() {
      return this.dn().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bip<?> $$0) {
      if (this.gb() && $$0 == bip.bt) {
         return false;
      } else {
         return $$0 == bip.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gb());
      this.c($$0);
   }

   @Override
   public void a(qu $$0) {
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

   private float gc() {
      return (float)this.b(bkh.f);
   }

   @Override
   public boolean C(bil $$0) {
      this.e = 10;
      this.dK().a(this, (byte)4);
      float $$1 = this.gc();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dL().b((bjb)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bjb $$4 ? $$4.b(bkh.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.dn().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aoz.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      buy.a $$2 = this.q();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.q() != $$2) {
         this.a(aoz.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public buy.a q() {
      return buy.a.a(this.et() / this.eK());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aoz.lM, 1.0F, 1.0F);
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
   protected aoy d(bhj $$0) {
      return aoz.lP;
   }

   @Override
   protected aoy h_() {
      return aoz.lO;
   }

   @Override
   protected bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (!$$2.a(cjd.nQ)) {
         return bgt.d;
      } else {
         float $$3 = this.et();
         this.b(25.0F);
         if (this.et() == $$3) {
            return bgt.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aoz.lQ, 1.0F, $$4);
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            return bgt.a(this.dK().B);
         }
      }
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.lR, 1.0F, 1.0F);
   }

   public int ga() {
      return this.bT;
   }

   public boolean gb() {
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
   public void a(bhj $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cpt $$0) {
      gw $$1 = this.dk();
      gw $$2 = $$1.d();
      dfe $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gw $$5 = $$1.b($$4);
            dfe $$6 = $$0.a_($$5);
            if (!cqb.a($$0, $$5, $$6, $$6.u(), bip.ac)) {
               return false;
            }
         }

         return cqb.a($$0, $$1, $$0.a_($$1), eai.a.g(), bip.ac) && $$0.f(this);
      }
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.875F * this.cH()), (double)(this.df() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<buy.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static buy.a a(float $$0) {
         for (buy.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
