import javax.annotation.Nullable;

public class bri {
   private final ji<brk> a;
   @Nullable
   private final bsp b;
   @Nullable
   private final bsp c;
   @Nullable
   private final evm d;

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

   private bri(ji<brk> $$0, @Nullable bsp $$1, @Nullable bsp $$2, @Nullable evm $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bri(ji<brk> $$0, @Nullable bsp $$1, @Nullable bsp $$2) {
      this($$0, $$1, $$2, null);
   }

   public bri(ji<brk> $$0, evm $$1) {
      this($$0, null, null, $$1);
   }

   public bri(ji<brk> $$0, @Nullable bsp $$1) {
      this($$0, $$1, $$1);
   }

   public bri(ji<brk> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsp c() {
      return this.c;
   }

   @Nullable
   public bsp d() {
      return this.b;
   }

   public xl a(btk $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btk $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xl.a($$6, $$0.O_(), $$5.O_()) : xl.a($$1, $$0.O_());
      } else {
         xl $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cuk $$4 = this.b instanceof btk $$3 ? $$3.eX() : cuk.l;
         return !$$4.e() && $$4.b(km.f) ? xl.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xl.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btk && !(this.b instanceof cms);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cms $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evm h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evm i() {
      return this.d;
   }

   public boolean a(axb<brk> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ala<brk> $$0) {
      return this.a.a($$0);
   }

   public brk j() {
      return this.a.a();
   }

   public ji<brk> k() {
      return this.a;
   }
}
