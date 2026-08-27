import javax.annotation.Nullable;

public class bhe {
   private final hf<bhg> a;
   @Nullable
   private final big b;
   @Nullable
   private final big c;
   @Nullable
   private final ehf d;

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

   private bhe(hf<bhg> $$0, @Nullable big $$1, @Nullable big $$2, @Nullable ehf $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bhe(hf<bhg> $$0, @Nullable big $$1, @Nullable big $$2) {
      this($$0, $$1, $$2, null);
   }

   public bhe(hf<bhg> $$0, ehf $$1) {
      this($$0, null, null, $$1);
   }

   public bhe(hf<bhg> $$0, @Nullable big $$1) {
      this($$0, $$1, $$1);
   }

   public bhe(hf<bhg> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public big c() {
      return this.c;
   }

   @Nullable
   public big d() {
      return this.b;
   }

   public te a(biw $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         biw $$5 = $$0.eJ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? te.a($$6, $$0.H_(), $$5.H_()) : te.a($$1, $$0.H_());
      } else {
         te $$2 = this.b == null ? this.c.H_() : this.b.H_();
         ciw $$4 = this.b instanceof biw $$3 ? $$3.eR() : ciw.b;
         return !$$4.b() && $$4.A() ? te.a($$1 + ".item", $$0.H_(), $$2, $$4.J()) : te.a($$1, $$0.H_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof biw && !(this.b instanceof cbl);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cbl $$0 && $$0.fR().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehf h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.di() : null;
      }
   }

   @Nullable
   public ehf i() {
      return this.d;
   }

   public boolean a(apy<bhg> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aeo<bhg> $$0) {
      return this.a.a($$0);
   }

   public bhg j() {
      return this.a.a();
   }

   public hf<bhg> k() {
      return this.a;
   }
}
