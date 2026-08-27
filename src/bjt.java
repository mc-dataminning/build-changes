import javax.annotation.Nullable;

public class bjt {
   private final ig<bjv> a;
   @Nullable
   private final bkv b;
   @Nullable
   private final bkv c;
   @Nullable
   private final ejz d;

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

   private bjt(ig<bjv> $$0, @Nullable bkv $$1, @Nullable bkv $$2, @Nullable ejz $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bjt(ig<bjv> $$0, @Nullable bkv $$1, @Nullable bkv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bjt(ig<bjv> $$0, ejz $$1) {
      this($$0, null, null, $$1);
   }

   public bjt(ig<bjv> $$0, @Nullable bkv $$1) {
      this($$0, $$1, $$1);
   }

   public bjt(ig<bjv> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bkv c() {
      return this.c;
   }

   @Nullable
   public bkv d() {
      return this.b;
   }

   public uv a(bll $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bll $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? uv.a($$6, $$0.Q_(), $$5.Q_()) : uv.a($$1, $$0.Q_());
      } else {
         uv $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         clo $$4 = this.b instanceof bll $$3 ? $$3.eU() : clo.b;
         return !$$4.b() && $$4.A() ? uv.a($$1 + ".item", $$0.Q_(), $$2, $$4.J()) : uv.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bll && !(this.b instanceof cdz);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cdz $$0 && $$0.fU().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ejz h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dl() : null;
      }
   }

   @Nullable
   public ejz i() {
      return this.d;
   }

   public boolean a(arz<bjv> $$0) {
      return this.a.a($$0);
   }

   public boolean a(agl<bjv> $$0) {
      return this.a.a($$0);
   }

   public bjv j() {
      return this.a.a();
   }

   public ig<bjv> k() {
      return this.a;
   }
}
