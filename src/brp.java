import javax.annotation.Nullable;

public class brp {
   private final ji<brr> a;
   @Nullable
   private final bsw b;
   @Nullable
   private final bsw c;
   @Nullable
   private final evt d;

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

   private brp(ji<brr> $$0, @Nullable bsw $$1, @Nullable bsw $$2, @Nullable evt $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brp(ji<brr> $$0, @Nullable bsw $$1, @Nullable bsw $$2) {
      this($$0, $$1, $$2, null);
   }

   public brp(ji<brr> $$0, evt $$1) {
      this($$0, null, null, $$1);
   }

   public brp(ji<brr> $$0, @Nullable bsw $$1) {
      this($$0, $$1, $$1);
   }

   public brp(ji<brr> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsw c() {
      return this.c;
   }

   @Nullable
   public bsw d() {
      return this.b;
   }

   public xp a(btr $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btr $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xp.a($$6, $$0.O_(), $$5.O_()) : xp.a($$1, $$0.O_());
      } else {
         xp $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cur $$4 = this.b instanceof btr $$3 ? $$3.eX() : cur.l;
         return !$$4.e() && $$4.b(km.g) ? xp.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xp.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btr && !(this.b instanceof cmz);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmz $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evt h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evt i() {
      return this.d;
   }

   public boolean a(axf<brr> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ale<brr> $$0) {
      return this.a.a($$0);
   }

   public brr j() {
      return this.a.a();
   }

   public ji<brr> k() {
      return this.a;
   }
}
