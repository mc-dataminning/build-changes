import javax.annotation.Nullable;

public class bvi {
   private final jf<bvk> a;
   @Nullable
   private final bwt b;
   @Nullable
   private final bwt c;
   @Nullable
   private final ffq d;

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

   private bvi(jf<bvk> $$0, @Nullable bwt $$1, @Nullable bwt $$2, @Nullable ffq $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bvi(jf<bvk> $$0, @Nullable bwt $$1, @Nullable bwt $$2) {
      this($$0, $$1, $$2, null);
   }

   public bvi(jf<bvk> $$0, ffq $$1) {
      this($$0, null, null, $$1);
   }

   public bvi(jf<bvk> $$0, @Nullable bwt $$1) {
      this($$0, $$1, $$1);
   }

   public bvi(jf<bvk> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwt c() {
      return this.c;
   }

   @Nullable
   public bwt d() {
      return this.b;
   }

   @Nullable
   public czy e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public xa a(bxu $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bxu $$5 = $$0.eT();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xa.a($$6, $$0.m_(), $$5.m_()) : xa.a($$1, $$0.m_());
      } else {
         xa $$2 = this.b == null ? this.c.m_() : this.b.m_();
         czy $$4 = this.b instanceof bxu $$3 ? $$3.fb() : czy.k;
         return !$$4.f() && $$4.c(kk.g) ? xa.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : xa.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bxu && !(this.b instanceof crx);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof crx $$0 && $$0.gk().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ffq i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public ffq j() {
      return this.d;
   }

   public boolean a(axt<bvk> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alh<bvk> $$0) {
      return this.a.a($$0);
   }

   public bvk k() {
      return this.a.a();
   }

   public jf<bvk> l() {
      return this.a;
   }
}
