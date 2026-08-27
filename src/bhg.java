import javax.annotation.Nullable;

public class bhg {
   private final he<bhi> a;
   @Nullable
   private final bii b;
   @Nullable
   private final bii c;
   @Nullable
   private final ehe d;

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

   private bhg(he<bhi> $$0, @Nullable bii $$1, @Nullable bii $$2, @Nullable ehe $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bhg(he<bhi> $$0, @Nullable bii $$1, @Nullable bii $$2) {
      this($$0, $$1, $$2, null);
   }

   public bhg(he<bhi> $$0, ehe $$1) {
      this($$0, null, null, $$1);
   }

   public bhg(he<bhi> $$0, @Nullable bii $$1) {
      this($$0, $$1, $$1);
   }

   public bhg(he<bhi> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bii c() {
      return this.c;
   }

   @Nullable
   public bii d() {
      return this.b;
   }

   public tf a(biy $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         biy $$5 = $$0.eJ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? tf.a($$6, $$0.H_(), $$5.H_()) : tf.a($$1, $$0.H_());
      } else {
         tf $$2 = this.b == null ? this.c.H_() : this.b.H_();
         ciy $$4 = this.b instanceof biy $$3 ? $$3.eR() : ciy.b;
         return !$$4.b() && $$4.A() ? tf.a($$1 + ".item", $$0.H_(), $$2, $$4.J()) : tf.a($$1, $$0.H_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof biy && !(this.b instanceof cbn);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cbn $$0 && $$0.fR().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehe h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.di() : null;
      }
   }

   @Nullable
   public ehe i() {
      return this.d;
   }

   public boolean a(aqa<bhi> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aeq<bhi> $$0) {
      return this.a.a($$0);
   }

   public bhi j() {
      return this.a.a();
   }

   public he<bhi> k() {
      return this.a;
   }
}
