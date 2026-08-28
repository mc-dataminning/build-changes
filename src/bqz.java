import javax.annotation.Nullable;

public class bqz {
   private final jj<brb> a;
   @Nullable
   private final bsg b;
   @Nullable
   private final bsg c;
   @Nullable
   private final ewf d;

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

   private bqz(jj<brb> $$0, @Nullable bsg $$1, @Nullable bsg $$2, @Nullable ewf $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqz(jj<brb> $$0, @Nullable bsg $$1, @Nullable bsg $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqz(jj<brb> $$0, ewf $$1) {
      this($$0, null, null, $$1);
   }

   public bqz(jj<brb> $$0, @Nullable bsg $$1) {
      this($$0, $$1, $$1);
   }

   public bqz(jj<brb> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsg c() {
      return this.c;
   }

   @Nullable
   public bsg d() {
      return this.b;
   }

   public wu a(btb $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         btb $$5 = $$0.eN();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wu.a($$6, $$0.O_(), $$5.O_()) : wu.a($$1, $$0.O_());
      } else {
         wu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cuc $$4 = this.b instanceof btb $$3 ? $$3.eU() : cuc.l;
         return !$$4.e() && $$4.b(kn.g) ? wu.a($$1 + ".item", $$0.O_(), $$2, $$4.F()) : wu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof btb && !(this.b instanceof cmk);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmk $$0 && $$0.ga().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ewf h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.do() : null;
      }
   }

   @Nullable
   public ewf i() {
      return this.d;
   }

   public boolean a(awm<brb> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akj<brb> $$0) {
      return this.a.a($$0);
   }

   public brb j() {
      return this.a.a();
   }

   public jj<brb> k() {
      return this.a;
   }
}
