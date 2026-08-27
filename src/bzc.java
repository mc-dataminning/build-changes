import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bzc extends bzb {
   @Nullable
   private gu b;
   private boolean c;
   private boolean d;

   protected bzc(bim<? extends bzc> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(4, new bzc.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", rd.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = rd.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean ga() {
      return true;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      if ($$2 != bjc.p && $$2 != bjc.h && $$2 != bjc.d && $$0.y_().i() < 0.06F && this.ga()) {
         this.c = true;
      }

      if (this.gd()) {
         this.a(bin.f, ccu.s());
         this.a(bin.f, 2.0F);
      }

      if ($$2 == bjc.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bim<? extends bzc> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a(cpv.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(gu $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gu gb() {
      return this.b;
   }

   public boolean gc() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gd() {
      return this.c;
   }

   public boolean gg() {
      return true;
   }

   public void gh() {
      this.b = this.dk().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gi() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends bzc> extends bpu {
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
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dK().V() < this.e;
         return this.b.gi() && this.b.j() == null && !this.b.cO() && this.b.gc() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gd();
         bsi $$1 = this.b.H();
         if ($$1.l()) {
            List<bzc> $$2 = this.h();
            if (this.b.gi() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gb().a(this.b.di(), 10.0)) {
               this.b.gh();
            } else {
               ehe $$3 = ehe.c(this.b.gb());
               ehe $$4 = this.b.di();
               ehe $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ehe $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gu $$7 = gu.a($$6);
               $$7 = this.b.dK().a(dkj.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dK().V() + 200L;
               } else if ($$0) {
                  for (bzc $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<bzc> h() {
         return this.b.dK().a(bzc.class, this.b.cG().g(16.0), $$0 -> $$0.gg() && !$$0.t(this.b));
      }

      private boolean i() {
         aru $$0 = this.b.ee();
         gu $$1 = this.b.dK().a(dkj.a.f, this.b.dk().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.H().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
