import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cca extends cbz {
   @Nullable
   private hv b;
   private boolean c;
   private boolean d;

   protected cca(blj<? extends cca> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(4, new cca.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", sy.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = sy.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gf() {
      return true;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$2 != blz.p && $$2 != blz.h && $$2 != blz.d && $$0.F_().i() < 0.06F && this.gf()) {
         this.c = true;
      }

      if (this.gi()) {
         this.a(blk.f, cfz.s());
         this.a(blk.f, 2.0F);
      }

      if ($$2 == blz.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(blj<? extends cca> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a(cth.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(hv $$0) {
      this.b = $$0;
      this.d = true;
   }

   public hv gg() {
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

   public static class a<T extends cca> extends bsr {
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
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dM().W() < this.e;
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
         bvf $$1 = this.b.N();
         if ($$1.l()) {
            List<cca> $$2 = this.h();
            if (this.b.gn() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gg().a(this.b.dk(), 10.0)) {
               this.b.gm();
            } else {
               elb $$3 = elb.c(this.b.gg());
               elb $$4 = this.b.dk();
               elb $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               elb $$6 = $$3.d($$4).d().a(10.0).e($$4);
               hv $$7 = hv.a($$6);
               $$7 = this.b.dM().a(dny.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dM().W() + 200L;
               } else if ($$0) {
                  for (cca $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cca> h() {
         return this.b.dM().a(cca.class, this.b.cH().g(16.0), $$0 -> $$0.gl() && !$$0.t(this.b));
      }

      private boolean i() {
         auf $$0 = this.b.eg();
         hv $$1 = this.b.dM().a(dny.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
