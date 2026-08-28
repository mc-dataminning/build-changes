import javax.annotation.Nullable;

public class bsj {
   private final jo<bsl> a;
   @Nullable
   private final btr b;
   @Nullable
   private final btr c;
   @Nullable
   private final eyw d;

   @Override
   public String toString() {
      return "DamageSource (" + this.k().a() + ")";
   }

   public float a() {
      return this.k().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private bsj(jo<bsl> $$0, @Nullable btr $$1, @Nullable btr $$2, @Nullable eyw $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsj(jo<bsl> $$0, @Nullable btr $$1, @Nullable btr $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsj(jo<bsl> $$0, eyw $$1) {
      this($$0, null, null, $$1);
   }

   public bsj(jo<bsl> $$0, @Nullable btr $$1) {
      this($$0, $$1, $$1);
   }

   public bsj(jo<bsl> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public btr c() {
      return this.c;
   }

   @Nullable
   public btr d() {
      return this.b;
   }

   @Nullable
   public cvs e() {
      return this.c != null ? this.c.dW() : null;
   }

   public xe a(bun $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bun $$5 = $$0.eP();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xe.a($$6, $$0.R_(), $$5.R_()) : xe.a($$1, $$0.R_());
      } else {
         xe $$2 = this.b == null ? this.c.R_() : this.b.R_();
         cvs $$4 = this.b instanceof bun $$3 ? $$3.eW() : cvs.k;
         return !$$4.f() && $$4.b(ks.g) ? xe.a($$1 + ".item", $$0.R_(), $$2, $$4.I()) : xe.a($$1, $$0.R_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bun && !(this.b instanceof cnx);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cnx $$0 && $$0.ge().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eyw i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dq() : null;
      }
   }

   @Nullable
   public eyw j() {
      return this.d;
   }

   public boolean a(axl<bsl> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ald<bsl> $$0) {
      return this.a.a($$0);
   }

   public bsl k() {
      return this.a.a();
   }

   public jo<bsl> l() {
      return this.a;
   }
}
