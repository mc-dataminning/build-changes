import javax.annotation.Nullable;

public class bux {
   private final jf<buz> a;
   @Nullable
   private final bwi b;
   @Nullable
   private final bwi c;
   @Nullable
   private final ffc d;

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

   private bux(jf<buz> $$0, @Nullable bwi $$1, @Nullable bwi $$2, @Nullable ffc $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bux(jf<buz> $$0, @Nullable bwi $$1, @Nullable bwi $$2) {
      this($$0, $$1, $$2, null);
   }

   public bux(jf<buz> $$0, ffc $$1) {
      this($$0, null, null, $$1);
   }

   public bux(jf<buz> $$0, @Nullable bwi $$1) {
      this($$0, $$1, $$1);
   }

   public bux(jf<buz> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwi c() {
      return this.c;
   }

   @Nullable
   public bwi d() {
      return this.b;
   }

   @Nullable
   public czn e() {
      return this.c != null ? this.c.dY() : null;
   }

   public wy a(bxj $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bxj $$5 = $$0.eS();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wy.a($$6, $$0.m_(), $$5.m_()) : wy.a($$1, $$0.m_());
      } else {
         wy $$2 = this.b == null ? this.c.m_() : this.b.m_();
         czn $$4 = this.b instanceof bxj $$3 ? $$3.fa() : czn.k;
         return !$$4.f() && $$4.c(kk.g) ? wy.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : wy.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bxj && !(this.b instanceof crm);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof crm $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ffc i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.ds() : null;
      }
   }

   @Nullable
   public ffc j() {
      return this.d;
   }

   public boolean a(axr<buz> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alf<buz> $$0) {
      return this.a.a($$0);
   }

   public buz k() {
      return this.a.a();
   }

   public jf<buz> l() {
      return this.a;
   }
}
