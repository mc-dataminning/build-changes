import javax.annotation.Nullable;

public class buu {
   private final je<buw> a;
   @Nullable
   private final bwf b;
   @Nullable
   private final bwf c;
   @Nullable
   private final feq d;

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

   private buu(je<buw> $$0, @Nullable bwf $$1, @Nullable bwf $$2, @Nullable feq $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public buu(je<buw> $$0, @Nullable bwf $$1, @Nullable bwf $$2) {
      this($$0, $$1, $$2, null);
   }

   public buu(je<buw> $$0, feq $$1) {
      this($$0, null, null, $$1);
   }

   public buu(je<buw> $$0, @Nullable bwf $$1) {
      this($$0, $$1, $$1);
   }

   public buu(je<buw> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwf c() {
      return this.c;
   }

   @Nullable
   public bwf d() {
      return this.b;
   }

   @Nullable
   public czd e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wy a(bxe $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bxe $$5 = $$0.eT();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wy.a($$6, $$0.m_(), $$5.m_()) : wy.a($$1, $$0.m_());
      } else {
         wy $$2 = this.b == null ? this.c.m_() : this.b.m_();
         czd $$4 = this.b instanceof bxe $$3 ? $$3.fb() : czd.k;
         return !$$4.f() && $$4.c(kj.g) ? wy.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : wy.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bxe && !(this.b instanceof crc);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof crc $$0 && $$0.gk().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public feq i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public feq j() {
      return this.d;
   }

   public boolean a(axr<buw> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alf<buw> $$0) {
      return this.a.a($$0);
   }

   public buw k() {
      return this.a.a();
   }

   public je<buw> l() {
      return this.a;
   }
}
