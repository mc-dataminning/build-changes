import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class caf extends bzr implements bom {
   protected static final aie<Byte> c = aih.a(caf.class, aig.a);
   private static final int d = 25;
   private int e;
   private int bT;
   private static final blf bU = axh.a(20, 39);
   private int bV;
   @Nullable
   private UUID bW;

   public caf(bnu<? extends caf> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvl(this, 1.0, true));
      this.bO.a(2, new bvq(this, 0.9, 32.0F));
      this.bO.a(2, new bvm(this, 0.6, false));
      this.bO.a(4, new bvd(this, 0.6));
      this.bO.a(5, new bvs(this));
      this.bO.a(7, new bvj(this, chh.class, 6.0F));
      this.bO.a(8, new bvw(this));
      this.bP.a(1, new bws(this));
      this.bP.a(2, new bwt(this));
      this.bP.a(3, new bwu<>(this, chh.class, 10, true, false, this::a_));
      this.bP.a(3, new bwu<>(this, boi.class, 5, false, false, $$0 -> $$0 instanceof cef && !($$0 instanceof cdz)));
      this.bP.a(4, new bxa<>(this, false));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, (byte)0);
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 100.0).a(bpl.o, 0.25).a(bpl.k, 1.0).a(bpl.c, 15.0).a(bpl.r, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void C(bno $$0) {
      if ($$0 instanceof cef && !($$0 instanceof cdz) && this.eh().a(20) == 0) {
         this.h((bog)$$0);
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
         this.a((aov)this.dM(), true);
      }
   }

   @Override
   public boolean bl() {
      return this.dp().i() > 2.5000003E-7F && this.af.a(5) == 0;
   }

   @Override
   public boolean a(bnu<?> $$0) {
      if (this.gh() && $$0 == bnu.bw) {
         return false;
      } else {
         return $$0 == bnu.w ? false : super.a($$0);
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
      return (float)this.g(bpl.c);
   }

   @Override
   public boolean B(bno $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gi();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.af.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((bog)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bog $$4 ? $$4.g(bpl.k) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(atk.mP, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      caf.a $$2 = this.w();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.w() != $$2) {
         this.a(atk.mQ, 1.0F, 1.0F);
      }

      return $$3;
   }

   public caf.a w() {
      return caf.a.a(this.ew() / this.eN());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(atk.mP, 1.0F, 1.0F);
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
   protected atj d(bmn $$0) {
      return atk.mS;
   }

   @Override
   protected atj n_() {
      return atk.mR;
   }

   @Override
   protected blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (!$$2.a(cpc.oD)) {
         return blu.d;
      } else {
         float $$3 = this.ew();
         this.c(25.0F);
         if (this.ew() == $$3) {
            return blu.d;
         } else {
            float $$4 = 1.0F + (this.af.i() - this.af.i()) * 0.2F;
            this.a(atk.mT, 1.0F, $$4);
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            return blu.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.mU, 1.0F, 1.0F);
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
   public void a(bmn $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cvq $$0) {
      hz $$1 = this.dm();
      hz $$2 = $$1.d();
      dlf $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            hz $$5 = $$1.b($$4);
            dlf $$6 = $$0.a_($$5);
            if (!cvy.a($$0, $$5, $$6, $$6.u(), bnu.ae)) {
               return false;
            }
         }

         return cvy.a($$0, $$1, $$0.a_($$1), egq.a.g(), bnu.ae) && $$0.f(this);
      }
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<caf.a> e = Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static caf.a a(float $$0) {
         for (caf.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
