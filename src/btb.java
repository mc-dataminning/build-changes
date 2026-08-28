import javax.annotation.Nullable;

public class btb {
   private final jq<btd> a;
   @Nullable
   private final bul b;
   @Nullable
   private final bul c;
   @Nullable
   private final ezy d;

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

   private btb(jq<btd> $$0, @Nullable bul $$1, @Nullable bul $$2, @Nullable ezy $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btb(jq<btd> $$0, @Nullable bul $$1, @Nullable bul $$2) {
      this($$0, $$1, $$2, null);
   }

   public btb(jq<btd> $$0, ezy $$1) {
      this($$0, null, null, $$1);
   }

   public btb(jq<btd> $$0, @Nullable bul $$1) {
      this($$0, $$1, $$1);
   }

   public btb(jq<btd> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bul c() {
      return this.c;
   }

   @Nullable
   public bul d() {
      return this.b;
   }

   @Nullable
   public cwm e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public xj a(bvh $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvh $$5 = $$0.eQ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xj.a($$6, $$0.o_(), $$5.o_()) : xj.a($$1, $$0.o_());
      } else {
         xj $$2 = this.b == null ? this.c.o_() : this.b.o_();
         cwm $$4 = this.b instanceof bvh $$3 ? $$3.eX() : cwm.k;
         return !$$4.f() && $$4.b(ku.g) ? xj.a($$1 + ".item", $$0.o_(), $$2, $$4.J()) : xj.a($$1, $$0.o_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvh && !(this.b instanceof cou);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cou $$0 && $$0.gh().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ezy i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public ezy j() {
      return this.d;
   }

   public boolean a(axs<btd> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ali<btd> $$0) {
      return this.a.a($$0);
   }

   public btd k() {
      return this.a.a();
   }

   public jq<btd> l() {
      return this.a;
   }
}
