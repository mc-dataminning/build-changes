import javax.annotation.Nullable;

public class bsu {
   private final jq<bsw> a;
   @Nullable
   private final bue b;
   @Nullable
   private final bue c;
   @Nullable
   private final ezn d;

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

   private bsu(jq<bsw> $$0, @Nullable bue $$1, @Nullable bue $$2, @Nullable ezn $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public bsu(jq<bsw> $$0, @Nullable bue $$1, @Nullable bue $$2) {
      this($$0, $$1, $$2, null);
   }

   public bsu(jq<bsw> $$0, ezn $$1) {
      this($$0, null, null, $$1);
   }

   public bsu(jq<bsw> $$0, @Nullable bue $$1) {
      this($$0, $$1, $$1);
   }

   public bsu(jq<bsw> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bue c() {
      return this.c;
   }

   @Nullable
   public bue d() {
      return this.b;
   }

   @Nullable
   public cwb e() {
      return this.c != null ? this.c.eb() : null;
   }

   public xi a(bva $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         bva $$5 = $$0.eU();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xi.a($$6, $$0.S_(), $$5.S_()) : xi.a($$1, $$0.S_());
      } else {
         xi $$2 = this.b == null ? this.c.S_() : this.b.S_();
         cwb $$4 = this.b instanceof bva $$3 ? $$3.fb() : cwb.k;
         return !$$4.f() && $$4.b(ku.g) ? xi.a($$1 + ".item", $$0.S_(), $$2, $$4.J()) : xi.a($$1, $$0.S_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof bva && !(this.b instanceof com);
         case c -> true;
      };
   }

   public boolean h() {
      if (this.d() instanceof com $$0 && $$0.gl().d) {
         return true;
      }

      return false;
   }

   @Nullable
   public ezn i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dv() : null;
      }
   }

   @Nullable
   public ezn j() {
      return this.d;
   }

   public boolean a(axq<bsw> $$0) {
      return this.a.a($$0);
   }

   public boolean a(alh<bsw> $$0) {
      return this.a.a($$0);
   }

   public bsw k() {
      return this.a.a();
   }

   public jq<bsw> l() {
      return this.a;
   }
}
