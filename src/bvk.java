import javax.annotation.Nullable;

public class bvk {
   private final jg<bvm> a;
   @Nullable
   private final bwv b;
   @Nullable
   private final bwv c;
   @Nullable
   private final ffs d;

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

   private bvk(jg<bvm> $$0, @Nullable bwv $$1, @Nullable bwv $$2, @Nullable ffs $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bvk(jg<bvm> $$0, @Nullable bwv $$1, @Nullable bwv $$2) {
      this($$0, $$1, $$2, null);
   }

   public bvk(jg<bvm> $$0, ffs $$1) {
      this($$0, null, null, $$1);
   }

   public bvk(jg<bvm> $$0, @Nullable bwv $$1) {
      this($$0, $$1, $$1);
   }

   public bvk(jg<bvm> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwv c() {
      return this.c;
   }

   @Nullable
   public bwv d() {
      return this.b;
   }

   @Nullable
   public daa e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public xc a(bxw $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bxw $$5 = $$0.eT();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xc.a($$6, $$0.m_(), $$5.m_()) : xc.a($$1, $$0.m_());
      } else {
         xc $$2 = this.b == null ? this.c.m_() : this.b.m_();
         daa $$4 = this.b instanceof bxw $$3 ? $$3.fb() : daa.k;
         return !$$4.f() && $$4.c(kl.g) ? xc.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : xc.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bxw && !(this.b instanceof crz);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof crz $$0 && $$0.gk().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ffs i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public ffs j() {
      return this.d;
   }

   public boolean a(axv<bvm> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alj<bvm> $$0) {
      return this.a.a($$0);
   }

   public bvm k() {
      return this.a.a();
   }

   public jg<bvm> l() {
      return this.a;
   }
}
