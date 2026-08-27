import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ceo extends cen {
   @Nullable
   private hz b;
   private boolean c;
   private boolean d;

   protected ceo(bnu<? extends ceo> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(4, new ceo.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", tl.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = tl.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gh() {
      return true;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$2 != bok.p && $$2 != bok.h && $$2 != bok.d && $$0.F_().i() < 0.06F && this.gh()) {
         this.c = true;
      }

      if (this.gk()) {
         this.a(bnv.f, ciq.s());
         this.a(bnv.f, 2.0F);
      }

      if ($$2 == bok.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bnu<? extends ceo> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a(cvw.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(hz $$0) {
      this.b = $$0;
      this.d = true;
   }

   public hz gi() {
      return this.b;
   }

   public boolean gj() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gk() {
      return this.c;
   }

   public boolean gn() {
      return true;
   }

   public void go() {
      this.b = this.dm().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gp() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends ceo> extends bvb {
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
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dM().X() < this.e;
         return this.b.gp() && this.b.q() == null && !this.b.cO() && this.b.gj() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gk();
         bxp $$1 = this.b.N();
         if ($$1.l()) {
            List<ceo> $$2 = this.h();
            if (this.b.gp() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gi().a(this.b.dk(), 10.0)) {
               this.b.go();
            } else {
               ens $$3 = ens.c(this.b.gi());
               ens $$4 = this.b.dk();
               ens $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ens $$6 = $$3.d($$4).d().a(10.0).e($$4);
               hz $$7 = hz.a($$6);
               $$7 = this.b.dM().a(dqo.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dM().X() + 200L;
               } else if ($$0) {
                  for (ceo $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<ceo> h() {
         return this.b.dM().a(ceo.class, this.b.cH().g(16.0), $$0 -> $$0.gn() && !$$0.s(this.b));
      }

      private boolean i() {
         awo $$0 = this.b.eh();
         hz $$1 = this.b.dM().a(dqo.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
