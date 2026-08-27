import javax.annotation.Nullable;

public class bjg {
   private final ib<bji> a;
   @Nullable
   private final bki b;
   @Nullable
   private final bki c;
   @Nullable
   private final eji d;

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

   private bjg(ib<bji> $$0, @Nullable bki $$1, @Nullable bki $$2, @Nullable eji $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bjg(ib<bji> $$0, @Nullable bki $$1, @Nullable bki $$2) {
      this($$0, $$1, $$2, null);
   }

   public bjg(ib<bji> $$0, eji $$1) {
      this($$0, null, null, $$1);
   }

   public bjg(ib<bji> $$0, @Nullable bki $$1) {
      this($$0, $$1, $$1);
   }

   public bjg(ib<bji> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bki c() {
      return this.c;
   }

   @Nullable
   public bki d() {
      return this.b;
   }

   public ur a(bky $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bky $$5 = $$0.eK();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ur.a($$6, $$0.O_(), $$5.O_()) : ur.a($$1, $$0.O_());
      } else {
         ur $$2 = this.b == null ? this.c.O_() : this.b.O_();
         clb $$4 = this.b instanceof bky $$3 ? $$3.eS() : clb.b;
         return !$$4.b() && $$4.A() ? ur.a($$1 + ".item", $$0.O_(), $$2, $$4.J()) : ur.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bky && !(this.b instanceof cdm);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cdm $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public eji h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public eji i() {
      return this.d;
   }

   public boolean a(arr<bji> $$0) {
      return this.a.a($$0);
   }

   public boolean a(agf<bji> $$0) {
      return this.a.a($$0);
   }

   public bji j() {
      return this.a.a();
   }

   public ib<bji> k() {
      return this.a;
   }
}
