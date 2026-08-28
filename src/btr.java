import javax.annotation.Nullable;

public class btr {
   private final jq<btt> a;
   @Nullable
   private final bvb b;
   @Nullable
   private final bvb c;
   @Nullable
   private final fbr d;

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

   private btr(jq<btt> $$0, @Nullable bvb $$1, @Nullable bvb $$2, @Nullable fbr $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btr(jq<btt> $$0, @Nullable bvb $$1, @Nullable bvb $$2) {
      this($$0, $$1, $$2, null);
   }

   public btr(jq<btt> $$0, fbr $$1) {
      this($$0, null, null, $$1);
   }

   public btr(jq<btt> $$0, @Nullable bvb $$1) {
      this($$0, $$1, $$1);
   }

   public btr(jq<btt> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bvb c() {
      return this.c;
   }

   @Nullable
   public bvb d() {
      return this.b;
   }

   @Nullable
   public cxg e() {
      return this.c != null ? this.c.ea() : null;
   }

   public xk a(bvx $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bvx $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xk.a($$6, $$0.p_(), $$5.p_()) : xk.a($$1, $$0.p_());
      } else {
         xk $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cxg $$4 = this.b instanceof bvx $$3 ? $$3.eZ() : cxg.j;
         return !$$4.f() && $$4.b(ku.g) ? xk.a($$1 + ".item", $$0.p_(), $$2, $$4.K()) : xk.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bvx && !(this.b instanceof cpo);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cpo $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fbr i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.du() : null;
      }
   }

   @Nullable
   public fbr j() {
      return this.d;
   }

   public boolean a(aya<btt> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alo<btt> $$0) {
      return this.a.a($$0);
   }

   public btt k() {
      return this.a.a();
   }

   public jq<btt> l() {
      return this.a;
   }
}
