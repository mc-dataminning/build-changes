import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cjo extends cjn {
   @Nullable
   private ja b;
   private boolean c;
   private boolean d;

   protected cjo(bsj<? extends cjo> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(4, new cjo.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", um.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      um.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$2 != btc.p && $$2 != btc.h && $$2 != btc.d && $$0.E_().i() < 0.06F && this.go()) {
         this.c = true;
      }

      if (this.gr()) {
         this.a(bsk.f, cns.a(this.dR().b(lr.d)));
         this.a(bsk.f, 2.0F);
      }

      if ($$2 == btc.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsj<? extends cjo> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a(dcm.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(ja $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ja gp() {
      return this.b;
   }

   public boolean gq() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gr() {
      return this.c;
   }

   public boolean gu() {
      return true;
   }

   public void gv() {
      this.b = this.dp().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gw() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cjo> extends bzw {
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
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dP().Z() < this.e;
         return this.b.gw() && this.b.p() == null && !this.b.cR() && this.b.gq() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gr();
         cck $$1 = this.b.K();
         if ($$1.l()) {
            List<cjo> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gp().a(this.b.dn(), 10.0)) {
               this.b.gv();
            } else {
               evz $$3 = evz.c(this.b.gp());
               evz $$4 = this.b.dn();
               evz $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               evz $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ja $$7 = ja.a($$6);
               $$7 = this.b.dP().a(dxz.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dP().Z() + 200L;
               } else if ($$0) {
                  for (cjo $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cjo> h() {
         return this.b.dP().a(cjo.class, this.b.cK().g(16.0), $$0 -> $$0.gu() && !$$0.t(this.b));
      }

      private boolean i() {
         aym $$0 = this.b.dS();
         ja $$1 = this.b.dP().a(dxz.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
