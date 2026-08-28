import javax.annotation.Nullable;

public class bsb {
   private final jn<bsd> a;
   @Nullable
   private final btj b;
   @Nullable
   private final btj c;
   @Nullable
   private final eye d;

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

   private bsb(jn<bsd> $$0, @Nullable btj $$1, @Nullable btj $$2, @Nullable eye $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsb(jn<bsd> $$0, @Nullable btj $$1, @Nullable btj $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsb(jn<bsd> $$0, eye $$1) {
      this($$0, null, null, $$1);
   }

   public bsb(jn<bsd> $$0, @Nullable btj $$1) {
      this($$0, $$1, $$1);
   }

   public bsb(jn<bsd> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public btj c() {
      return this.c;
   }

   @Nullable
   public btj d() {
      return this.b;
   }

   @Nullable
   public cvl e() {
      return this.c != null ? this.c.dW() : null;
   }

   public xd a(buf $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         buf $$5 = $$0.eP();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xd.a($$6, $$0.Q_(), $$5.Q_()) : xd.a($$1, $$0.Q_());
      } else {
         xd $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cvl $$4 = this.b instanceof buf $$3 ? $$3.eW() : cvl.k;
         return !$$4.f() && $$4.b(kr.g) ? xd.a($$1 + ".item", $$0.Q_(), $$2, $$4.H()) : xd.a($$1, $$0.Q_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof buf && !(this.b instanceof cnp);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cnp $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eye i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dq() : null;
      }
   }

   @Nullable
   public eye j() {
      return this.d;
   }

   public boolean a(axi<bsd> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ala<bsd> $$0) {
      return this.a.a($$0);
   }

   public bsd k() {
      return this.a.a();
   }

   public jn<bsd> l() {
      return this.a;
   }
}
