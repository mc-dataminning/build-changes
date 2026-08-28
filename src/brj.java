import javax.annotation.Nullable;

public class brj {
   private final jm<brl> a;
   @Nullable
   private final bsq b;
   @Nullable
   private final bsq c;
   @Nullable
   private final eww d;

   @Override
   public String toString() {
      return "DamageSource (" + this.j().a() + ")";
   }

   public float a() {
      return this.j().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private brj(jm<brl> $$0, @Nullable bsq $$1, @Nullable bsq $$2, @Nullable eww $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brj(jm<brl> $$0, @Nullable bsq $$1, @Nullable bsq $$2) {
      this($$0, $$1, $$2, null);
   }

   public brj(jm<brl> $$0, eww $$1) {
      this($$0, null, null, $$1);
   }

   public brj(jm<brl> $$0, @Nullable bsq $$1) {
      this($$0, $$1, $$1);
   }

   public brj(jm<brl> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsq c() {
      return this.c;
   }

   @Nullable
   public bsq d() {
      return this.b;
   }

   public wy a(btl $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btl $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wy.a($$6, $$0.O_(), $$5.O_()) : wy.a($$1, $$0.O_());
      } else {
         wy $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cuo $$4 = this.b instanceof btl $$3 ? $$3.eU() : cuo.l;
         return !$$4.e() && $$4.b(kq.g) ? wy.a($$1 + ".item", $$0.O_(), $$2, $$4.F()) : wy.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btl && !(this.b instanceof cmv);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmv $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eww h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.do() : null;
      }
   }

   @Nullable
   public eww i() {
      return this.d;
   }

   public boolean a(awt<brl> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akp<brl> $$0) {
      return this.a.a($$0);
   }

   public brl j() {
      return this.a.a();
   }

   public jm<brl> k() {
      return this.a;
   }
}
