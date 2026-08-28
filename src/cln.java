import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cln extends clm {
   @Nullable
   private jg b;
   private boolean c;
   private boolean d;

   protected cln(bug<? extends cln> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(4, new cln.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uy.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      uy.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$2 != buf.p && $$2 != buf.h && $$2 != buf.d && $$0.E_().i() < 0.06F && this.gw()) {
         this.c = true;
      }

      if (this.gz()) {
         this.a(buh.f, cpv.a(this.dZ().e(ly.d)));
         this.a(buh.f, 2.0F);
      }

      if ($$2 == buf.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bug<? extends cln> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a(dfe.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(jg $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jg gx() {
      return this.b;
   }

   public boolean gy() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gz() {
      return this.c;
   }

   public boolean gC() {
      return true;
   }

   public void gD() {
      this.b = this.dx().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gE() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cln> extends cbt {
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
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dX().aa() < this.e;
         return this.b.gE() && this.b.m() == null && !this.b.cZ() && this.b.gy() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gz();
         ceh $$1 = this.b.P();
         if ($$1.m()) {
            List<cln> $$2 = this.h();
            if (this.b.gE() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gx().a(this.b.dv(), 10.0)) {
               this.b.gD();
            } else {
               ezh $$3 = ezh.c(this.b.gx());
               ezh $$4 = this.b.dv();
               ezh $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               ezh $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jg $$7 = jg.a((jz)$$6);
               $$7 = this.b.dX().a(eaz.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dX().aa() + 200L;
               } else if ($$0) {
                  for (cln $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cln> h() {
         return this.b.dX().a(cln.class, this.b.cS().g(16.0), $$0 -> $$0.gC() && !$$0.u(this.b));
      }

      private boolean i() {
         azr $$0 = this.b.ea();
         jg $$1 = this.b.dX().a(eaz.a.f, this.b.dx().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
