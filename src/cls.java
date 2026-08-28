import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cls extends clr {
   @Nullable
   private jh b;
   private boolean c;
   private boolean d;

   protected cls(bul<? extends cls> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(4, new cls.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uz.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      uz.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gv() {
      return true;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$2 != buk.p && $$2 != buk.h && $$2 != buk.d && $$0.E_().i() < 0.06F && this.gv()) {
         this.c = true;
      }

      if (this.gy()) {
         this.a(bum.f, cqa.a(this.dZ().e(lz.d)));
         this.a(bum.f, 2.0F);
      }

      if ($$2 == buk.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bul<? extends cls> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a(dfk.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(jh $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jh gw() {
      return this.b;
   }

   public boolean gx() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gy() {
      return this.c;
   }

   public boolean gB() {
      return true;
   }

   public void gC() {
      this.b = this.dx().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gD() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cls> extends cby {
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
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dX().aa() < this.e;
         return this.b.gD() && this.b.m() == null && !this.b.cZ() && this.b.gx() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gy();
         cem $$1 = this.b.P();
         if ($$1.m()) {
            List<cls> $$2 = this.h();
            if (this.b.gD() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gw().a(this.b.dv(), 10.0)) {
               this.b.gC();
            } else {
               ezn $$3 = ezn.c(this.b.gw());
               ezn $$4 = this.b.dv();
               ezn $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               ezn $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jh $$7 = jh.a((ka)$$6);
               $$7 = this.b.dX().a(ebf.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dX().aa() + 200L;
               } else if ($$0) {
                  for (cls $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cls> h() {
         return this.b.dX().a(cls.class, this.b.cS().g(16.0), $$0 -> $$0.gB() && !$$0.u(this.b));
      }

      private boolean i() {
         azs $$0 = this.b.ea();
         jh $$1 = this.b.dX().a(ebf.a.f, this.b.dx().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
