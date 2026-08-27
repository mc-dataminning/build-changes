import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ccx extends ccw {
   @Nullable
   private hx b;
   private boolean c;
   private boolean d;

   protected ccx(bmc<? extends ccx> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(4, new ccx.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", td.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = td.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gg() {
      return true;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$2 != bms.p && $$2 != bms.h && $$2 != bms.d && $$0.F_().i() < 0.06F && this.gg()) {
         this.c = true;
      }

      if (this.gj()) {
         this.a(bmd.f, cgy.s());
         this.a(bmd.f, 2.0F);
      }

      if ($$2 == bms.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bmc<? extends ccx> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a(cug.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
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
      this.b = this.dl().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean go() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends ccx> extends btk {
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
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dL().X() < this.e;
         return this.b.go() && this.b.q() == null && !this.b.cO() && this.b.gi() && !$$0;
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
         bvy $$1 = this.b.N();
         if ($$1.l()) {
            List<ccx> $$2 = this.h();
            if (this.b.go() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gh().a(this.b.dj(), 10.0)) {
               this.b.gn();
            } else {
               emc $$3 = emc.c(this.b.gh());
               emc $$4 = this.b.dj();
               emc $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               emc $$6 = $$3.d($$4).d().a(10.0).e($$4);
               hx $$7 = hx.a($$6);
               $$7 = this.b.dL().a(doy.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dL().X() + 200L;
               } else if ($$0) {
                  for (ccx $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<ccx> h() {
         return this.b.dL().a(ccx.class, this.b.cH().g(16.0), $$0 -> $$0.gm() && !$$0.s(this.b));
      }

      private boolean i() {
         auw $$0 = this.b.eg();
         hx $$1 = this.b.dL().a(doy.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
