import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bjs extends bui implements bje {
   protected static final adx<Byte> bT = aea.a(bjs.class, adz.a);
   protected static final adx<Optional<UUID>> bU = aea.a(bjs.class, adz.q);
   private boolean bW;

   protected bjs(bik<? extends bjs> $$0, cpk $$1) {
      super($$0, $$1);
      this.q();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, (byte)0);
      this.an.a(bU, Optional.empty());
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.U_() != null) {
         $$0.a("Owner", this.U_());
      }

      $$0.a("Sitting", this.bW);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = anw.a(this.cK(), $$2);
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
   public boolean a(cbl $$0) {
      return !this.fO();
   }

   protected void w(boolean $$0) {
      iu $$1 = iw.M;
      if (!$$0) {
         $$1 = iw.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dK().a($$1, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   @Override
   public boolean p() {
      return (this.an.b(bT) & 4) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.an.b(bT);
      if ($$0) {
         this.an.b(bT, (byte)($$1 | 4));
      } else {
         this.an.b(bT, (byte)($$1 & -5));
      }

      this.q();
   }

   protected void q() {
   }

   public boolean t() {
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
   public UUID U_() {
      return this.an.b(bU).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   public void f(cbl $$0) {
      this.x(true);
      this.b($$0.cv());
      if ($$0 instanceof akj) {
         ai.x.a((akj)$$0, this);
      }
   }

   @Override
   public boolean c(biw $$0) {
      return this.l($$0) ? false : super.c($$0);
   }

   public boolean l(biw $$0) {
      return $$0 == this.I_();
   }

   public boolean a(biw $$0, biw $$1) {
      return true;
   }

   @Override
   public eig cf() {
      if (this.p()) {
         biw $$0 = this.I_();
         if ($$0 != null) {
            return $$0.cf();
         }
      }

      return super.cf();
   }

   @Override
   public boolean s(big $$0) {
      if (this.p()) {
         biw $$1 = this.I_();
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
   public void a(bhe $$0) {
      if (!this.dK().B && this.dK().X().b(cpg.m) && this.I_() instanceof akj) {
         this.I_().a(this.eI().a());
      }

      super.a($$0);
   }

   public boolean fZ() {
      return this.bW;
   }

   public void z(boolean $$0) {
      this.bW = $$0;
   }
}
