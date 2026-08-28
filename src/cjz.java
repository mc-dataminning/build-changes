import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cjz extends cjy {
   @Nullable
   private iz b;
   private boolean c;
   private boolean d;

   protected cjz(bsv<? extends cjz> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(4, new cjz.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", vg.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      vg.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gr() {
      return true;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      if ($$2 != bto.p && $$2 != bto.h && $$2 != bto.d && $$0.E_().i() < 0.06F && this.gr()) {
         this.c = true;
      }

      if (this.gu()) {
         this.a(bsw.f, cod.a(this.dR().b(lq.d)));
         this.a(bsw.f, 2.0F);
      }

      if ($$2 == bto.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsv<? extends cjz> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a(dcc.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(iz $$0) {
      this.b = $$0;
      this.d = true;
   }

   public iz gs() {
      return this.b;
   }

   public boolean gt() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gu() {
      return this.c;
   }

   public boolean gx() {
      return true;
   }

   public void gy() {
      this.b = this.dp().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gz() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cjz> extends cai {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dP().Z() < this.e;
         return this.b.gz() && this.b.p() == null && !this.b.cR() && this.b.gt() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gu();
         ccw $$1 = this.b.K();
         if ($$1.l()) {
            List<cjz> $$2 = this.h();
            if (this.b.gz() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gs().a(this.b.dn(), 10.0)) {
               this.b.gy();
            } else {
               evm $$3 = evm.c(this.b.gs());
               evm $$4 = this.b.dn();
               evm $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               evm $$6 = $$3.d($$4).d().a(10.0).e($$4);
               iz $$7 = iz.a($$6);
               $$7 = this.b.dP().a(dxp.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dP().Z() + 200L;
               } else if ($$0) {
                  for (cjz $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cjz> h() {
         return this.b.dP().a(cjz.class, this.b.cK().g(16.0), $$0 -> $$0.gx() && !$$0.t(this.b));
      }

      private boolean i() {
         azc $$0 = this.b.el();
         iz $$1 = this.b.dP().a(dxp.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
