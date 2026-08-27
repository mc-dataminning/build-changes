import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class chs extends chr {
   @Nullable
   private im b;
   private boolean c;
   private boolean d;

   protected chs(bqr<? extends chs> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(4, new chs.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", un.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      un.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gq() {
      return true;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$2 != bri.p && $$2 != bri.h && $$2 != bri.d && $$0.E_().i() < 0.06F && this.gq()) {
         this.c = true;
      }

      if (this.gt()) {
         this.a(bqs.f, clw.a(this.dP().b(ld.d)));
         this.a(bqs.f, 2.0F);
      }

      if ($$2 == bri.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bqr<? extends chs> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a(dad.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(im $$0) {
      this.b = $$0;
      this.d = true;
   }

   public im gr() {
      return this.b;
   }

   public boolean gs() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gt() {
      return this.c;
   }

   public boolean gw() {
      return true;
   }

   public void gx() {
      this.b = this.dn().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gy() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends chs> extends byb {
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
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dN().Y() < this.e;
         return this.b.gy() && this.b.p() == null && !this.b.cP() && this.b.gs() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gt();
         cap $$1 = this.b.K();
         if ($$1.l()) {
            List<chs> $$2 = this.h();
            if (this.b.gy() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gr().a(this.b.dl(), 10.0)) {
               this.b.gx();
            } else {
               etf $$3 = etf.c(this.b.gr());
               etf $$4 = this.b.dl();
               etf $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               etf $$6 = $$3.d($$4).d().a(10.0).e($$4);
               im $$7 = im.a($$6);
               $$7 = this.b.dN().a(dvq.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dN().Y() + 200L;
               } else if ($$0) {
                  for (chs $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<chs> h() {
         return this.b.dN().a(chs.class, this.b.cI().g(16.0), $$0 -> $$0.gw() && !$$0.t(this.b));
      }

      private boolean i() {
         ayd $$0 = this.b.ej();
         im $$1 = this.b.dN().a(dvq.a.f, this.b.dn().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
