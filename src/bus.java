import javax.annotation.Nullable;

public class bus {
   private final je<buu> a;
   @Nullable
   private final bwd b;
   @Nullable
   private final bwd c;
   @Nullable
   private final fei d;

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

   private bus(je<buu> $$0, @Nullable bwd $$1, @Nullable bwd $$2, @Nullable fei $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bus(je<buu> $$0, @Nullable bwd $$1, @Nullable bwd $$2) {
      this($$0, $$1, $$2, null);
   }

   public bus(je<buu> $$0, fei $$1) {
      this($$0, null, null, $$1);
   }

   public bus(je<buu> $$0, @Nullable bwd $$1) {
      this($$0, $$1, $$1);
   }

   public bus(je<buu> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwd c() {
      return this.c;
   }

   @Nullable
   public bwd d() {
      return this.b;
   }

   @Nullable
   public cyy e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public wy a(bxc $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bxc $$5 = $$0.eS();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wy.a($$6, $$0.m_(), $$5.m_()) : wy.a($$1, $$0.m_());
      } else {
         wy $$2 = this.b == null ? this.c.m_() : this.b.m_();
         cyy $$4 = this.b instanceof bxc $$3 ? $$3.fa() : cyy.k;
         return !$$4.f() && $$4.c(kj.g) ? wy.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : wy.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bxc && !(this.b instanceof cqy);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cqy $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fei i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fei j() {
      return this.d;
   }

   public boolean a(axr<buu> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alf<buu> $$0) {
      return this.a.a($$0);
   }

   public buu k() {
      return this.a.a();
   }

   public je<buu> l() {
      return this.a;
   }
}
