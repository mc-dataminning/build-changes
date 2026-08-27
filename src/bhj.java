import javax.annotation.Nullable;

public class bhj {
   private final hg<bhl> a;
   @Nullable
   private final bil b;
   @Nullable
   private final bil c;
   @Nullable
   private final ehi d;

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

   private bhj(hg<bhl> $$0, @Nullable bil $$1, @Nullable bil $$2, @Nullable ehi $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bhj(hg<bhl> $$0, @Nullable bil $$1, @Nullable bil $$2) {
      this($$0, $$1, $$2, null);
   }

   public bhj(hg<bhl> $$0, ehi $$1) {
      this($$0, null, null, $$1);
   }

   public bhj(hg<bhl> $$0, @Nullable bil $$1) {
      this($$0, $$1, $$1);
   }

   public bhj(hg<bhl> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bil c() {
      return this.c;
   }

   @Nullable
   public bil d() {
      return this.b;
   }

   public ti a(bjb $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bjb $$5 = $$0.eJ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ti.a($$6, $$0.H_(), $$5.H_()) : ti.a($$1, $$0.H_());
      } else {
         ti $$2 = this.b == null ? this.c.H_() : this.b.H_();
         cja $$4 = this.b instanceof bjb $$3 ? $$3.eR() : cja.b;
         return !$$4.b() && $$4.A() ? ti.a($$1 + ".item", $$0.H_(), $$2, $$4.J()) : ti.a($$1, $$0.H_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bjb && !(this.b instanceof cbp);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cbp $$0 && $$0.fR().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ehi h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.di() : null;
      }
   }

   @Nullable
   public ehi i() {
      return this.d;
   }

   public boolean a(aqd<bhl> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aet<bhl> $$0) {
      return this.a.a($$0);
   }

   public bhl j() {
      return this.a.a();
   }

   public hg<bhl> k() {
      return this.a;
   }
}
