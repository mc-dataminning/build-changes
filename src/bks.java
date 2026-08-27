import javax.annotation.Nullable;

public class bks {
   private final ih<bku> a;
   @Nullable
   private final blu b;
   @Nullable
   private final blu c;
   @Nullable
   private final els d;

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

   private bks(ih<bku> $$0, @Nullable blu $$1, @Nullable blu $$2, @Nullable els $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bks(ih<bku> $$0, @Nullable blu $$1, @Nullable blu $$2) {
      this($$0, $$1, $$2, null);
   }

   public bks(ih<bku> $$0, els $$1) {
      this($$0, null, null, $$1);
   }

   public bks(ih<bku> $$0, @Nullable blu $$1) {
      this($$0, $$1, $$1);
   }

   public bks(ih<bku> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public blu c() {
      return this.c;
   }

   @Nullable
   public blu d() {
      return this.b;
   }

   public vf a(bmk $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bmk $$5 = $$0.eL();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vf.a($$6, $$0.Q_(), $$5.Q_()) : vf.a($$1, $$0.Q_());
      } else {
         vf $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cmx $$4 = this.b instanceof bmk $$3 ? $$3.eT() : cmx.f;
         return !$$4.b() && $$4.A() ? vf.a($$1 + ".item", $$0.Q_(), $$2, $$4.J()) : vf.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bmk && !(this.b instanceof cfh);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cfh $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public els h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dk() : null;
      }
   }

   @Nullable
   public els i() {
      return this.d;
   }

   public boolean a(asv<bku> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ahf<bku> $$0) {
      return this.a.a($$0);
   }

   public bku j() {
      return this.a.a();
   }

   public ih<bku> k() {
      return this.a;
   }
}
