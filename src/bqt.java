import javax.annotation.Nullable;

public class bqt {
   private final ja<bqv> a;
   @Nullable
   private final brv b;
   @Nullable
   private final brv c;
   @Nullable
   private final ewu d;

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

   private bqt(ja<bqv> $$0, @Nullable brv $$1, @Nullable brv $$2, @Nullable ewu $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bqt(ja<bqv> $$0, @Nullable brv $$1, @Nullable brv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bqt(ja<bqv> $$0, ewu $$1) {
      this($$0, null, null, $$1);
   }

   public bqt(ja<bqv> $$0, @Nullable brv $$1) {
      this($$0, $$1, $$1);
   }

   public bqt(ja<bqv> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public brv c() {
      return this.c;
   }

   @Nullable
   public brv d() {
      return this.b;
   }

   public xe a(bso $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bso $$5 = $$0.eY();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xe.a($$6, $$0.P_(), $$5.P_()) : xe.a($$1, $$0.P_());
      } else {
         xe $$2 = this.b == null ? this.c.P_() : this.b.P_();
         cuh $$4 = this.b instanceof bso $$3 ? $$3.fg() : cuh.i;
         return !$$4.d() && $$4.b(ke.f) ? xe.a($$1 + ".item", $$0.P_(), $$2, $$4.E()) : xe.a($$1, $$0.P_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bso && !(this.b instanceof cly);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cly $$0 && $$0.gm().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ewu h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.ds() : null;
      }
   }

   @Nullable
   public ewu i() {
      return this.d;
   }

   public boolean a(awt<bqv> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aks<bqv> $$0) {
      return this.a.a($$0);
   }

   public bqv j() {
      return this.a.a();
   }

   public ja<bqv> k() {
      return this.a;
   }
}
