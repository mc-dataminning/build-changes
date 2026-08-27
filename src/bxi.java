import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxi extends bwu implements bls {
   protected static final afs<Byte> c = afv.a(bxi.class, afu.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final bim bU = aup.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public bxi(bkz<? extends bxi> $$0, csf $$1) {
      super($$0, $$1);
      this.t(1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsq(this, 1.0, true));
      this.bO.a(2, new bsv(this, 0.9, 32.0F));
      this.bO.a(2, new bsr(this, 0.6, false));
      this.bO.a(4, new bsi(this, 0.6));
      this.bO.a(5, new bsx(this));
      this.bO.a(7, new bso(this, cdz.class, 6.0F));
      this.bO.a(8, new btb(this));
      this.bP.a(1, new btx(this));
      this.bP.a(2, new bty(this));
      this.bP.a(3, new btz<>(this, cdz.class, 10, true, false, this::a_));
      this.bP.a(3, new btz<>(this, bln.class, 5, false, false, $$0 -> $$0 instanceof cbf && !($$0 instanceof caz)));
      this.bP.a(4, new buf<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, (byte)0);
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 100.0).a(bmr.m, 0.25).a(bmr.i, 1.0).a(bmr.c, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bkv $$0) {
      if ($$0 instanceof cbf && !($$0 instanceof caz) && this.eh().a(20) == 0) {
         this.h((bll)$$0);
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

      if (!this.dN().B) {
         this.a((ami)this.dN(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dq().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bkz<?> $$0) {
      if (this.gg() && $$0 == bkz.bt) {
         return false;
      } else {
         return $$0 == bkz.u ? false : super.a($$0);
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gg());
      this.c($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dN(), $$0);
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

   private float gh() {
      return (float)this.b(bmr.c);
   }

   @Override
   public boolean C(bkv $$0) {
      this.e = 10;
      this.dN().a(this, (byte)4);
      float $$1 = this.gh();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dO().b((bll)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bll $$4 ? $$4.b(bmr.i) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dq().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(aqv.mg, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      bxi.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(aqv.mh, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bxi.a w() {
      return bxi.a.a(this.ew() / this.eN());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(aqv.mg, 1.0F, 1.0F);
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
         this.dN().a(this, (byte)11);
      } else {
         this.bT = 0;
         this.dN().a(this, (byte)34);
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.mj;
   }

   @Override
   protected aqu n_() {
      return aqv.mi;
   }

   @Override
   protected bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (!$$2.a(clr.oB)) {
         return bjb.d;
      } else {
         float $$3 = this.ew();
         this.b(25.0F);
         if (this.ew() == $$3) {
            return bjb.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(aqv.mk, 1.0F, $$4);
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            return bjb.a(this.dN().B);
         }
      }
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.ml, 1.0F, 1.0F);
   }

   public int gf() {
      return this.bT;
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
   public void a(bjt $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(csi $$0) {
      hx $$1 = this.dn();
      hx $$2 = $$1.d();
      dhn $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hx $$5 = $$1.b($$4);
            dhn $$6 = $$0.a_($$5);
            if (!csq.a($$0, $$5, $$6, $$6.u(), bkz.ac)) {
               return false;
            }
         }

         return csq.a($$0, $$1, $$0.a_($$1), ecy.a.g(), bkz.ac) && $$0.f(this);
      }
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.875F * this.cI()), (double)(this.dh() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bxi.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bxi.a a(float $$0) {
         for (bxi.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
