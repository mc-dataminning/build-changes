import javax.annotation.Nullable;

public class bjo {
   private final ib<bjq> a;
   @Nullable
   private final bkq b;
   @Nullable
   private final bkq c;
   @Nullable
   private final eju d;

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

   private bjo(ib<bjq> $$0, @Nullable bkq $$1, @Nullable bkq $$2, @Nullable eju $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bjo(ib<bjq> $$0, @Nullable bkq $$1, @Nullable bkq $$2) {
      this($$0, $$1, $$2, null);
   }

   public bjo(ib<bjq> $$0, eju $$1) {
      this($$0, null, null, $$1);
   }

   public bjo(ib<bjq> $$0, @Nullable bkq $$1) {
      this($$0, $$1, $$1);
   }

   public bjo(ib<bjq> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bkq c() {
      return this.c;
   }

   @Nullable
   public bkq d() {
      return this.b;
   }

   public ur a(blg $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         blg $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ur.a($$6, $$0.P_(), $$5.P_()) : ur.a($$1, $$0.P_());
      } else {
         ur $$2 = this.b == null ? this.c.P_() : this.b.P_();
         clj $$4 = this.b instanceof blg $$3 ? $$3.eU() : clj.b;
         return !$$4.b() && $$4.A() ? ur.a($$1 + ".item", $$0.P_(), $$2, $$4.J()) : ur.a($$1, $$0.P_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof blg && !(this.b instanceof cdu);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cdu $$0 && $$0.fU().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eju h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dl() : null;
      }
   }

   @Nullable
   public eju i() {
      return this.d;
   }

   public boolean a(arv<bjq> $$0) {
      return this.a.a($$0);
   }

   public boolean a(agh<bjq> $$0) {
      return this.a.a($$0);
   }

   public bjq j() {
      return this.a.a();
   }

   public ib<bjq> k() {
      return this.a;
   }
}
