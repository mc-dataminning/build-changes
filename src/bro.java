import javax.annotation.Nullable;

public class bro {
   private final ji<brq> a;
   @Nullable
   private final bsv b;
   @Nullable
   private final bsv c;
   @Nullable
   private final evs d;

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

   private bro(ji<brq> $$0, @Nullable bsv $$1, @Nullable bsv $$2, @Nullable evs $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bro(ji<brq> $$0, @Nullable bsv $$1, @Nullable bsv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bro(ji<brq> $$0, evs $$1) {
      this($$0, null, null, $$1);
   }

   public bro(ji<brq> $$0, @Nullable bsv $$1) {
      this($$0, $$1, $$1);
   }

   public bro(ji<brq> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsv c() {
      return this.c;
   }

   @Nullable
   public bsv d() {
      return this.b;
   }

   public xp a(btq $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btq $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xp.a($$6, $$0.O_(), $$5.O_()) : xp.a($$1, $$0.O_());
      } else {
         xp $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cuq $$4 = this.b instanceof btq $$3 ? $$3.eX() : cuq.l;
         return !$$4.e() && $$4.b(km.g) ? xp.a($$1 + ".item", $$0.O_(), $$2, $$4.G()) : xp.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btq && !(this.b instanceof cmy);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmy $$0 && $$0.gd().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evs h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evs i() {
      return this.d;
   }

   public boolean a(axf<brq> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ale<brq> $$0) {
      return this.a.a($$0);
   }

   public brq j() {
      return this.a.a();
   }

   public ji<brq> k() {
      return this.a;
   }
}
