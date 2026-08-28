import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cke extends ckd {
   @Nullable
   private jd b;
   private boolean c;
   private boolean d;

   protected cke(bsx<? extends cke> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(4, new cke.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uq.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      uq.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gl() {
      return true;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$2 != btr.p && $$2 != btr.h && $$2 != btr.d && $$0.E_().i() < 0.06F && this.gl()) {
         this.c = true;
      }

      if (this.go()) {
         this.a(bsy.f, coi.a(this.dQ().b(lu.d)));
         this.a(bsy.f, 2.0F);
      }

      if ($$2 == btr.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsx<? extends cke> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a(ddf.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(jd $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jd gm() {
      return this.b;
   }

   public boolean gn() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean go() {
      return this.c;
   }

   public boolean gr() {
      return true;
   }

   public void gs() {
      this.b = this.do().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gt() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cke> extends cam {
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
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dO().Z() < this.e;
         return this.b.gt() && this.b.p() == null && !this.b.cR() && this.b.gn() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.go();
         cda $$1 = this.b.N();
         if ($$1.l()) {
            List<cke> $$2 = this.h();
            if (this.b.gt() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gm().a(this.b.dm(), 10.0)) {
               this.b.gs();
            } else {
               exc $$3 = exc.c(this.b.gm());
               exc $$4 = this.b.dm();
               exc $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               exc $$6 = $$3.d($$4).d().a(10.0).e($$4);
               jd $$7 = jd.a((jw)$$6);
               $$7 = this.b.dO().a(dyy.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dO().Z() + 200L;
               } else if ($$0) {
                  for (cke $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cke> h() {
         return this.b.dO().a(cke.class, this.b.cK().g(16.0), $$0 -> $$0.gr() && !$$0.t(this.b));
      }

      private boolean i() {
         ayw $$0 = this.b.dR();
         jd $$1 = this.b.dO().a(dyy.a.f, this.b.do().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
