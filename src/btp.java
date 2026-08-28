import javax.annotation.Nullable;

public class btp {
   private final jr<btr> a;
   @Nullable
   private final bva b;
   @Nullable
   private final bva c;
   @Nullable
   private final fbx d;

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

   private btp(jr<btr> $$0, @Nullable bva $$1, @Nullable bva $$2, @Nullable fbx $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btp(jr<btr> $$0, @Nullable bva $$1, @Nullable bva $$2) {
      this($$0, $$1, $$2, null);
   }

   public btp(jr<btr> $$0, fbx $$1) {
      this($$0, null, null, $$1);
   }

   public btp(jr<btr> $$0, @Nullable bva $$1) {
      this($$0, $$1, $$1);
   }

   public btp(jr<btr> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bva c() {
      return this.c;
   }

   @Nullable
   public bva d() {
      return this.b;
   }

   @Nullable
   public cxh e() {
      return this.c != null ? this.c.dY() : null;
   }

   public wp a(bvy $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvy $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? wp.a($$6, $$0.m_(), $$5.m_()) : wp.a($$1, $$0.m_());
      } else {
         wp $$2 = this.b == null ? this.c.m_() : this.b.m_();
         cxh $$4 = this.b instanceof bvy $$3 ? $$3.eZ() : cxh.k;
         return !$$4.f() && $$4.b(kv.g) ? wp.a($$1 + ".item", $$0.m_(), $$2, $$4.K()) : wp.a($$1, $$0.m_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvy && !(this.b instanceof cpr);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cpr $$0 && $$0.gm().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fbx i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.ds() : null;
      }
   }

   @Nullable
   public fbx j() {
      return this.d;
   }

   public boolean a(axf<btr> $$0) {
      return this.a.a($$0);
   }

   public boolean a(akt<btr> $$0) {
      return this.a.a($$0);
   }

   public btr k() {
      return this.a.a();
   }

   public jr<btr> l() {
      return this.a;
   }
}
