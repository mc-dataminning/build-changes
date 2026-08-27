import javax.annotation.Nullable;

public class boy {
   private final in<bpa> a;
   @Nullable
   private final bqa b;
   @Nullable
   private final bqa c;
   @Nullable
   private final esj d;

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

   private boy(in<bpa> $$0, @Nullable bqa $$1, @Nullable bqa $$2, @Nullable esj $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public boy(in<bpa> $$0, @Nullable bqa $$1, @Nullable bqa $$2) {
      this($$0, $$1, $$2, null);
   }

   public boy(in<bpa> $$0, esj $$1) {
      this($$0, null, null, $$1);
   }

   public boy(in<bpa> $$0, @Nullable bqa $$1) {
      this($$0, $$1, $$1);
   }

   public boy(in<bpa> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bqa c() {
      return this.c;
   }

   @Nullable
   public bqa d() {
      return this.b;
   }

   public wi a(bqt $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bqt $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wi.a($$6, $$0.O_(), $$5.O_()) : wi.a($$1, $$0.O_());
      } else {
         wi $$2 = this.b == null ? this.c.O_() : this.b.O_();
         crs $$4 = this.b instanceof bqt $$3 ? $$3.eU() : crs.i;
         return !$$4.d() && $$4.b(jr.d) ? wi.a($$1 + ".item", $$0.O_(), $$2, $$4.E()) : wi.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bqt && !(this.b instanceof cka);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cka $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public esj h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public esj i() {
      return this.d;
   }

   public boolean a(avt<bpa> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aju<bpa> $$0) {
      return this.a.a($$0);
   }

   public bpa j() {
      return this.a.a();
   }

   public in<bpa> k() {
      return this.a;
   }
}
