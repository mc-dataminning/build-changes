import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cbo extends cbn {
   @Nullable
   private hx b;
   private boolean c;
   private boolean d;

   protected cbo(bkz<? extends cbo> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(4, new cbo.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", ss.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = ss.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gg() {
      return true;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$2 != blp.p && $$2 != blp.h && $$2 != blp.d && $$0.F_().i() < 0.06F && this.gg()) {
         this.c = true;
      }

      if (this.gj()) {
         this.a(bla.f, cfg.s());
         this.a(bla.f, 2.0F);
      }

      if ($$2 == blp.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bkz<? extends cbo> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a(cso.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(hx $$0) {
      this.b = $$0;
      this.d = true;
   }

   public hx gh() {
      return this.b;
   }

   public boolean gi() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gj() {
      return this.c;
   }

   public boolean gm() {
      return true;
   }

   public void gn() {
      this.b = this.dn().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean go() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cbo> extends bsg {
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
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dN().W() < this.e;
         return this.b.go() && this.b.q() == null && !this.b.cP() && this.b.gi() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gj();
         buu $$1 = this.b.N();
         if ($$1.l()) {
            List<cbo> $$2 = this.h();
            if (this.b.go() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gh().a(this.b.dl(), 10.0)) {
               this.b.gn();
            } else {
               ejz $$3 = ejz.c(this.b.gh());
               ejz $$4 = this.b.dl();
               ejz $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ejz $$6 = $$3.d($$4).d().a(10.0).e($$4);
               hx $$7 = hx.a($$6);
               $$7 = this.b.dN().a(dmw.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dN().W() + 200L;
               } else if ($$0) {
                  for (cbo $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cbo> h() {
         return this.b.dN().a(cbo.class, this.b.cH().g(16.0), $$0 -> $$0.gm() && !$$0.t(this.b));
      }

      private boolean i() {
         atw $$0 = this.b.eh();
         hx $$1 = this.b.dN().a(dmw.a.f, this.b.dn().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
