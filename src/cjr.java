import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cjr extends cjq {
   @Nullable
   private ja b;
   private boolean c;
   private boolean d;

   protected cjr(bsm<? extends cjr> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(4, new cjr.a<>(this, 0.7, 0.595));
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

   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$2 != btf.p && $$2 != btf.h && $$2 != btf.d && $$0.E_().i() < 0.06F && this.gp()) {
         this.c = true;
      }

      if (this.gs()) {
         this.a(bsn.f, cnv.a(this.dS().b(lr.d)));
         this.a(bsn.f, 2.0F);
      }

      if ($$2 == btf.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsm<? extends cjr> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a(dco.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(ja $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ja gq() {
      return this.b;
   }

   public boolean gr() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gs() {
      return this.c;
   }

   public boolean gv() {
      return true;
   }

   public void gw() {
      this.b = this.dq().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gx() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cjr> extends bzz {
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
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dQ().Z() < this.e;
         return this.b.gx() && this.b.p() == null && !this.b.cS() && this.b.gr() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gs();
         ccn $$1 = this.b.K();
         if ($$1.l()) {
            List<cjr> $$2 = this.h();
            if (this.b.gx() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gq().a(this.b.do(), 10.0)) {
               this.b.gw();
            } else {
               ewf $$3 = ewf.c(this.b.gq());
               ewf $$4 = this.b.do();
               ewf $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ewf $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ja $$7 = ja.a($$6);
               $$7 = this.b.dQ().a(dyf.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dQ().Z() + 200L;
               } else if ($$0) {
                  for (cjr $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cjr> h() {
         return this.b.dQ().a(cjr.class, this.b.cL().g(16.0), $$0 -> $$0.gv() && !$$0.t(this.b));
      }

      private boolean i() {
         ayo $$0 = this.b.dT();
         ja $$1 = this.b.dQ().a(dyf.a.f, this.b.dq().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
