import javax.annotation.Nullable;

public class bkt {
   private final ih<bkv> a;
   @Nullable
   private final blv b;
   @Nullable
   private final blv c;
   @Nullable
   private final elt d;

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

   private bkt(ih<bkv> $$0, @Nullable blv $$1, @Nullable blv $$2, @Nullable elt $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bkt(ih<bkv> $$0, @Nullable blv $$1, @Nullable blv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bkt(ih<bkv> $$0, elt $$1) {
      this($$0, null, null, $$1);
   }

   public bkt(ih<bkv> $$0, @Nullable blv $$1) {
      this($$0, $$1, $$1);
   }

   public bkt(ih<bkv> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public blv c() {
      return this.c;
   }

   @Nullable
   public blv d() {
      return this.b;
   }

   public vf a(bml $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bml $$5 = $$0.eL();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vf.a($$6, $$0.Q_(), $$5.Q_()) : vf.a($$1, $$0.Q_());
      } else {
         vf $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cmy $$4 = this.b instanceof bml $$3 ? $$3.eT() : cmy.f;
         return !$$4.b() && $$4.A() ? vf.a($$1 + ".item", $$0.Q_(), $$2, $$4.J()) : vf.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bml && !(this.b instanceof cfi);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cfi $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public elt h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public elt i() {
      return this.d;
   }

   public boolean a(asw<bkv> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ahf<bkv> $$0) {
      return this.a.a($$0);
   }

   public bkv j() {
      return this.a.a();
   }

   public ih<bkv> k() {
      return this.a;
   }
}
