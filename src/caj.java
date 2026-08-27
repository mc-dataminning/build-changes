import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class caj extends bzv implements boo {
   protected static final aie<Byte> c = aih.a(caj.class, aig.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final blh bU = axh.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public caj(bnw<? extends caj> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvp(this, 1.0, true));
      this.bO.a(2, new bvu(this, 0.9, 32.0F));
      this.bO.a(2, new bvq(this, 0.6, false));
      this.bO.a(4, new bvh(this, 0.6));
      this.bO.a(5, new bvw(this));
      this.bO.a(7, new bvn(this, chl.class, 6.0F));
      this.bO.a(8, new bwa(this));
      this.bP.a(1, new bww(this));
      this.bP.a(2, new bwx(this));
      this.bP.a(3, new bwy<>(this, chl.class, 10, true, false, this::a_));
      this.bP.a(3, new bwy<>(this, bok.class, 5, false, false, $$0 -> $$0 instanceof cej && !($$0 instanceof ced)));
      this.bP.a(4, new bxe<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, (byte)0);
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 100.0).a(bpp.o, 0.25).a(bpp.k, 1.0).a(bpp.c, 15.0).a(bpp.r, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void C(bnq $$0) {
      if ($$0 instanceof cej && !($$0 instanceof ced) && this.eh().a(20) == 0) {
         this.h((boi)$$0);
      }

      super.C($$0);
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
         this.a((aow)this.dM(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dp().i() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bnw<?> $$0) {
      if (this.gh() && $$0 == bnw.bw) {
         return false;
      } else {
         return $$0 == bnw.w ? false : super.a($$0);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.gh());
      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dM(), $$0);
   }

   @Override
   public void c() {
      this.a(bU.a(this.af));
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

   private float gi() {
      return (float)this.g(bpp.c);
   }

   @Override
   public boolean B(bnq $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gi();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((boi)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof boi $$4 ? $$4.g(bpp.k) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(atl.mQ, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      caj.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(atl.mR, 1.0F, 1.0F);
      }

      return $$3;
   }

   public caj.a w() {
      return caj.a.a(this.ew() / this.eN());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(atl.mQ, 1.0F, 1.0F);
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
   protected atk d(bmp $$0) {
      return atl.mT;
   }

   @Override
   protected atk n_() {
      return atl.mS;
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if (!$$2.a(cpg.oD)) {
         return blw.d;
      } else {
         float $$3 = this.ew();
         this.c(25.0F);
         if (this.ew() == $$3) {
            return blw.d;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(atl.mU, 1.0F, $$4);
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            return blw.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.mV, 1.0F, 1.0F);
   }

   public int gg() {
      return this.bT;
   }

   public boolean gh() {
      return (this.am.b(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.b(c);
      if ($$0) {
         this.am.b(c, (byte)($$1 | 1));
      } else {
         this.am.b(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(bmp $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cvu $$0) {
      hz $$1 = this.dm();
      hz $$2 = $$1.d();
      dlj $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hz $$5 = $$1.b($$4);
            dlj $$6 = $$0.a_($$5);
            if (!cwc.a($$0, $$5, $$6, $$6.u(), bnw.ae)) {
               return false;
            }
         }

         return cwc.a($$0, $$1, $$0.a_($$1), egx.a.g(), bnw.ae) && $$0.f(this);
      }
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<caj.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static caj.a a(float $$0) {
         for (caj.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
