import javax.annotation.Nullable;

public class bmn {
   private final ij<bmp> a;
   @Nullable
   private final bno b;
   @Nullable
   private final bno c;
   @Nullable
   private final ens d;

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

   private bmn(ij<bmp> $$0, @Nullable bno $$1, @Nullable bno $$2, @Nullable ens $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bmn(ij<bmp> $$0, @Nullable bno $$1, @Nullable bno $$2) {
      this($$0, $$1, $$2, null);
   }

   public bmn(ij<bmp> $$0, ens $$1) {
      this($$0, null, null, $$1);
   }

   public bmn(ij<bmp> $$0, @Nullable bno $$1) {
      this($$0, $$1, $$1);
   }

   public bmn(ij<bmp> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bno c() {
      return this.c;
   }

   @Nullable
   public bno d() {
      return this.b;
   }

   public vq a(bog $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bog $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vq.a($$6, $$0.Q_(), $$5.Q_()) : vq.a($$1, $$0.Q_());
      } else {
         vq $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         coz $$4 = this.b instanceof bog $$3 ? $$3.eT() : coz.h;
         return !$$4.b() && $$4.B() ? vq.a($$1 + ".item", $$0.Q_(), $$2, $$4.K()) : vq.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bog && !(this.b instanceof chh);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof chh $$0 && $$0.fU().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ens h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public ens i() {
      return this.d;
   }

   public boolean a(auo<bmp> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aix<bmp> $$0) {
      return this.a.a($$0);
   }

   public bmp j() {
      return this.a.a();
   }

   public ij<bmp> k() {
      return this.a;
   }
}
