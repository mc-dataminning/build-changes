import javax.annotation.Nullable;

public class bua {
   private final jq<buc> a;
   @Nullable
   private final bvk b;
   @Nullable
   private final bvk c;
   @Nullable
   private final fby d;

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

   private bua(jq<buc> $$0, @Nullable bvk $$1, @Nullable bvk $$2, @Nullable fby $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bua(jq<buc> $$0, @Nullable bvk $$1, @Nullable bvk $$2) {
      this($$0, $$1, $$2, null);
   }

   public bua(jq<buc> $$0, fby $$1) {
      this($$0, null, null, $$1);
   }

   public bua(jq<buc> $$0, @Nullable bvk $$1) {
      this($$0, $$1, $$1);
   }

   public bua(jq<buc> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bvk c() {
      return this.c;
   }

   @Nullable
   public bvk d() {
      return this.b;
   }

   @Nullable
   public cxp e() {
      return this.c != null ? this.c.ea() : null;
   }

   public xv a(bwg $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bwg $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xv.a($$6, $$0.p_(), $$5.p_()) : xv.a($$1, $$0.p_());
      } else {
         xv $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cxp $$4 = this.b instanceof bwg $$3 ? $$3.eZ() : cxp.j;
         return !$$4.f() && $$4.b(ku.g) ? xv.a($$1 + ".item", $$0.p_(), $$2, $$4.J()) : xv.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bwg && !(this.b instanceof cpx);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cpx $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fby i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.du() : null;
      }
   }

   @Nullable
   public fby j() {
      return this.d;
   }

   public boolean a(ayk<buc> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aly<buc> $$0) {
      return this.a.a($$0);
   }

   public buc k() {
      return this.a.a();
   }

   public jq<buc> l() {
      return this.a;
   }
}
