import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ckc extends ckb {
   @Nullable
   private jd b;
   private boolean c;
   private boolean d;

   protected ckc(bsw<? extends ckc> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(4, new ckc.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", up.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      up.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$2 != btp.p && $$2 != btp.h && $$2 != btp.d && $$0.E_().i() < 0.06F && this.gn()) {
         this.c = true;
      }

      if (this.gq()) {
         this.a(bsx.f, cog.a(this.dS().b(lu.d)));
         this.a(bsx.f, 2.0F);
      }

      if ($$2 == btp.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsw<? extends ckc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a(ddd.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void g(jd $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jd go() {
      return this.b;
   }

   public boolean gp() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gq() {
      return this.c;
   }

   public boolean gt() {
      return true;
   }

   public void gu() {
      this.b = this.dq().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gv() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends ckc> extends cak {
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
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dQ().Z() < this.e;
         return this.b.gv() && this.b.p() == null && !this.b.cS() && this.b.gp() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gq();
         ccy $$1 = this.b.J();
         if ($$1.l()) {
            List<ckc> $$2 = this.h();
            if (this.b.gv() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.go().a(this.b.do(), 10.0)) {
               this.b.gu();
            } else {
               eww $$3 = eww.c(this.b.go());
               eww $$4 = this.b.do();
               eww $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               eww $$6 = $$3.d($$4).d().a(10.0).e($$4);
               jd $$7 = jd.a((jw)$$6);
               $$7 = this.b.dQ().a(dyv.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dQ().Z() + 200L;
               } else if ($$0) {
                  for (ckc $$8 : $$2) {
                     $$8.g($$7);
                  }
               }
            }
         }
      }

      private List<ckc> h() {
         return this.b.dQ().a(ckc.class, this.b.cL().g(16.0), $$0 -> $$0.gt() && !$$0.t(this.b));
      }

      private boolean i() {
         ayv $$0 = this.b.dT();
         jd $$1 = this.b.dQ().a(dyv.a.f, this.b.dq().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
