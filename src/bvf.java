import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvf extends bur implements bjp {
   protected static final aeg<Byte> c = aej.a(bvf.class, aei.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bgl bU = asw.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public bvf(biw<? extends bvf> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqn(this, 1.0, true));
      this.bO.a(2, new bqs(this, 0.9, 32.0F));
      this.bO.a(2, new bqo(this, 0.6, false));
      this.bO.a(4, new bqf(this, 0.6));
      this.bO.a(5, new bqu(this));
      this.bO.a(7, new bql(this, cbw.class, 6.0F));
      this.bO.a(8, new bqy(this));
      this.bP.a(1, new bru(this));
      this.bP.a(2, new brv(this));
      this.bP.a(3, new brw<>(this, cbw.class, 10, true, false, this::a_));
      this.bP.a(3, new brw<>(this, bjk.class, 5, false, false, $$0 -> $$0 instanceof bzc && !($$0 instanceof byw)));
      this.bP.a(4, new bsc<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, (byte)0);
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 100.0).a(bko.d, 0.25).a(bko.c, 1.0).a(bko.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bis $$0) {
      if ($$0 instanceof bzc && !($$0 instanceof byw) && this.ef().a(20) == 0) {
         this.h((bji)$$0);
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
         this.a((aks)this.dL(), true);
      }
   }

   @Override
   public boolean bj() {
      return this.do().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(biw<?> $$0) {
      if (this.ge() && $$0 == biw.bt) {
         return false;
      } else {
         return $$0 == biw.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.ge());
      this.c($$0);
   }

   @Override
   public void a(qy $$0) {
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
      return (float)this.b(bko.f);
   }

   @Override
   public boolean C(bis $$0) {
      this.e = 10;
      this.dL().a(this, (byte)4);
      float $$1 = this.gf();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dM().b((bji)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bji $$4 ? $$4.b(bko.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.do().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(apf.lM, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      bvf.a $$2 = this.t();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.t() != $$2) {
         this.a(apf.lN, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bvf.a t() {
      return bvf.a.a(this.eu() / this.eL());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(apf.lM, 1.0F, 1.0F);
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
   protected ape d(bhq $$0) {
      return apf.lP;
   }

   @Override
   protected ape l_() {
      return apf.lO;
   }

   @Override
   protected bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if (!$$2.a(cjk.nQ)) {
         return bha.d;
      } else {
         float $$3 = this.eu();
         this.b(25.0F);
         if (this.eu() == $$3) {
            return bha.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(apf.lQ, 1.0F, $$4);
            if (!$$0.fS().d) {
               $$2.h(1);
            }

            return bha.a(this.dL().B);
         }
      }
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.lR, 1.0F, 1.0F);
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
   public void a(bhq $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cqa $$0) {
      gw $$1 = this.dl();
      gw $$2 = $$1.d();
      dfl $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            gw $$5 = $$1.b($$4);
            dfl $$6 = $$0.a_($$5);
            if (!cqi.a($$0, $$5, $$6, $$6.u(), biw.ac)) {
               return false;
            }
         }

         return cqi.a($$0, $$1, $$0.a_($$1), eap.a.g(), biw.ac) && $$0.f(this);
      }
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.875F * this.cH()), (double)(this.df() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bvf.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bvf.a a(float $$0) {
         for (bvf.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
