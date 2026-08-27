import javax.annotation.Nullable;

public class bmp {
   private final ij<bmr> a;
   @Nullable
   private final bnq b;
   @Nullable
   private final bnq c;
   @Nullable
   private final enz d;

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

   private bmp(ij<bmr> $$0, @Nullable bnq $$1, @Nullable bnq $$2, @Nullable enz $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bmp(ij<bmr> $$0, @Nullable bnq $$1, @Nullable bnq $$2) {
      this($$0, $$1, $$2, null);
   }

   public bmp(ij<bmr> $$0, enz $$1) {
      this($$0, null, null, $$1);
   }

   public bmp(ij<bmr> $$0, @Nullable bnq $$1) {
      this($$0, $$1, $$1);
   }

   public bmp(ij<bmr> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bnq c() {
      return this.c;
   }

   @Nullable
   public bnq d() {
      return this.b;
   }

   public vq a(boi $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         boi $$5 = $$0.eM();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vq.a($$6, $$0.Q_(), $$5.Q_()) : vq.a($$1, $$0.Q_());
      } else {
         vq $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cpd $$4 = this.b instanceof boi $$3 ? $$3.eT() : cpd.h;
         return !$$4.b() && $$4.B() ? vq.a($$1 + ".item", $$0.Q_(), $$2, $$4.K()) : vq.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof boi && !(this.b instanceof chl);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof chl $$0 && $$0.fU().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public enz h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public enz i() {
      return this.d;
   }

   public boolean a(aup<bmr> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aix<bmr> $$0) {
      return this.a.a($$0);
   }

   public bmr j() {
      return this.a.a();
   }

   public ij<bmr> k() {
      return this.a;
   }
}
