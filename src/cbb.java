import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cbb extends cba {
   @Nullable
   private ht b;
   private boolean c;
   private boolean d;

   protected cbb(bkm<? extends cbb> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(4, new cbb.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", so.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = so.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gf() {
      return true;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$2 != blc.p && $$2 != blc.h && $$2 != blc.d && $$0.E_().i() < 0.06F && this.gf()) {
         this.c = true;
      }

      if (this.gi()) {
         this.a(bkn.f, cet.s());
         this.a(bkn.f, 2.0F);
      }

      if ($$2 == blc.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bkm<? extends cbb> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a(csb.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(ht $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ht gg() {
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
      this.b = this.dl().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gn() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cbb> extends brt {
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
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dL().V() < this.e;
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
         buh $$1 = this.b.L();
         if ($$1.l()) {
            List<cbb> $$2 = this.h();
            if (this.b.gn() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gg().a(this.b.dj(), 10.0)) {
               this.b.gm();
            } else {
               eji $$3 = eji.c(this.b.gg());
               eji $$4 = this.b.dj();
               eji $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               eji $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ht $$7 = ht.a($$6);
               $$7 = this.b.dL().a(dmf.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dL().V() + 200L;
               } else if ($$0) {
                  for (cbb $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cbb> h() {
         return this.b.dL().a(cbb.class, this.b.cG().g(16.0), $$0 -> $$0.gl() && !$$0.t(this.b));
      }

      private boolean i() {
         ato $$0 = this.b.ef();
         ht $$1 = this.b.dL().a(dmf.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
