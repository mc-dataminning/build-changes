import javax.annotation.Nullable;

public class bkv {
   private final ih<bkx> a;
   @Nullable
   private final blw b;
   @Nullable
   private final blw c;
   @Nullable
   private final emc d;

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

   private bkv(ih<bkx> $$0, @Nullable blw $$1, @Nullable blw $$2, @Nullable emc $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bkv(ih<bkx> $$0, @Nullable blw $$1, @Nullable blw $$2) {
      this($$0, $$1, $$2, null);
   }

   public bkv(ih<bkx> $$0, emc $$1) {
      this($$0, null, null, $$1);
   }

   public bkv(ih<bkx> $$0, @Nullable blw $$1) {
      this($$0, $$1, $$1);
   }

   public bkv(ih<bkx> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public blw c() {
      return this.c;
   }

   @Nullable
   public blw d() {
      return this.b;
   }

   public vg a(bmo $$0) {
      String $$1 = "death.attack." + this.j().a();
      if (this.b == null && this.c == null) {
         bmo $$5 = $$0.eL();
         String $$6 = $$1 + ".player";
         return $$5 != null ? vg.a($$6, $$0.Q_(), $$5.Q_()) : vg.a($$1, $$0.Q_());
      } else {
         vg $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         cng $$4 = this.b instanceof bmo $$3 ? $$3.eT() : cng.f;
         return !$$4.b() && $$4.A() ? vg.a($$1 + ".item", $$0.Q_(), $$2, $$4.J()) : vg.a($$1, $$0.Q_(), $$2);
      }
   }

   public String e() {
      return this.j().a();
   }

   public boolean f() {
      return switch (this.j().b()) {
         case a -> false;
         case b -> this.b instanceof bmo && !(this.b instanceof cfq);
         case c -> true;
      };
   }

   public boolean g() {
      if (this.d() instanceof cfq $$0 && $$0.fT().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public emc h() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dj() : null;
      }
   }

   @Nullable
   public emc i() {
      return this.d;
   }

   public boolean a(asx<bkx> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ahg<bkx> $$0) {
      return this.a.a($$0);
   }

   public bkx j() {
      return this.a.a();
   }

   public ih<bkx> k() {
      return this.a;
   }
}
