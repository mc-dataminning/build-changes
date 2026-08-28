import javax.annotation.Nullable;

public class buh {
   private final js<buj> a;
   @Nullable
   private final bvs b;
   @Nullable
   private final bvs c;
   @Nullable
   private final fcu d;

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

   private buh(js<buj> $$0, @Nullable bvs $$1, @Nullable bvs $$2, @Nullable fcu $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public buh(js<buj> $$0, @Nullable bvs $$1, @Nullable bvs $$2) {
      this($$0, $$1, $$2, null);
   }

   public buh(js<buj> $$0, fcu $$1) {
      this($$0, null, null, $$1);
   }

   public buh(js<buj> $$0, @Nullable bvs $$1) {
      this($$0, $$1, $$1);
   }

   public buh(js<buj> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bvs c() {
      return this.c;
   }

   @Nullable
   public bvs d() {
      return this.b;
   }

   @Nullable
   public cxy e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wv a(bwr $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bwr $$5 = $$0.eS();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wv.a($$6, $$0.m_(), $$5.m_()) : wv.a($$1, $$0.m_());
      } else {
         wv $$2 = this.b == null ? this.c.m_() : this.b.m_();
         cxy $$4 = this.b instanceof bwr $$3 ? $$3.fa() : cxy.k;
         return !$$4.f() && $$4.c(kx.g) ? wv.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : wv.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bwr && !(this.b instanceof cqi);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cqi $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fcu i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fcu j() {
      return this.d;
   }

   public boolean a(axp<buj> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alc<buj> $$0) {
      return this.a.a($$0);
   }

   public buj k() {
      return this.a.a();
   }

   public js<buj> l() {
      return this.a;
   }
}
