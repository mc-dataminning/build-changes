import javax.annotation.Nullable;

public class brn {
   private final ji<brp> a;
   @Nullable
   private final bsu b;
   @Nullable
   private final bsu c;
   @Nullable
   private final evr d;

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

   private brn(ji<brp> $$0, @Nullable bsu $$1, @Nullable bsu $$2, @Nullable evr $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brn(ji<brp> $$0, @Nullable bsu $$1, @Nullable bsu $$2) {
      this($$0, $$1, $$2, null);
   }

   public brn(ji<brp> $$0, evr $$1) {
      this($$0, null, null, $$1);
   }

   public brn(ji<brp> $$0, @Nullable bsu $$1) {
      this($$0, $$1, $$1);
   }

   public brn(ji<brp> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsu c() {
      return this.c;
   }

   @Nullable
   public bsu d() {
      return this.b;
   }

   public xp a(btp $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btp $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xp.a($$6, $$0.O_(), $$5.O_()) : xp.a($$1, $$0.O_());
      } else {
         xp $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cup $$4 = this.b instanceof btp $$3 ? $$3.eX() : cup.l;
         return !$$4.e() && $$4.b(km.g) ? xp.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xp.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btp && !(this.b instanceof cmx);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmx $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evr h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evr i() {
      return this.d;
   }

   public boolean a(axf<brp> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ale<brp> $$0) {
      return this.a.a($$0);
   }

   public brp j() {
      return this.a.a();
   }

   public ji<brp> k() {
      return this.a;
   }
}
