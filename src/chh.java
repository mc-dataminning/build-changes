import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class chh extends chg {
   @Nullable
   private id b;
   private boolean c;
   private boolean d;

   protected chh(bqg<? extends chh> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(4, new chh.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", ud.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      ud.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$2 != bqx.p && $$2 != bqx.h && $$2 != bqx.d && $$0.E_().i() < 0.06F && this.go()) {
         this.c = true;
      }

      if (this.gr()) {
         this.a(bqh.f, cll.a(this.dO().b(ku.d)));
         this.a(bqh.f, 2.0F);
      }

      if ($$2 == bqx.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bqg<? extends chh> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a(czp.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(id $$0) {
      this.b = $$0;
      this.d = true;
   }

   public id gp() {
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

   public static class a<T extends chh> extends bxq {
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
         this.a(EnumSet.of(bxq.a.a));
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
         cae $$1 = this.b.K();
         if ($$1.l()) {
            List<chh> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gp().a(this.b.dk(), 10.0)) {
               this.b.gv();
            } else {
               esj $$3 = esj.c(this.b.gp());
               esj $$4 = this.b.dk();
               esj $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               esj $$6 = $$3.d($$4).d().a(10.0).e($$4);
               id $$7 = id.a($$6);
               $$7 = this.b.dM().a(dva.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dM().Y() + 200L;
               } else if ($$0) {
                  for (chh $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<chh> h() {
         return this.b.dM().a(chh.class, this.b.cH().g(16.0), $$0 -> $$0.gu() && !$$0.t(this.b));
      }

      private boolean i() {
         axt $$0 = this.b.ei();
         id $$1 = this.b.dM().a(dva.a.f, this.b.dm().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
