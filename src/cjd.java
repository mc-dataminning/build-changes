import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cjd extends cjc {
   @Nullable
   private io b;
   private boolean c;
   private boolean d;

   protected cjd(bsa<? extends cjd> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(4, new cjd.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", us.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      us.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gq() {
      return true;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$2 != bss.p && $$2 != bss.h && $$2 != bss.d && $$0.E_().i() < 0.06F && this.gq()) {
         this.c = true;
      }

      if (this.gt()) {
         this.a(bsb.f, cnh.a(this.dR().b(lf.d)));
         this.a(bsb.f, 2.0F);
      }

      if ($$2 == bss.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bsa<? extends cjd> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a(dbg.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(io $$0) {
      this.b = $$0;
      this.d = true;
   }

   public io gr() {
      return this.b;
   }

   public boolean gs() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gt() {
      return this.c;
   }

   public boolean gw() {
      return true;
   }

   public void gx() {
      this.b = this.dp().b(-500 + this.ah.a(1000), 0, -500 + this.ah.a(1000));
      this.d = true;
   }

   protected boolean gy() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends cjd> extends bzm {
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
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dP().Y() < this.e;
         return this.b.gy() && this.b.p() == null && !this.b.cR() && this.b.gs() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gt();
         cca $$1 = this.b.K();
         if ($$1.l()) {
            List<cjd> $$2 = this.h();
            if (this.b.gy() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gr().a(this.b.dn(), 10.0)) {
               this.b.gx();
            } else {
               euk $$3 = euk.c(this.b.gr());
               euk $$4 = this.b.dn();
               euk $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               euk $$6 = $$3.d($$4).d().a(10.0).e($$4);
               io $$7 = io.a($$6);
               $$7 = this.b.dP().a(dwt.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dP().Y() + 200L;
               } else if ($$0) {
                  for (cjd $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cjd> h() {
         return this.b.dP().a(cjd.class, this.b.cK().g(16.0), $$0 -> $$0.gw() && !$$0.t(this.b));
      }

      private boolean i() {
         ayk $$0 = this.b.el();
         io $$1 = this.b.dP().a(dwt.a.f, this.b.dp().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.K().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
