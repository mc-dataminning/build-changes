import javax.annotation.Nullable;

public class bsg {
   private final jn<bsi> a;
   @Nullable
   private final bto b;
   @Nullable
   private final bto c;
   @Nullable
   private final eys d;

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

   private bsg(jn<bsi> $$0, @Nullable bto $$1, @Nullable bto $$2, @Nullable eys $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsg(jn<bsi> $$0, @Nullable bto $$1, @Nullable bto $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsg(jn<bsi> $$0, eys $$1) {
      this($$0, null, null, $$1);
   }

   public bsg(jn<bsi> $$0, @Nullable bto $$1) {
      this($$0, $$1, $$1);
   }

   public bsg(jn<bsi> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bto c() {
      return this.c;
   }

   @Nullable
   public bto d() {
      return this.b;
   }

   @Nullable
   public cvp e() {
      return this.c != null ? this.c.dW() : null;
   }

   public xd a(buk $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         buk $$5 = $$0.eP();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xd.a($$6, $$0.Q_(), $$5.Q_()) : xd.a($$1, $$0.Q_());
      } else {
         xd $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cvp $$4 = this.b instanceof buk $$3 ? $$3.eW() : cvp.k;
         return !$$4.f() && $$4.b(kr.g) ? xd.a($$1 + ".item", $$0.Q_(), $$2, $$4.H()) : xd.a($$1, $$0.Q_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof buk && !(this.b instanceof cnu);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cnu $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eys i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dq() : null;
      }
   }

   @Nullable
   public eys j() {
      return this.d;
   }

   public boolean a(axj<bsi> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alb<bsi> $$0) {
      return this.a.a($$0);
   }

   public bsi k() {
      return this.a.a();
   }

   public jn<bsi> l() {
      return this.a;
   }
}
