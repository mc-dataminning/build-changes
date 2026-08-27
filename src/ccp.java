import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ccp extends cco {
   @Nullable
   private hx b;
   private boolean c;
   private boolean d;

   protected ccp(bly<? extends ccp> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(4, new ccp.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", tc.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = tc.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gf() {
      return true;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if ($$2 != bmo.p && $$2 != bmo.h && $$2 != bmo.d && $$0.F_().i() < 0.06F && this.gf()) {
         this.c = true;
      }

      if (this.gi()) {
         this.a(blz.f, cgp.s());
         this.a(blz.f, 2.0F);
      }

      if ($$2 == bmo.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bly<? extends ccp> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a(ctx.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(hx $$0) {
      this.b = $$0;
      this.d = true;
   }

   public hx gg() {
      return this.b;
   }

   public boolean gh() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gi() {
      return this.c;
   }

   public boolean gl() {
      return true;
   }

   public void gm() {
      this.b = this.dm().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gn() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends ccp> extends btg {
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
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dM().X() < this.e;
         return this.b.gn() && this.b.q() == null && !this.b.cO() && this.b.gh() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gi();
         bvu $$1 = this.b.N();
         if ($$1.l()) {
            List<ccp> $$2 = this.h();
            if (this.b.gn() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gg().a(this.b.dk(), 10.0)) {
               this.b.gm();
            } else {
               els $$3 = els.c(this.b.gg());
               els $$4 = this.b.dk();
               els $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               els $$6 = $$3.d($$4).d().a(10.0).e($$4);
               hx $$7 = hx.a($$6);
               $$7 = this.b.dM().a(dop.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dM().X() + 200L;
               } else if ($$0) {
                  for (ccp $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<ccp> h() {
         return this.b.dM().a(ccp.class, this.b.cH().g(16.0), $$0 -> $$0.gl() && !$$0.t(this.b));
      }

      private boolean i() {
         auu $$0 = this.b.eg();
         hx $$1 = this.b.dM().a(dop.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
