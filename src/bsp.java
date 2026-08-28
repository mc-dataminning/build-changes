import javax.annotation.Nullable;

public class bsp {
   private final jp<bsr> a;
   @Nullable
   private final btz b;
   @Nullable
   private final btz c;
   @Nullable
   private final ezh d;

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

   private bsp(jp<bsr> $$0, @Nullable btz $$1, @Nullable btz $$2, @Nullable ezh $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsp(jp<bsr> $$0, @Nullable btz $$1, @Nullable btz $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsp(jp<bsr> $$0, ezh $$1) {
      this($$0, null, null, $$1);
   }

   public bsp(jp<bsr> $$0, @Nullable btz $$1) {
      this($$0, $$1, $$1);
   }

   public bsp(jp<bsr> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public btz c() {
      return this.c;
   }

   @Nullable
   public btz d() {
      return this.b;
   }

   @Nullable
   public cvx e() {
      return this.c != null ? this.c.eb() : null;
   }

   public xh a(buv $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         buv $$5 = $$0.eU();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xh.a($$6, $$0.S_(), $$5.S_()) : xh.a($$1, $$0.S_());
      } else {
         xh $$2 = this.b == null ? this.c.S_() : this.b.S_();
         cvx $$4 = this.b instanceof buv $$3 ? $$3.fb() : cvx.k;
         return !$$4.f() && $$4.b(kt.g) ? xh.a($$1 + ".item", $$0.S_(), $$2, $$4.J()) : xh.a($$1, $$0.S_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof buv && !(this.b instanceof coh);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof coh $$0 && $$0.gl().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ezh i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dv() : null;
      }
   }

   @Nullable
   public ezh j() {
      return this.d;
   }

   public boolean a(axp<bsr> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alg<bsr> $$0) {
      return this.a.a($$0);
   }

   public bsr k() {
      return this.a.a();
   }

   public jp<bsr> l() {
      return this.a;
   }
}
