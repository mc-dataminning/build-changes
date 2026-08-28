import javax.annotation.Nullable;

public class btz {
   private final jq<bub> a;
   @Nullable
   private final bvj b;
   @Nullable
   private final bvj c;
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

   private btz(jq<bub> $$0, @Nullable bvj $$1, @Nullable bvj $$2, @Nullable fbx $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public btz(jq<bub> $$0, @Nullable bvj $$1, @Nullable bvj $$2) {
      this($$0, $$1, $$2, null);
   }

   public btz(jq<bub> $$0, fbx $$1) {
      this($$0, null, null, $$1);
   }

   public btz(jq<bub> $$0, @Nullable bvj $$1) {
      this($$0, $$1, $$1);
   }

   public btz(jq<bub> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bvj c() {
      return this.c;
   }

   @Nullable
   public bvj d() {
      return this.b;
   }

   @Nullable
   public cxo e() {
      return this.c != null ? this.c.ea() : null;
   }

   public xv a(bwf $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bwf $$5 = $$0.eR();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xv.a($$6, $$0.p_(), $$5.p_()) : xv.a($$1, $$0.p_());
      } else {
         xv $$2 = this.b == null ? this.c.p_() : this.b.p_();
         cxo $$4 = this.b instanceof bwf $$3 ? $$3.eZ() : cxo.j;
         return !$$4.f() && $$4.b(ku.g) ? xv.a($$1 + ".item", $$0.p_(), $$2, $$4.J()) : xv.a($$1, $$0.p_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bwf && !(this.b instanceof cpw);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof cpw $$0 && $$0.gj().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public fbx i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.du() : null;
      }
   }

   @Nullable
   public fbx j() {
      return this.d;
   }

   public boolean a(ayk<bub> $$0) {
      return this.a.a($$0);
   }

   public boolean a(aly<bub> $$0) {
      return this.a.a($$0);
   }

   public bub k() {
      return this.a.a();
   }

   public jq<bub> l() {
      return this.a;
   }
}
