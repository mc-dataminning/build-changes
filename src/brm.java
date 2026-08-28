import javax.annotation.Nullable;

public class brm {
   private final ji<bro> a;
   @Nullable
   private final bst b;
   @Nullable
   private final bst c;
   @Nullable
   private final evq d;

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

   private brm(ji<bro> $$0, @Nullable bst $$1, @Nullable bst $$2, @Nullable evq $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brm(ji<bro> $$0, @Nullable bst $$1, @Nullable bst $$2) {
      this($$0, $$1, $$2, null);
   }

   public brm(ji<bro> $$0, evq $$1) {
      this($$0, null, null, $$1);
   }

   public brm(ji<bro> $$0, @Nullable bst $$1) {
      this($$0, $$1, $$1);
   }

   public brm(ji<bro> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bst c() {
      return this.c;
   }

   @Nullable
   public bst d() {
      return this.b;
   }

   public xo a(bto $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bto $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xo.a($$6, $$0.O_(), $$5.O_()) : xo.a($$1, $$0.O_());
      } else {
         xo $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cuo $$4 = this.b instanceof bto $$3 ? $$3.eX() : cuo.l;
         return !$$4.e() && $$4.b(km.g) ? xo.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xo.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bto && !(this.b instanceof cmw);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmw $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evq h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evq i() {
      return this.d;
   }

   public boolean a(axe<bro> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ald<bro> $$0) {
      return this.a.a($$0);
   }

   public bro j() {
      return this.a.a();
   }

   public ji<bro> k() {
      return this.a;
   }
}
