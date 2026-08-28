import javax.annotation.Nullable;

public class bqw {
   private final jj<bqy> a;
   @Nullable
   private final bsd b;
   @Nullable
   private final bsd c;
   @Nullable
   private final evz d;

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

   private bqw(jj<bqy> $$0, @Nullable bsd $$1, @Nullable bsd $$2, @Nullable evz $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqw(jj<bqy> $$0, @Nullable bsd $$1, @Nullable bsd $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqw(jj<bqy> $$0, evz $$1) {
      this($$0, null, null, $$1);
   }

   public bqw(jj<bqy> $$0, @Nullable bsd $$1) {
      this($$0, $$1, $$1);
   }

   public bqw(jj<bqy> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bsd c() {
      return this.c;
   }

   @Nullable
   public bsd d() {
      return this.b;
   }

   public wu a(bsy $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bsy $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wu.a($$6, $$0.O_(), $$5.O_()) : wu.a($$1, $$0.O_());
      } else {
         wu $$2 = this.b == null ? this.c.O_() : this.b.O_();
         cua $$4 = this.b instanceof bsy $$3 ? $$3.eT() : cua.l;
         return !$$4.e() && $$4.b(kn.g) ? wu.a($$1 + ".item", $$0.O_(), $$2, $$4.F()) : wu.a($$1, $$0.O_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bsy && !(this.b instanceof cmh);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cmh $$0 && $$0.fZ().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public evz h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dn() : null;
      }
   }

   @Nullable
   public evz i() {
      return this.d;
   }

   public boolean a(awk<bqy> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akj<bqy> $$0) {
      return this.a.a($$0);
   }

   public bqy j() {
      return this.a.a();
   }

   public jj<bqy> k() {
      return this.a;
   }
}
