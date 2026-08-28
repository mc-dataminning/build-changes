import javax.annotation.Nullable;

public class bup {
   private final je<bur> a;
   @Nullable
   private final bwa b;
   @Nullable
   private final bwa c;
   @Nullable
   private final fdw d;

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

   private bup(je<bur> $$0, @Nullable bwa $$1, @Nullable bwa $$2, @Nullable fdw $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bup(je<bur> $$0, @Nullable bwa $$1, @Nullable bwa $$2) {
      this($$0, $$1, $$2, null);
   }

   public bup(je<bur> $$0, fdw $$1) {
      this($$0, null, null, $$1);
   }

   public bup(je<bur> $$0, @Nullable bwa $$1) {
      this($$0, $$1, $$1);
   }

   public bup(je<bur> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bwa c() {
      return this.c;
   }

   @Nullable
   public bwa d() {
      return this.b;
   }

   @Nullable
   public cys e() {
      return this.c != null ? this.c.dZ() : null;
   }

   public ww a(bwz $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bwz $$5 = $$0.eS();
         String $$6 = $$1 + ".player";
         return $$5 != null ? ww.a($$6, $$0.m_(), $$5.m_()) : ww.a($$1, $$0.m_());
      } else {
         ww $$2 = this.b == null ? this.c.m_() : this.b.m_();
         cys $$4 = this.b instanceof bwz $$3 ? $$3.fa() : cys.k;
         return !$$4.f() && $$4.c(kj.g) ? ww.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : ww.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bwz && !(this.b instanceof cqs);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cqs $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fdw i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dt() : null;
      }
   }

   @Nullable
   public fdw j() {
      return this.d;
   }

   public boolean a(axp<bur> $$0) {
      return this.a.a($$0);
   }

   public boolean a(ald<bur> $$0) {
      return this.a.a($$0);
   }

   public bur k() {
      return this.a.a();
   }

   public je<bur> l() {
      return this.a;
   }
}
