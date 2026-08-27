import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cfh extends cfg {
   @Nullable
   private ib b;
   private boolean c;
   private boolean d;

   protected cfh(bol<? extends cfh> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(4, new cfh.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", tn.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = tn.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gm() {
      return true;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$2 != bpb.p && $$2 != bpb.h && $$2 != bpb.d && $$0.F_().i() < 0.06F && this.gm()) {
         this.c = true;
      }

      if (this.gp()) {
         this.a(bom.f, cjj.s());
         this.a(bom.f, 2.0F);
      }

      if ($$2 == bpb.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bol<? extends cfh> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a(cwn.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(ib $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ib gn() {
      return this.b;
   }

   public boolean go() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gp() {
      return this.c;
   }

   public boolean gs() {
      return true;
   }

   public void gt() {
      this.b = this.dj().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gu() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cfh> extends bvu {
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
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dJ().X() < this.e;
         return this.b.gu() && this.b.q() == null && !this.b.cL() && this.b.go() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gp();
         byi $$1 = this.b.N();
         if ($$1.l()) {
            List<cfh> $$2 = this.h();
            if (this.b.gu() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gn().a(this.b.dh(), 10.0)) {
               this.b.gt();
            } else {
               eov $$3 = eov.c(this.b.gn());
               eov $$4 = this.b.dh();
               eov $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               eov $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ib $$7 = ib.a($$6);
               $$7 = this.b.dJ().a(drq.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dJ().X() + 200L;
               } else if ($$0) {
                  for (cfh $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cfh> h() {
         return this.b.dJ().a(cfh.class, this.b.cE().g(16.0), $$0 -> $$0.gs() && !$$0.s(this.b));
      }

      private boolean i() {
         awt $$0 = this.b.ef();
         ib $$1 = this.b.dJ().a(drq.a.f, this.b.dj().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
