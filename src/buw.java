import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class buw extends bui implements bjf {
   protected static final adz<Byte> c = aec.a(buw.class, aeb.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bgb bU = asm.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public buw(bim<? extends buw> $$0, cpm $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqe(this, 1.0, true));
      this.bO.a(2, new bqj(this, 0.9, 32.0F));
      this.bO.a(2, new bqf(this, 0.6, false));
      this.bO.a(4, new bpw(this, 0.6));
      this.bO.a(5, new bql(this));
      this.bO.a(7, new bqc(this, cbn.class, 6.0F));
      this.bO.a(8, new bqp(this));
      this.bP.a(1, new brl(this));
      this.bP.a(2, new brm(this));
      this.bP.a(3, new brn<>(this, cbn.class, 10, true, false, this::a_));
      this.bP.a(3, new brn<>(this, bja.class, 5, false, false, $$0 -> $$0 instanceof byt && !($$0 instanceof byn)));
      this.bP.a(4, new brt<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bke.a p() {
      return bja.x().a(bkf.a, 100.0).a(bkf.d, 0.25).a(bkf.c, 1.0).a(bkf.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bii $$0) {
      if ($$0 instanceof byt && !($$0 instanceof byn) && this.ee().a(20) == 0) {
         this.h((biy)$$0);
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
         this.a((akk)this.dK(), true);
      }
   }

   @Override
   public boolean bj() {
      return this.dn().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bim<?> $$0) {
      if (this.ga() && $$0 == bim.bt) {
         return false;
      } else {
         return $$0 == bim.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.ga());
      this.c($$0);
   }

   @Override
   public void a(qr $$0) {
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
      return (float)this.b(bkf.f);
   }

   @Override
   public boolean C(bii $$0) {
      this.e = 10;
      this.dK().a(this, (byte)4);
      float $$1 = this.gb();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dL().b((biy)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof biy $$4 ? $$4.b(bkf.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.dn().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aow.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      buw.a $$2 = this.q();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.q() != $$2) {
         this.a(aow.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public buw.a q() {
      return buw.a.a(this.et() / this.eK());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aow.lM, 1.0F, 1.0F);
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
   protected aov d(bhg $$0) {
      return aow.lP;
   }

   @Override
   protected aov h_() {
      return aow.lO;
   }

   @Override
   protected bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if (!$$2.a(cjb.nQ)) {
         return bgq.d;
      } else {
         float $$3 = this.et();
         this.b(25.0F);
         if (this.et() == $$3) {
            return bgq.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aow.lQ, 1.0F, $$4);
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            return bgq.a(this.dK().B);
         }
      }
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.lR, 1.0F, 1.0F);
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
   public void a(bhg $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cpp $$0) {
      gu $$1 = this.dk();
      gu $$2 = $$1.d();
      dfa $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gu $$5 = $$1.b($$4);
            dfa $$6 = $$0.a_($$5);
            if (!cpx.a($$0, $$5, $$6, $$6.u(), bim.ac)) {
               return false;
            }
         }

         return cpx.a($$0, $$1, $$0.a_($$1), eae.a.g(), bim.ac) && $$0.f(this);
      }
   }

   @Override
   public ehe cI() {
      return new ehe(0.0, (double)(0.875F * this.cH()), (double)(this.df() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<buw.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static buw.a a(float $$0) {
         for (buw.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
