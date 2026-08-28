import javax.annotation.Nullable;

public class brl {
   private final ji<brn> a;
   @Nullable
   private final bss b;
   @Nullable
   private final bss c;
   @Nullable
   private final evp d;

   @Override
   public String toString() {
      return "DamageSource (" + this.j().a() + ")";
   }

   public float a() {
      return this.j().c();
   }

   public boolean b() {
      return this.b != this.c;
   }

   private brl(ji<brn> $$0, @Nullable bss $$1, @Nullable bss $$2, @Nullable evp $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brl(ji<brn> $$0, @Nullable bss $$1, @Nullable bss $$2) {
      this($$0, $$1, $$2, null);
   }

   public brl(ji<brn> $$0, evp $$1) {
      this($$0, null, null, $$1);
   }

   public brl(ji<brn> $$0, @Nullable bss $$1) {
      this($$0, $$1, $$1);
   }

   public brl(ji<brn> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bss c() {
      return this.c;
   }

   @Nullable
   public bss d() {
      return this.b;
   }

   public xo a(btn $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btn $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xo.a($$6, $$0.O_(), $$5.O_()) : xo.a($$1, $$0.O_());
      } else {
         xo $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cun $$4 = this.b instanceof btn $$3 ? $$3.eX() : cun.l;
         return !$$4.e() && $$4.b(km.f) ? xo.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xo.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btn && !(this.b instanceof cmv);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmv $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evp h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evp i() {
      return this.d;
   }

   public boolean a(axe<brn> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ald<brn> $$0) {
      return this.a.a($$0);
   }

   public brn j() {
      return this.a.a();
   }

   public ji<brn> k() {
      return this.a;
   }
}
