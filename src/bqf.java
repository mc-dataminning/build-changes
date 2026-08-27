import javax.annotation.Nullable;

public class bqf {
   private final iw<bqh> a;
   @Nullable
   private final brh b;
   @Nullable
   private final brh c;
   @Nullable
   private final etp d;

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

   private bqf(iw<bqh> $$0, @Nullable brh $$1, @Nullable brh $$2, @Nullable etp $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqf(iw<bqh> $$0, @Nullable brh $$1, @Nullable brh $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqf(iw<bqh> $$0, etp $$1) {
      this($$0, null, null, $$1);
   }

   public bqf(iw<bqh> $$0, @Nullable brh $$1) {
      this($$0, $$1, $$1);
   }

   public bqf(iw<bqh> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public brh c() {
      return this.c;
   }

   @Nullable
   public brh d() {
      return this.b;
   }

   public wu a(bsa $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bsa $$5 = $$0.eO();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wu.a($$6, $$0.O_(), $$5.O_()) : wu.a($$1, $$0.O_());
      } else {
         wu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         csz $$4 = this.b instanceof bsa $$3 ? $$3.eV() : csz.i;
         return !$$4.d() && $$4.b(ka.f) ? wu.a($$1 + ".item", $$0.O_(), $$2, $$4.E()) : wu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bsa && !(this.b instanceof clh);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof clh $$0 && $$0.gb().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public etp h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dl() : null;
      }
   }

   @Nullable
   public etp i() {
      return this.d;
   }

   public boolean a(awg<bqh> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akg<bqh> $$0) {
      return this.a.a($$0);
   }

   public bqh j() {
      return this.a.a();
   }

   public iw<bqh> k() {
      return this.a;
   }
}
