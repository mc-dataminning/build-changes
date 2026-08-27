import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cha extends cgz {
   @Nullable
   private ib b;
   private boolean c;
   private boolean d;

   protected cha(bqb<? extends cha> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(4, new cha.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", ub.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      ub.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$2 != bqs.p && $$2 != bqs.h && $$2 != bqs.d && $$0.E_().i() < 0.06F && this.go()) {
         this.c = true;
      }

      if (this.gr()) {
         this.a(bqc.f, cle.s());
         this.a(bqc.f, 2.0F);
      }

      if ($$2 == bqs.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bqb<? extends cha> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a(czg.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(ib $$0) {
      this.b = $$0;
      this.d = true;
   }

   public ib gp() {
      return this.b;
   }

   public boolean gq() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gr() {
      return this.c;
   }

   public boolean gu() {
      return true;
   }

   public void gv() {
      this.b = this.dm().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gw() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cha> extends bxl {
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
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dM().Y() < this.e;
         return this.b.gw() && this.b.p() == null && !this.b.cO() && this.b.gq() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gr();
         bzz $$1 = this.b.K();
         if ($$1.l()) {
            List<cha> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gp().a(this.b.dk(), 10.0)) {
               this.b.gv();
            } else {
               esa $$3 = esa.c(this.b.gp());
               esa $$4 = this.b.dk();
               esa $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               esa $$6 = $$3.d($$4).d().a(10.0).e($$4);
               ib $$7 = ib.a($$6);
               $$7 = this.b.dM().a(dur.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dM().Y() + 200L;
               } else if ($$0) {
                  for (cha $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cha> h() {
         return this.b.dM().a(cha.class, this.b.cH().g(16.0), $$0 -> $$0.gu() && !$$0.t(this.b));
      }

      private boolean i() {
         axr $$0 = this.b.ei();
         ib $$1 = this.b.dM().a(dur.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
