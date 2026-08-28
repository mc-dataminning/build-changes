import javax.annotation.Nullable;

public class brk {
   private final jm<brm> a;
   @Nullable
   private final bsr b;
   @Nullable
   private final bsr c;
   @Nullable
   private final exc d;

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

   private brk(jm<brm> $$0, @Nullable bsr $$1, @Nullable bsr $$2, @Nullable exc $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public brk(jm<brm> $$0, @Nullable bsr $$1, @Nullable bsr $$2) {
      this($$0, $$1, $$2, null);
   }

   public brk(jm<brm> $$0, exc $$1) {
      this($$0, null, null, $$1);
   }

   public brk(jm<brm> $$0, @Nullable bsr $$1) {
      this($$0, $$1, $$1);
   }

   public brk(jm<brm> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsr c() {
      return this.c;
   }

   @Nullable
   public bsr d() {
      return this.b;
   }

   @Nullable
   public cuq e() {
      return this.c != null ? this.c.dS() : null;
   }

   public wz a(btn $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         btn $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wz.a($$6, $$0.S_(), $$5.S_()) : wz.a($$1, $$0.S_());
      } else {
         wz $$2 = this.b == null ? this.c.S_() : this.b.S_();
         cuq $$4 = this.b instanceof btn $$3 ? $$3.eT() : cuq.l;
         return !$$4.e() && $$4.b(kq.g) ? wz.a($$1 + ".item", $$0.S_(), $$2, $$4.F()) : wz.a($$1, $$0.S_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof btn && !(this.b instanceof cmx);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cmx $$0 && $$0.fZ().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public exc i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dm() : null;
      }
   }

   @Nullable
   public exc j() {
      return this.d;
   }

   public boolean a(awu<brm> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akq<brm> $$0) {
      return this.a.a($$0);
   }

   public brm k() {
      return this.a.a();
   }

   public jm<brm> l() {
      return this.a;
   }
}
