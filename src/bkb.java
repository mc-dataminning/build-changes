import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bkb extends bur implements bjo {
   protected static final aee<Byte> bT = aeh.a(bkb.class, aeg.a);
   protected static final aee<Optional<UUID>> bU = aeh.a(bkb.class, aeg.q);
   private boolean bW;

   protected bkb(biu<? extends bkb> $$0, cpv $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, (byte)0);
      this.an.a(bU, Optional.empty());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aof.a(this.cK(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.x(true);
         } catch (Throwable var4) {
            this.x(false);
         }
      }

      this.bW = $$0.q("Sitting");
      this.y(this.bW);
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.fR();
   }

   protected void w(boolean $$0) {
      it $$1 = iv.M;
      if (!$$0) {
         $$1 = iv.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.w(true);
      } else if ($$0 == 6) {
         this.w(false);
      } else {
         super.b($$0);
      }
   }

   public boolean s() {
      return (this.an.b(bT) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 4));
      } else {
         this.an.b(bT, (byte)($$1 & -5));
      }

      this.t();
   }

   protected void t() {
   }

   public boolean y() {
      return (this.an.b(bT) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 1));
      } else {
         this.an.b(bT, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID d() {
      return this.an.b(bU).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   public void f(cbu $$0) {
      this.x(true);
      this.b($$0.cv());
      if ($$0 instanceof akr) {
         al.x.a((akr)$$0, this);
      }
   }

   @Override
   public boolean c(bjg $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bjg $$0) {
      return $$0 == this.O_();
   }

   public boolean a(bjg $$0, bjg $$1) {
      return true;
   }

   @Override
   public eio cf() {
      if (this.s()) {
         bjg $$0 = this.O_();
         if ($$0 != null) {
            return $$0.cf();
         }
      }

      return super.cf();
   }

   @Override
   public boolean s(biq $$0) {
      if (this.s()) {
         bjg $$1 = this.O_();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.s($$0);
         }
      }

      return super.s($$0);
   }

   @Override
   public void a(bho $$0) {
      if (!this.dL().B && this.dL().X().b(cpr.m) && this.O_() instanceof akr) {
         this.O_().a(this.eJ().a());
      }

      super.a($$0);
   }

   public boolean gd() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
