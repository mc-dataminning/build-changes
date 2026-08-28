import javax.annotation.Nullable;

public class btv {
   private final jq<btx> a;
   @Nullable
   private final bvf b;
   @Nullable
   private final bvf c;
   @Nullable
   private final fbs d;

   @Override
   public String toString() {
      return "DamageSource (" + this.k().a() + ")";
   }

   public float a() {
      return this.k().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private btv(jq<btx> $$0, @Nullable bvf $$1, @Nullable bvf $$2, @Nullable fbs $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btv(jq<btx> $$0, @Nullable bvf $$1, @Nullable bvf $$2) {
      this($$0, $$1, $$2, null);
   }

   public btv(jq<btx> $$0, fbs $$1) {
      this($$0, null, null, $$1);
   }

   public btv(jq<btx> $$0, @Nullable bvf $$1) {
      this($$0, $$1, $$1);
   }

   public btv(jq<btx> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bvf c() {
      return this.c;
   }

   @Nullable
   public bvf d() {
      return this.b;
   }

   @Nullable
   public cxk e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public xv a(bwb $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bwb $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xv.a($$6, $$0.p_(), $$5.p_()) : xv.a($$1, $$0.p_());
      } else {
         xv $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cxk $$4 = this.b instanceof bwb $$3 ? $$3.eX() : cxk.k;
         return !$$4.f() && $$4.b(ku.g) ? xv.a($$1 + ".item", $$0.p_(), $$2, $$4.J()) : xv.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bwb && !(this.b instanceof cps);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cps $$0 && $$0.gh().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fbs i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fbs j() {
      return this.d;
   }

   public boolean a(ayk<btx> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aly<btx> $$0) {
      return this.a.a($$0);
   }

   public btx k() {
      return this.a.a();
   }

   public jq<btx> l() {
      return this.a;
   }
}
