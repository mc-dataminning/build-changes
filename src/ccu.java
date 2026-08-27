import java.util.UUID;
import javax.annotation.Nullable;

public class ccu extends ccg implements bqz {
   protected static final aja<Byte> c = aje.a(ccu.class, ajc.a);
   private static final int d = 25;
   private int e;
   private int bX;
   private static final bnq bY = ayl.a(20, 39);
   private int bZ;
   @Nullable
   private UUID ca;

   public ccu(bqg<? extends ccu> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bya(this, 1.0, true));
      this.bR.a(2, new byf(this, 0.9, 32.0F));
      this.bR.a(2, new byb(this, 0.6, false));
      this.bR.a(4, new bxs(this, 0.6));
      this.bR.a(5, new byh(this));
      this.bR.a(7, new bxy(this, cka.class, 6.0F));
      this.bR.a(8, new byl(this));
      this.bS.a(1, new bzh(this));
      this.bS.a(2, new bzi(this));
      this.bS.a(3, new bzj<>(this, cka.class, 10, true, false, this::a_));
      this.bS.a(3, new bzj<>(this, bqv.class, 5, false, false, $$0 -> $$0 instanceof cgy && !($$0 instanceof cgs)));
      this.bS.a(4, new bzp<>(this, false));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(c, (byte)0);
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 100.0).a(bsa.r, 0.25).a(bsa.n, 1.0).a(bsa.c, 15.0).a(bsa.v, 1.0);
   }

   @Override
   protected int n(int $$0) {
      return $$0;
   }

   @Override
   protected void D(bqa $$0) {
      if ($$0 instanceof cgy && !($$0 instanceof cgs) && this.ei().a(20) == 0) {
         this.h((bqt)$$0);
      }

      super.D($$0);
   }

   @Override
   public void n_() {
      super.n_();
      if (this.e > 0) {
         this.e--;
      }

      if (this.bX > 0) {
         this.bX--;
      }

      if (!this.dM().B) {
         this.a((apu)this.dM(), true);
      }
   }

   @Override
   public boolean bo() {
      return this.dp().i() > 2.5000003E-7F && this.ag.a(5) == 0;
   }

   @Override
   public boolean a(bqg<?> $$0) {
      if (this.go() && $$0 == bqg.bx) {
         return false;
      } else {
         return $$0 == bqg.x ? false : super.a($$0);
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.go());
      this.c($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.x($$0.q("PlayerCreated"));
      this.a(this.dM(), $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public int a() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ca = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ca;
   }

   private float gp() {
      return (float)this.g(bsa.c);
   }

   @Override
   public boolean C(bqa $$0) {
      this.e = 10;
      this.dM().a(this, (byte)4);
      float $$1 = this.gp();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.ag.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(this.dN().b((bqt)this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bqt $$4 ? $$4.g(bsa.n) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.g($$0.dp().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(auo.mZ, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      bpy.a $$2 = this.u();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.u() != $$2) {
         this.a(auo.na, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bpy.a u() {
      return bpy.a.a(this.ex() / this.eO());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(auo.mZ, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bX = 400;
      } else if ($$0 == 34) {
         this.bX = 0;
      } else {
         super.b($$0);
      }
   }

   public int y() {
      return this.e;
   }

   public void w(boolean $$0) {
      if ($$0) {
         this.bX = 400;
         this.dM().a(this, (byte)11);
      } else {
         this.bX = 0;
         this.dM().a(this, (byte)34);
      }
   }

   @Override
   protected aun d(boy $$0) {
      return auo.nc;
   }

   @Override
   protected aun o_() {
      return auo.nb;
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if (!$$2.a(crv.oD)) {
         return bof.d;
      } else {
         float $$3 = this.ex();
         this.c(25.0F);
         if (this.ex() == $$3) {
            return bof.d;
         } else {
            float $$4 = 1.0F + (this.ag.i() - this.ag.i()) * 0.2F;
            this.a(auo.nd, 1.0F, $$4);
            $$2.a(1, $$0);
            return bof.a(this.dM().B);
         }
      }
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.ne, 1.0F, 1.0F);
   }

   public int gn() {
      return this.bX;
   }

   public boolean go() {
      return (this.an.a(c) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.a(c);
      if ($$0) {
         this.an.a(c, (byte)($$1 | 1));
      } else {
         this.an.a(c, (byte)($$1 & -2));
      }
   }

   @Override
   public void a(boy $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(czj $$0) {
      id $$1 = this.dm();
      id $$2 = $$1.d();
      dpi $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for (int $$4 = 1; $$4 < 3; $$4++) {
            id $$5 = $$1.b($$4);
            dpi $$6 = $$0.a_($$5);
            if (!czr.a($$0, $$5, $$6, $$6.u(), bqg.af)) {
               return false;
            }
         }

         return czr.a($$0, $$1, $$0.a_($$1), elc.a.g(), bqg.af) && $$0.f(this);
      }
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.875F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
