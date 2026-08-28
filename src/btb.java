import javax.annotation.Nullable;

public class btb {
   private final jr<btd> a;
   @Nullable
   private final bul b;
   @Nullable
   private final bul c;
   @Nullable
   private final fba d;

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

   private btb(jr<btd> $$0, @Nullable bul $$1, @Nullable bul $$2, @Nullable fba $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btb(jr<btd> $$0, @Nullable bul $$1, @Nullable bul $$2) {
      this($$0, $$1, $$2, null);
   }

   public btb(jr<btd> $$0, fba $$1) {
      this($$0, null, null, $$1);
   }

   public btb(jr<btd> $$0, @Nullable bul $$1) {
      this($$0, $$1, $$1);
   }

   public btb(jr<btd> $$0) {
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
   public cwp e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wp a(bvh $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvh $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wp.a($$6, $$0.p_(), $$5.p_()) : wp.a($$1, $$0.p_());
      } else {
         wp $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cwp $$4 = this.b instanceof bvh $$3 ? $$3.eZ() : cwp.j;
         return !$$4.f() && $$4.b(kv.g) ? wp.a($$1 + ".item", $$0.p_(), $$2, $$4.K()) : wp.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvh && !(this.b instanceof cox);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cox $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fba i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fba j() {
      return this.d;
   }

   public boolean a(axf<btd> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aku<btd> $$0) {
      return this.a.a($$0);
   }

   public btd k() {
      return this.a.a();
   }

   public jr<btd> l() {
      return this.a;
   }
}
